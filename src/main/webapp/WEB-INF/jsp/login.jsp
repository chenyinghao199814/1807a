<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>您好！请您登陆！</title>
</head>
<!-- 引入easyui样式文件 -->
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5/themes/default/easyui.css">
<!-- 引入easyui图标样式文件 -->
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5/themes/icon.css">
<!-- 引入jquery js文件 -->
<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5/jquery.min.js"></script>
<!-- 引入easyui的js文件 -->
<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<!-- 引文easyui支持中文js -->
<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>

<!-- 登陆框架 -->
<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" media="all" />

<link rel="stylesheet" href="<%=request.getContextPath() %>/alter/example.scss">
<!-- This is what you need -->
<script src="<%=request.getContextPath() %>/alter/sweet-alert.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/alter/sweet-alert.css">
<body>

<div class="header-w3l">
    <h1>欢迎登陆我们！</h1>
</div>

<div class="mail-form shadow-agile">
    <form action="#" method="post">
        <input type="text" id="loginnumber" name="userName" placeholder="Enter your name...." required=""/>
        <input type="password" id="pwd"  name="userPwd" class="padding-wthree" placeholder="Password" required=""/>
        <input type="button" value="登陆" onclick="loginUser()">
    </form>
</div>

<div class="footer-agileits">
    <p>©欢迎访问农场管理</p>
</div>

<script>
    function loginUser(){
        var loginnumber = $("#loginnumber").val();
        var pwd = $("#pwd").val();
        $.ajax({
            url:"<%=request.getContextPath()%>/loginUser",
            data:{"userName":loginnumber,"userPwd":pwd},
            success:function(data){
                swal(data, "", "error")
                if(data == "登陆成功！"){
                    swal(data, "", "success")
                    window.parent.location.href="<%=request.getContextPath()%>/toTree";
                    setTimeout(function(){alert(1236)}, 3000);
                }
            },
            error:function(){
                $.messager.alert("提示驾到","删除失败","error");
            }
        })
    }

</script>
</body>
</html>
