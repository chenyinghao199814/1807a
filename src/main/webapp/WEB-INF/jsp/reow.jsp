<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/21
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script src="js/tableXR.js"></script>
</head>
<body>
<div id="root" style="width: 800px"></div>
<script type="text/javascript">
    var data
    $.ajax({
        url:"queryReow",
        type:"post",
        dataType:"json",
        success:function (data) {
                   alert(data)
            $('#root').tableXR({
                //表格标题
                title:'角色表',
                //表格头部设置
                columns:[
                    {data:'reowId',title:'id'},
                    {data:'rewoName',title:'角色'},
                    {data:'reowUser',title:'用户Id'},

                ],
                //表格数据：
                data:data
            })
        },error:function () {

        }
    })


</script>
</body>
</html>
