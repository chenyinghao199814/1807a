<%--
  Created by IntelliJ IDEA.
  User: fanshuai
  Date: 2019/2/20
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script	src="${pageContext.request.contextPath }/jslib/jquery-2.1.1.min.js"></script>


    <script type="text/javascript" src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap3/css/bootstrap.css"/>
    <script src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap3/js/bootstrap.min.js"></script>


    <script src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
    <script src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css">


    <script src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-fileinput/js/fileinput.js"></script>
    <script src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-fileinput/js/locales/zh.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-fileinput/css/fileinput.css">


    <script src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-bootbox/bootbox.js"></script>


    <link rel="stylesheet" href="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-table/bootstrap-table.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-table/bootstrap-table.js"></script>
    <script src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>


    <link rel="stylesheet" href="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-treeview/bootstrap-treeview.min.css">
    <script src="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap-treeview/bootstrap-treeview.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath }/jslib/bootstrap/bootstrap3/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/jslib/bootstrap/bootStrap-addTabs/bootstrap.addtabs.css">
    <script src="${pageContext.request.contextPath }/jslib/bootstrap/bootStrap-addTabs/bootstrap.addtabs.min.js"></script>
    <title>Title</title>
</head>
<body>
<!-- 导航条 -->

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header" >
            <a class="navbar-brand" href="#">景建强</a>
        </div>
        <div class="navbar-header">
            <a class="navbar-brand" href="#">范帅</a>
        </div>
        <div class="navbar-header">
            <a class="navbar-brand" href="#">程鼎</a>
        </div>
        <div class="navbar-header">
            <a class="navbar-brand" href="#">王晓宇</a>
        </div>
        <div class="navbar-header">
            <a class="navbar-brand" href="#">王鹏刚</a>
        </div>
        <div class="navbar-header">
            <a class="navbar-brand" href="#">刘训杰</a>
        </div>
    </div>
</nav>
<!-- 内容布局容器 -->
<div class="container-fluid" style="margin-top: 20px;">
    <div class="row">
        <div class="col-sm-2">
            <div id="myTree"></div>
        </div>
        <div class="col-sm-10">
            <div id="myTabs">
                <!-- 新选项卡 -->
                <ul class="nav nav-tabs" id="tablist">
                    <li role="presentation" class="active">
                        <a href="#home" role="tab" data-toggle="tab">欢迎</a>
                    </li>
                </ul>

                <!-- 选项卡下内容 -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="home">
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<script type="text/javascript">
    $(function(){
        myTree();
    })
    function myTree(){
        $.ajax({
            url:"/getMyTree",
            type:'post',
            data:{},
            dataType:'json',
            success:function(result){
                $('#myTree').treeview({
                    data:result,
                    onNodeSelected:function(event,node){
                        $.addtabs({iframeHeight: 500});
                        $.addtabs.add({
                            id:node.id,
                            title:node.text,
                            url:node.href
                        });
                    }

                })
            }
        })

    }

</script>
</html>
