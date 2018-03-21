package com.ultimate.ekbms.action;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.highlight.Fragmenter;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.InvalidTokenOffsetsException;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.search.highlight.SimpleSpanFragmenter;
import org.apache.lucene.search.highlight.TokenSources;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ultimate.ekbms.util.FileModel;
import com.ultimate.ekbms.util.IKAnalyzer6x;

public class SearchAction extends ActionSupport{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private String query;  //接收查询字符串

		//搜索关键字;
		public String execute() throws Exception{
			//索引路径
			HttpServletRequest request=ServletActionContext.getRequest();
			String indexpathStr = request.getServletContext().getRealPath("/indexdir");
			//编码转化;
			query = new String(query.getBytes("UTF-8"), "UTF-8");
			if (query.equals("") || query == null) {
				System.out.println("参数错误!");
				return ERROR;
			} else {
				ArrayList<FileModel> hitsList = getTopDoc(query, indexpathStr,100);
				System.out.println("共搜到:" + hitsList.size() + "条数据!");
				request.setAttribute("hitsList", hitsList);
				request.setAttribute("queryback", query);
				return SUCCESS;
			}
		}
		
		public static ArrayList<FileModel> getTopDoc(String key, String indexpathStr,int N) {
			ArrayList<FileModel> hitsList = new ArrayList<FileModel>();
			//检索域
			String[] fields = { "title", "content" };
			Path indexPath = Paths.get(indexpathStr);
			Directory dir;
			try {
				dir = FSDirectory.open(indexPath);
				IndexReader reader = DirectoryReader.open(dir);
				IndexSearcher searcher = new IndexSearcher(reader);
				Analyzer analyzer = new IKAnalyzer6x();
				// QueryParser parser = new QueryParser(field, analyzer);
				MultiFieldQueryParser parser2 = new MultiFieldQueryParser(fields, analyzer);
				// 查询字符串
				Query query = parser2.parse(key);
				TopDocs topDocs = searcher.search(query, N);
				// 定制高亮标签
				SimpleHTMLFormatter fors = new SimpleHTMLFormatter("<span class=\"blue-word\">", "</span>");
				QueryScorer scoreTitle = new QueryScorer(query, fields[0]);
				Highlighter hlqTitle = new Highlighter(fors, scoreTitle);// 高亮分析器
				QueryScorer scoreContent = new QueryScorer(query, fields[0]);
				Highlighter hlqContent = new Highlighter(fors, scoreTitle);// 高亮分析器
				TopDocs hits = searcher.search(query, 100);
				for (ScoreDoc sd : topDocs.scoreDocs) {
					Document doc = searcher.doc(sd.doc);
					String title = doc.get("title");
					String content = doc.get("content");
					TokenStream tokenStream = TokenSources.getAnyTokenStream(searcher.getIndexReader(), sd.doc, fields[0],new IKAnalyzer6x());                // 获取tokenstream
					Fragmenter fragment = new SimpleSpanFragmenter(scoreTitle);
					hlqTitle.setTextFragmenter(fragment);
					String hl_title = hlqTitle.getBestFragment(tokenStream, title);// 获取高亮的片段，可以对其数量进行限制
					tokenStream = TokenSources.getAnyTokenStream(searcher.getIndexReader(), sd.doc, fields[1],
							new IKAnalyzer6x());
					fragment = new SimpleSpanFragmenter(scoreContent);
					hlqContent.setTextFragmenter(fragment);
					String hl_content = hlqTitle.getBestFragment(tokenStream, content);// 获取高亮的片段，可以对其数量进行限制
					FileModel fm = new FileModel(hl_title != null ? hl_title : title,
							hl_content != null ? hl_content : content);
					hitsList.add(fm);
				}
				dir.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			} catch (InvalidTokenOffsetsException e) {
				e.printStackTrace();
			}
			return hitsList;
		}

		
		public String getQuery() {
			return query;
		}

		public void setQuery(String query) {
			this.query = query;
		}
		
}
