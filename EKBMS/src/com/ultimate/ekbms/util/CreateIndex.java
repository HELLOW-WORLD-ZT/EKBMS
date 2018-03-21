package com.ultimate.ekbms.util;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.index.IndexOptions;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;

import com.ultimate.ekbms.dao.FileDetailInfoDAOImpl;


public class CreateIndex {

	public static void main(String[] args) throws Exception {
		// IK�ִ�������
		Analyzer analyzer = new IKAnalyzer6x();
		IndexWriterConfig icw = new IndexWriterConfig(analyzer);
		icw.setOpenMode(OpenMode.CREATE);
		Directory dir = null;
		IndexWriter inWriter = null;
		Path indexPath = Paths.get("WebRoot/indexdir");
		
		//id���������洢;
		FieldType idType=new FieldType();
		idType.setIndexOptions(IndexOptions.DOCS);
		idType.setStored(true);
		
		//�ı����������洢;
		FieldType fileType = new FieldType();
		fileType.setIndexOptions(IndexOptions.DOCS_AND_FREQS_AND_POSITIONS_AND_OFFSETS);
		fileType.setStored(true);
		fileType.setTokenized(true);
		fileType.setStoreTermVectors(true);
		fileType.setStoreTermVectorPositions(true);
		fileType.setStoreTermVectorOffsets(true);
		Date start = new Date();// ��ʼʱ��
		if (!Files.isReadable(indexPath)) {
			System.out.println(indexPath.toAbsolutePath() + "�����ڻ��߲��ɶ�������!");
			System.exit(1);
		}
		dir = FSDirectory.open(indexPath);
		inWriter = new IndexWriter(dir, icw);
		ArrayList<FileModel> fileList = (ArrayList<FileModel>) extractFile();
		FileDetailInfoDAOImpl file_dao=new FileDetailInfoDAOImpl();
		
		// ����fileList,��������;
		for (FileModel f : fileList) {
			int id=file_dao.addFileByIndex(f.getTitle(), f.getPath());  //���ļ���ӵ����ݿ���,��ȡ�ø��ļ���Ӧ��id��;
			Document doc = new Document();
			doc.add(new Field("id", String.valueOf(id), idType));
			doc.add(new Field("title", f.getTitle(), fileType));
			doc.add(new Field("content", f.getContent(), fileType));
			inWriter.addDocument(doc);
		}

		inWriter.commit();
		inWriter.close();
		dir.close();

		Date end = new Date();// ����ʱ��
		// ��ӡ������ʱ
		System.out.println("�����ĵ����,����ʱ:" + (end.getTime() - start.getTime()) + "����.");
	}

	/*
	 * ����:�г�F:/file_baseĿ¼�µ��������ļ� ����:�� ����ֵ:FileModel���͵��б�
	 */
	public static List<FileModel> extractFile() throws Exception {

		ArrayList<FileModel> list = new ArrayList<FileModel>();
		File fileDir = new File("F:/file_base");
		if (!fileDir.exists()) {
			System.out.println("�ļ���·������!");
		}
		File[] allFiles = fileDir.listFiles();

		for (File f : allFiles) {
			FileModel sf = new FileModel(f.getName(), parserFile(f),f.getAbsolutePath());
			list.add(sf);
		}
		return list;
	}

	/*
	 * ����:ʹ��Tika��ȡ�ļ����� �������ļ����� ����ֵ: String��ʽ���ĵ�����
	 */
	public static String parserFile(File file) throws Exception {
		String fileContent = "";// �����ĵ�����
		BodyContentHandler handler = new BodyContentHandler();
		Parser parser = new AutoDetectParser();// �Զ��������ӿ�
		Metadata metadata = new Metadata();
		FileInputStream inputStream;
			inputStream = new FileInputStream(file);
			ParseContext context = new ParseContext();
			parser.parse(inputStream, handler, metadata, context);
			fileContent = handler.toString();

		return fileContent;
	}
}
