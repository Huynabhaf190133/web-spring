<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/4/2021
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
            crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
    <form class="form" action="/login/send" method="post">
        <label class="form-label" for="username">UserName</label>
        <input class="form-control" type="text" id="username" name="username">
        <label class="form-label" for="password">password</label>
        <input class="form-control" type="text" id="password" name="password">
        <button class="btn btn-primary" id="button">click</button>
    </form>
    <script>
        /*$("#button").click(function () {
            var Data={}
            Data['username']=$("#username").val();
            Data['password']=$("#password").val();
            console.log(Data)
            $.ajax({
                url:"/login/send",
                dataType:"JSON",
                contentType : "application/json",
                type:"POST",
                data:($("#username").val(),$("#password").val()),
                success:function (result) {
                    console.log(result)
                }
            })
        })*/

    </script>
</body>
</html>
