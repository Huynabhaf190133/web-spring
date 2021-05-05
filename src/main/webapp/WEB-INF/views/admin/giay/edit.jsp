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
            <div class="updateModel">
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Cập Nhật Giày</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <form action="/giay/upload" method="POST" enctype="multipart/form-data">
                                Please select a file to upload : <input id="file" type="file" name="file" />
                                <input id="uploadImg" type="submit" value="upload" />
                            </form>
                 <%--           <script>
                                $("#uploadImg").click(function (){
                                    axios.post("/giay/upload",{file:$("#file").val()})
                                        .then(response=>{return response.data})
                                })
                            </script>--%>
                            <div class="modal-body">
                                <label for="tenGiay">Tên Giày</label>
                                <input id="tenGiay" class="form-control" type="text">
                                <label for="Size">Size</label>
                                <input id="Size" class="form-control" type="text">
                                <label for="SoLuong">SoLuong</label>
                                <input id="SoLuong" class="form-control" type="text">
                                <label for="MauSac">MauSac</label>
                                <input id="MauSac" class="form-control" type="text">
                                <label for="Gia">Giá</label>
                                <input id="Gia" class="form-control" type="text">
                                <label for="MaLG">LoaiGiay</label>
                                <select class="form-select" name="MaLG" id="MaLG">
                                    <script>
                                        axios.get("/loaigiay/getloaigiay")
                                            .then(response=>{return response.data})
                                            .then(result=>{
                                                var html="";
                                                for(i=0;i<result.length;i++){
                                                    html+="<option value='"+result[i].MaLG+"'>"+result[i].TenLG+"</option>"
                                                }
                                                $("#MaLG").append(html);
                                            })
                                    </script>
                                </select>
                                <label for="MaNSX">Nhà Sản Xuất</label>
                                <select class="form-select" name="MaNSX" id="MaNSX">
                                    <script>
                                        axios.get("/NSX/getnsx")
                                            .then(response=>{return response.data})
                                            .then(result=>{
                                                var html="";
                                                for(i=0;i<result.length;i++){
                                                    html+="<option value='"+result[i].MaNSX+"'>"+result[i].TenNSX+"</option>"
                                                }
                                                $("#MaNSX").append(html);
                                            })
                                    </script>
                                </select>
                                <label for="anh">Ảnh</label>
                                <input id="anh" class="form-control" type="file">
                                <label for="Mota">Mo tả</label>
                                <input id="Mota" class="form-control" type="text">
                            </div>
                            <div class="modal-footer">
                                <button id="update" type="button" class="btn btn-primary">Save changes</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script>
            var id=0;
            function updateData(ele){
                id=ele;
            }
            $("#update").click(function (){
                axios.post("/giay/edit/send",{
                    MaGiay:id,
                    TenGiay:$("#tenGiay").val(),
                    Size:$("#Size").val(),
                    SoLuong:$("#SoLuong").val(),
                    MauSac:$("#MauSac").val(),
                    Gia:$("#Gia").val(),
                    MaLG:$("#MaLG option").val(),
                    MaNSX:$("#MaNSX option").val(),
                    Anh:$("#anh").val(),
                    Mota:$("#Mota").val()
                })
                    .then(response=>{console.log(response); return response.data})
                    .then(result=>{console.log(result)})
            })
        </script>
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
                $(document).ready(function () {
                    axios.get("/giay/getAll")
                        .then(response => {
                            return response.data
                        })
                        .then(result => {
                            var html = "";
                            for (let i = 0; i < result.length; i++) {
                                html += "<tr>";
                                html += "<td>" + result[i].TenGiay + "</td>" +
                                    "<td>" + result[i].Size + "</td>" +
                                    "<td>" + result[i].SoLuong + "</td>" +
                                    "<td>" + result[i].MauSac + "</td>" +
                                    "<td>" + result[i].Gia + "</td>" +
                                    "<td>" + result[i].MaLG + "</td>" +
                                    "<td>" + result[i].MaNSX + "</td>" +
                                    "<td><img style='height: 80px;width: 150px;border-radius: 7%' src='" + result[i].Anh + "' /></td>" +
                                    "<td>" + result[i].Mota + "</td>" +
                                    "<td><a class='btn btn-danger' href='/giay/delete/" + result[i].MaGiay + "'>Delete</a></td>"+
                                    "<td><button onclick='updateData("+result[i].MaGiay+")' type='button' class='btn btn-primary' data-bs-toggle='modal' data-bs-target='#exampleModal'>" +
                                    "Update </button></td>"
                                html += "</tr>";
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
