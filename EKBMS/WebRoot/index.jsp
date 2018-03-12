<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> 企业知识库 - 首页 </title>
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link href="css/home.css" rel="stylesheet" />
		<script type="text/javascript">
			function init(){
				$.get("loadUserInfoAction",function(data,status){})
				alert(data);
				return false;
			}
		</script>
	</head>

	<body onload="init()">
		<s:include value="head.jsp"></s:include>
		<!-- banner -->
		<div id="myCarousel" class="carousel slide">
			<!-- 轮播（Carousel）指标 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
			</ol>
			<!-- 轮播（Carousel）项目 -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="img/1512440732674_674.jpg" alt="First slide" class="img-responsive">
				</div>
				<div class="item">
					<img src="img/1513048034943_943.png" alt="Second slide" class="img-responsive">
				</div>
			</div>
		</div>

		<!-- 热门分类  -->
		<div class="container" style="padding-top: 10px; padding-bottom:10px;background: white;">
			<div class="row">
				<div class="col-md-3">
					<div class="contents">
						<h4>金融</h4>
						<ul>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
						</ul>
					</div>
				</div>
				<div class="col-md-3">
					<div class="contents">
						<h4>金融</h4>
						<ul>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
						</ul>
					</div>
				</div>
				<div class="col-md-3">
					<div class="contents">
						<h4>金融</h4>
						<ul>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
						</ul>
					</div>
				</div>
				<div class="col-md-3">
					<div class="contents">
						<h4>金融</h4>
						<ul>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
							<a href="#">
								<li>货币金融学</li>
							</a>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- end 热门分类  -->

		<!-- 热门知识结构 -->
		<div style="width: 100%;background: #EDF1F5;box-shadow:0px 0px 1px rgba(0, 0, 0, 0.349019607843137);padding-top: 10px; padding-bottom: 10px; margin-top: 5px;margin-bottom: 5px;">
			<div class="container">
				<h3 style="text-align: center;font-family:'microsoft yahei' ">热门知识结构</h3>
				<div class="row">
					<div class="col-md-4">
						<div class="knlg-struct">
							<img src="img/1453169124795_795.jpg" style="width: 100%; height: auto;" />
							<a href="#">
								<h4>微观经济学</h4></a>
							<p class="text-center"> 256 <span class="text-muted">关注者 </span> &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; | &nbsp; &nbsp; &nbsp; 24 <span class="text-muted">关联知识</span></p>
							<div style="text-align: center; margin-top: 15px;">
								<button class="btn btn-defualt btn-sm btn-view">查看知识结构</button>
							</div>

						</div>
					</div>
					<div class="col-md-4">
						<div class="knlg-struct">
							<img src="img/1490351555635_635.jpg" style="width: 100%; height: auto;" />
							<a href="#">
								<h4>微观经济学</h4></a>
							<p class="text-center"> 256 <span class="text-muted">关注者 </span> &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; | &nbsp; &nbsp; &nbsp; 24 <span class="text-muted">关联知识</span></p>
							<div style="text-align: center; margin-top: 15px;"><button class="btn btn-defualt btn-sm btn-view">查看知识结构</button></div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="knlg-struct">
							<img src="img/1453701371793_793.jpg" style="width: 100%; height: auto;" />
							<a href="#">
								<h4>微观经济学</h4></a>
							<p class="text-center"> 256 <span class="text-muted">关注者 </span> &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; | &nbsp; &nbsp; &nbsp; 24 <span class="text-muted">关联知识</span></p>
							<div style="text-align: center; margin-top: 15px;"><button class="btn btn-defualt btn-sm btn-view">查看知识结构</button></div>

						</div>
					</div>
					<div class="col-md-4">
						<div class="knlg-struct">
							<img src="img/1453169124795_795.jpg" style="width: 100%; height: auto;" />
							<a href="#">
								<h4>微观经济学</h4></a>
							<p class="text-center"> 256 <span class="text-muted">关注者 </span> &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; | &nbsp; &nbsp; &nbsp; 24 <span class="text-muted">关联知识</span></p>
							<div style="text-align: center; margin-top: 15px;"><button class="btn btn-defualt btn-sm btn-view">查看知识结构</button></div>

						</div>
					</div>
					<div class="col-md-4">
						<div class="knlg-struct">
							<img src="img/1490586140409_409.jpg" style="width: 100%; height: auto;" />
							<a href="#">
								<h4>微观经济学</h4></a>
							<p class="text-center"> 256 <span class="text-muted">关注者 </span> &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; | &nbsp; &nbsp; &nbsp; 24 <span class="text-muted">关联知识</span></p>
							<div style="text-align: center; margin-top: 15px;"><button class="btn btn-defualt btn-sm btn-view">查看知识结构</button></div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="knlg-struct">
							<img src="img/1490788422613_613.jpg" style="width: 100%; height: auto;" />
							<a href="#">
								<h4>微观经济学</h4></a>
							<p class="text-center"> 256 <span class="text-muted">关注者 </span> &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; | &nbsp; &nbsp; &nbsp; 24 <span class="text-muted">关联知识</span></p>
							<div style="text-align: center; margin-top: 15px;"><button class="btn btn-defualt btn-sm btn-view">查看知识结构</button></div>
						</div>
					</div>
				</div>
				<!-- end container -->
				<div style="text-align: center; margin-top: 15px;">
					<a href="#" class="btn btn-default" style="padding: 5px 20px 5px 20px;color: #989898; font-family: 'microsoft yahei';">
						查看更多 <span class="glyphicon glyphicon-circle-arrow-right" style="color: #989898;"></span>
					</a>
				</div>
			</div>
		</div>
		<!-- end 热门知识结构 -->

		<!-- 热门学习路径 -->
		<div style="width: 100%;padding-top: 10px; padding-bottom: 20px; margin-top: 5px;margin-bottom: 5px;">
			<div class="container">
				<h3 style="text-align: center;font-family:'microsoft yahei' ">热门学习路径</h3>
				<div class="row">
					<div class="col-md-3">
						<div class="path">
							<div class="media">
								<a class="media-left" href="#">
									<img class="media-object" src="img/1455589744746_746.jpg" alt="媒体对象">
								</a>
								<div class="media-body">
									<p class="text-muted" ><small>创建者：曾祥</small></p>
									<p class="text-muted"><small>收录知识：28</small></p>
									<p class="text-muted"><small>学习人数：508</small></p>
								</div>
							</div>
							<hr style="margin-top: 10px; margin-bottom: 10px;">
							<a href="#"><h5 style="font-weight:bold; font-size: 15px; margin: 0;">信用管理——信用管理师必看</h5></a>
						</div>
					</div>
					<div class="col-md-3">
						<div class="path">
							<div class="media">
								<a class="media-left" href="#">
									<img class="media-object" src="img/1455589744746_746.jpg">
								</a>
								<div class="media-body">
									<p class="text-muted" ><small>创建者：曾祥</small></p>
									<p class="text-muted"><small>收录知识：28</small></p>
									<p class="text-muted"><small>学习人数：508</small></p>
								</div>
							</div>
							<hr style="margin-top: 10px; margin-bottom: 10px;">
							<a href="#"><h5 style="font-weight:bold; font-size: 15px; margin: 0;">信用管理——信用管理师必看</h5></a>
						</div>
					</div>
					<div class="col-md-3">
						<div class="path">
							<div class="media">
								<a class="media-left" href="#">
									<img class="media-object" src="img/1455589744746_746.jpg">
								</a>
								<div class="media-body">
									<p class="text-muted" ><small>创建者：曾祥</small></p>
									<p class="text-muted"><small>收录知识：28</small></p>
									<p class="text-muted"><small>学习人数：508</small></p>
								</div>
							</div>
							<hr style="margin-top: 10px; margin-bottom: 10px;">
							<a href="#"><h5 style="font-weight:bold; font-size: 15px; margin: 0;">信用管理——信用管理师必看</h5></a>
						</div>
					</div>
					<div class="col-md-3">
						<div class="path">
							<div class="media">
								<a class="media-left" href="#">
									<img class="media-object" src="img/1455589744746_746.jpg">
								</a>
								<div class="media-body">
									<p class="text-muted" ><small>创建者：曾祥</small></p>
									<p class="text-muted"><small>收录知识：28</small></p>
									<p class="text-muted"><small>学习人数：508</small></p>
								</div>
							</div>
							<hr style="margin-top: 10px; margin-bottom: 10px;">
							<a href="#"><h5 style="font-weight:bold; font-size: 15px; margin: 0;">信用管理——信用管理师必看</h5></a>
						</div>
					</div>
				</div>
			</div><!-- end container -->
		</div><!-- end 热门学习路径  -->
		
		
		<div style="width: 100%;background: #EDF1F5;box-shadow:0px 0px 1px rgba(0, 0, 0, 0.349019607843137);padding-top: 10px; padding-bottom: 10px; margin-top: 5px;">
			<h3 style="text-align: center;font-family:'microsoft yahei' ">文档悬赏</h3>
		</div>

	</body>

</html>