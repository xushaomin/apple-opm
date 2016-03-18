<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>ShowDoc</title>
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
<link href="/Public/highlight/default.min.css" rel="stylesheet"> 
<script src="/Public/highlight/highlight.min.js"></script> 


<!-- 这里开始是内容 -->
<div class="" style="padding-top:10px;">

<p><strong>简要描述：</strong> </p>
<ul>
<li>用户注册接口</li>
</ul>
<p><strong>请求URL：</strong> </p>
<ul>
<li><code>http://xx.com/api/user/register</code></li>
</ul>
<p><strong>请求方式：</strong></p>
<ul>
<li>POST </li>
</ul>
<p><strong>参数：</strong> </p>
<table>
<thead>
<tr>
<th style="text-align: left;">参数名</th>
<th style="text-align: left;">必选</th>
<th style="text-align: left;">类型</th>
<th>说明</th>
</tr>
</thead>
<tbody>
<tr>
<td style="text-align: left;">username</td>
<td style="text-align: left;">是</td>
<td style="text-align: left;">string</td>
<td>用户名</td>
</tr>
<tr>
<td style="text-align: left;">password</td>
<td style="text-align: left;">是</td>
<td style="text-align: left;">string</td>
<td>密码</td>
</tr>
<tr>
<td style="text-align: left;">name</td>
<td style="text-align: left;">否</td>
<td style="text-align: left;">string</td>
<td>昵称</td>
</tr>
</tbody>
</table>
<p><strong>返回示例</strong></p>
<pre><code>  {
    "error_code": 0,
    "data": {
      "uid": "1",
      "username": "12154545",
      "name": "吴系挂",
      "groupid": 2 ,
      "reg_time": "1436864169",
      "last_login_time": "0",
    }
  }</code></pre>
<p><strong>返回参数说明</strong> </p>
<table>
<thead>
<tr>
<th style="text-align: left;">参数名</th>
<th style="text-align: left;">类型</th>
<th>说明</th>
</tr>
</thead>
<tbody>
<tr>
<td style="text-align: left;">groupid</td>
<td style="text-align: left;">int</td>
<td>用户组id，1：超级管理员；2：普通用户</td>
</tr>
</tbody>
</table>
<p><strong>备注</strong> </p>
<ul>
<li>更多返回错误代码请看首页的错误代码描述</li>
</ul>
</div>




    
	<script src="/Public/js/common/jquery.min.js"></script>
    <script src="/Public/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html> 
<script>

$(function(){
    hljs.initHighlightingOnLoad();

    //为所有table标签添加bootstap支持的表格类
    $("table").addClass("table table-bordered table-hover");

    //超链接都在新窗口打开
	$('a[href^="http"]').each(function() {
		$(this).attr('target', '_blank');
	});

})



</script>