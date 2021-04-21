<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/4/2021
  Time: 8:29 PM
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
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body style="background-color: #1cc88a">
    <div class="container">
        <div class="row">
            <div class="col">
                <table class="table">
                    <tr>
                        <th>Tên Giày</th>
                        <th>Size</th>
                        <th>SoLuong</th>
                        <th>MauSac</th>
                        <th>Giá</th>
                        <th>Tên Loại Giày</th>
                        <th>Tên Nhà Sản Xuất</th>
                        <th>Ảnh</th>
                        <th>Mô Tả</th>
                        <th colspan="2"></th>
                    </tr>
                    <tbody id="table"></tbody>
                    <script>
                        $(document).ready(function (){
                            axios.get("/giay/getAll")
                                .then(response=>{return response.data})
                                .then(result=>{
                                    var html="";
                                    for(let i=0;i<result.length;i++){
                                        html+="<tr>";
                                        html+="<td>"+result[i].TenGiay+"</td>"+
                                            "<td>"+result[i].Size+"</td>"+
                                            "<td>"+result[i].SoLuong+"</td>"+
                                            "<td>"+result[i].MauSac+"</td>"+
                                            "<td>"+result[i].Gia+"</td>"+
                                            "<td>"+result[i].MaLG+"</td>"+
                                            "<td>"+result[i].MaNSX+"</td>"+
                                            "<td><img style='height: 80px;width: 150px;border-radius: 7%' src='"+result[i].Anh+"' /></td>"+
                                            "<td>"+result[i].Mota+"</td>"+
                                            "<td><a class='btn btn-danger' href='/giay/delete/"+result[i].MaGiay+"'>Delete</a></td>";
                                        html+="</tr>";
                                    }
                                    $("#table").append(html);
                                })
                        })
                    </script>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
