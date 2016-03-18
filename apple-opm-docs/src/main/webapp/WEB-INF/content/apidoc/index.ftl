<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>API中心</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="/Public/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
    @charset "utf-8";
	body {
		font:14px/1.5 "Microsoft Yahei","微软雅黑",Tahoma,Arial,Helvetica,STHeiti;
	}
    </style>
      <script type="text/javascript">
      var DocConfig = {
          host: window.location.origin,
          app: "/apidoc/",
          pubile:"/Public",
      }

      DocConfig.hostUrl = DocConfig.host + "/" + DocConfig.app;
      </script>

  </head>
  <body>
  <link rel="stylesheet" href="/Public/css/item/show.css" />


<div class="doc-head row" >
	<div class="left "><h2>API中心</h2></div>
	<!--
  	<div class="right">
		<ul class="inline pull-right">
  			<li><a href="/index.php/home/item/index">我的项目</a></li>
    	</ul>
    </div>
    -->  
  </div>
</div>

<div class="doc-body row">
	<!-- 左侧栏菜单 -->
    <div class="doc-left span3 bs-docs-sidebar pull-left">
    	<form class="form-search text-center" action="" method="get">
      		<div class="input-append search-input-append">
            	<i class="icon-blank"></i>
            	<input type="text" name="keyword" class="search-query search-query-input" value="${(keyword)!''}">
            	<input type="hidden" name="item_id" value="2">
            	<button type="submit" class="btn"><i class="icon-search"></i></button>
          	</div>
        </form>

      	<ul class="nav nav-list bs-docs-sidenav">
			
        	<li><a href="/apidoc/introduction" data-page-id="7"><i class="icon-blank"></i>序言</a></li>
        	<#list moduls as modul>
        	<li>
        		<a href="#"><i class="icon-chevron-right"></i>${(modul.modulName)!''}</a>
            	<ul class="child-ul nav-list hide">
            		<@api modulId=modul.id keyword=keyword>
						<#list apis as api>
							<li><a href="/apidoc/detail?page_id=${api.id}" data-page-id="${api.id}" >${(api.apiName)!''}</a></li>
						</#list>
					</@api>
              	</ul>
          	</li>
          	</#list>
          	<li>
          		<a href="#"><i class="icon-chevron-right"></i>数据字典示例</a>
            	<ul class="child-ul nav-list hide">
              		<li><a href="/index.php/home/page/index?page_id=15" data-page-id="15" >user</a></li>
              		<li><a href="/index.php/home/page/index?page_id=16" data-page-id="16" >page</a></li>
              		<li><a href="/index.php/home/page/index?page_id=17" data-page-id="17" >item</a></li>           
              	</ul>
          	</li>
      </ul>
      <!-- 新建栏 -->
      <div class="doc-left-newbar">

        
      </div>

      <input type="hidden" id="item_id" value="2">
      <input type="hidden" id="page_id" value="">
      <input type="hidden" id="base_url" value="/apidoc">


    </div>
    <div class="doc-right  span12 ">
 		<!-- 编辑栏 -->
      	<div class='page-edit-link pull-right hide'>
        	<ul class="inline">
            	<li></li>
            	<li></li>        
            </ul>
      	</div>
      	<!-- 页面内容 -->
      	<div class='iframe_content'>
        	<iframe id="page-content" width="100%" scrolling="yes"  height="100%" frameborder="0" style=" overflow:visible; height:100%;" name="main"  seamless ="seamless"src=""></iframe>
      	</div>

	</div>

   
	<script src="/Public/js/common/jquery.min.js"></script>
    <script src="/Public/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html> 
<!-- 分享框 -->
<div class="modal hide fade" id="share-modal">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
    <h3>分享</h3>
  </div>
  <div class="modal-body">
    <p>项目地址：<code>http://doc.star7th.com/index.php/2</code></p>
    <p>你可以复制项目地址给你的好友</p>
  </div>
</div>

<script src="/Public/js/item/show.js"></script>