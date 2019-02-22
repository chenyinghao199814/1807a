<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/22
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link href="http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="css/city-picker.css" rel="stylesheet" type="text/css" />
<head>
    <title>Title</title>
</head>
<body>

<!-- 代码部分begin -->
<div class="container">
    <h2 class="page-header">商品包邮地区</h2>
    <div class="docs-methods">
        <form class="form-inline">
            <div id="distpicker">
                <div class="form-group">
                    <div style="position: relative;">
                        <input id="city-picker3" class="form-control" readonly type="text" value="江苏省/常州市/溧阳市" data-toggle="city-picker">
                    </div>
                </div>
                <div class="form-group">
                    <button class="btn btn-warning" id="reset" type="button">重置</button>
                    <button class="btn btn-danger" id="destroy" type="button">确定</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script src="ardess/js/jquery.js"></script>
<script src="ardess/js/bootstrap.js"></script>
<script src="ardess/js/city-picker.data.js"></script>
<script src="ardess/js/city-picker.js"></script>
<script src="ardess/js/main.js"></script>
<!-- 代码部分end -->
</body>
</html>
