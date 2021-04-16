<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/4/2021
  Time: 8:25 PM
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
        <input type="text" name="MaGiay" id="MaGiay" value="dsdsd">
        <input type="text" name="TenGiay" id="TenGiay">
        <input type="text" name="Size" id="Size">
        <input type="text" name="SoLuong" id="SoLuong">
        <input type="text" name="MauSac" id="MauSac">
        <input type="text" name="Gia" id="Gia">
        <select name="MaLG" id="MaLG">
            <script>
                $.ajax({
                    url:"/loaigiay/getloaigiay",
                    dataType:"JSON",
                    type:"GET",
                    success:function (result) {
                        console.log(result);
                        var html="";
                        for(i=0;i<result.length;i++){
                            html+="<option value='"+result[i].MaLG+"'>"+result[i].TenLG+"</option>"
                        }
                        $("#MaLG").append(html);
                    }
                })
            </script>
        </select>
        <select name="MaNSX" id="MaNSX">
            <script>
                $.ajax({
                    url:"/NSX/getnsx",
                    dataType:"JSON",
                    type:"GET",
                    success:function (result) {
                        console.log(result);
                        var html="";
                        for(i=0;i<result.length;i++){
                            html+="<option value='"+result[i].MaNSX+"'>"+result[i].TenNSX+"</option>"
                        }
                        $("#MaNSX").append(html);
                    }
                })
            </script>
        </select>
        <input type="text" name="Anh" id="Anh">
        <input type="text" name="Mota" id="Mota">
        <button id="add">Xac Nhan</button>
        <div id="mes"></div>
<script>
    $("#add").click(function () {
        var Data={}
        Data['MaGiay']=$("#MaGiay").val();
        Data['TenGiay']=$("#TenGiay").val();
        Data['Size']=$("#Size").val();
        Data['SoLuong']=$("#SoLuong").val();
        Data['MauSac']=$("#MauSac").val();
        Data['Gia']=$("#Gia").val();
        Data['MaLG']=$("#MaLG option").val();
        Data['MaNSX']=$("#MaNSX option").val(),
        Data['Anh']=$("#Anh").val();
        Data['Mota']=$("#Mota").val();
        $.ajax({
            url: "/giay/create",
            //timeout:1000,
            type: "POST",
            contentType : "application/json",
            data: JSON.stringify(Data),
            dataType: "JSON",
            success:function(result){
                alert(result.MaGiay)
            },
            error:function () {
                alert("Có lỗi Vui long thu lai")
            }
        })
    })
</script>
</body>
</html>
