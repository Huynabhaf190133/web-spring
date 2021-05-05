<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="des" uri="http://www.opensymphony.com/sitemesh/decorator" %>
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
</head>
<body>
<div class="card">
    <div class="card-body">
        <h1>Giày</h1>
        <div class="table-responsive shadow">
            <table id="table-main" class="table table-sm table-hover table-striped">
                <thead>
                <tr>
                    <td>#</td>
                    <td>Mã Giày</td>
                    <td>Tên Giày</td>
                    <td>Size</td>
                    <td>Số Lượng</td>
                    <td>Giá</td>
                    <td>Loại Giày</td>
                    <td>Nhà Sản Xuất</td>
                    <td>Màu Sắc</td>
                    <td>Ảnh</td>
                    <td>Mô tả</td>
                    <td>ACtion</td>
                </tr>
                </thead>
                <tbody></tbody>
            </table>
        </div>
    </div>
</div>
<script>
    function getAll() {
        axios.get("/giay/index/getall")
            .then(response => response.data)
            .then(data => {
                var html = ""
                for (let i = 0; i < data.length; i++) {
                    html += "<tr>"
                    html += "<td>" + (i + 1) + "</td>" +
                        "<td>" + data[i].MaGiay + "</td>" +
                        "<td>" + data[i].TenGiay + "</td>" + "<td>" + data[i].Size +
                        "</td>" + "<td>" + data[i].SoLuong + "</td>" + "<td>" +
                        data[i].Gia + "</td>" + "<td>" + data[i].TenLG + "</td>" +
                        "<td>" + data[i].TenNSX + "</td>" +"<td>"+data[i].MauSac+"</td>"+ "<td>" + data[i].Anh +
                        "</td>" + "<td>" + data[i].Mota + "</td>" +
                        "<td class='text-nowrap' style='width: 1px'>" +
                        "<button class='btn btn-sm btn-info' id='delete'><i class='fa fa-info'>Chi Tiết</i></button>" +
                        "<button id='Showdata' type='button' data-toggle='modal' data-target='#myModal' onclick='GiayUpdate(" + data[i].MaGiay + ")' class='btn btn-sm btn-warning''><i class='fa fa-edit'>Chỉnh sửa</i></button>" +
                        "<button onclick='GiayDelete(" + data[i].MaGiay + ")' class='btn btn-sm btn-danger'><i class='fa fa-trash'>Xóa</i></button>" +
                        "</td>";
                    html += "</tr>"
                }
                $("#table-main tbody").empty().append(html);
            })
    }

    getAll()
</script>
<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Update Giày</h5>
            </div>
            <div class="modal-body">
                <label class="form-label" for="tenGiay">Tên Giày</label>
                <input id="tenGiay" class="form-control" type="text">
                <label class="form-label" for="Size">Size</label>
                <input id="Size" class="form-control" type="text">
                <label class="form-label" for="SoLuong">SoLuong</label>
                <input id="SoLuong" class="form-control" type="text">
                <label class="form-label" for="MauSac">MauSac</label>
                <input id="MauSac" class="form-control" type="text">
                <label class="form-label" for="Gia">Giá</label>
                <input id="Gia" class="form-control" type="text">
                <label class="form-label" for="MaLG">LoaiGiay</label>
                <select class="form-control" name="MaLG" id="MaLG">
                    <script>
                        axios.get("/loaigiay/getloaigiay")
                            .then(response => {
                                return response.data
                            })
                            .then(result => {
                                var html = "";
                                for (i = 0; i < result.length; i++) {
                                    html += "<option value='" + result[i].MaLG + "'>" + result[i].TenLG + "</option>"
                                }
                                $("#MaLG").append(html);
                            })
                    </script>
                </select>
                <label class="form-label" for="MaNSX">Nhà Sản Xuất</label>
                <select class="form-control" name="MaNSX" id="MaNSX">
                    <script>
                        axios.get("/NSX/getnsx")
                            .then(response => {
                                return response.data
                            })
                            .then(result => {
                                var html = "";
                                for (i = 0; i < result.length; i++) {
                                    html += "<option value='" + result[i].MaNSX + "'>" + result[i].TenNSX + "</option>"
                                }
                                $("#MaNSX").append(html);
                            })
                    </script>
                </select>
                <option id="selectedMaNSX" selected></option>
                <label class="form-label" for="Mota">Mo tả</label>
                <input id="Mota" class="form-control" type="text">
            </div>
            <div class="modal-footer">
                <button id="update" type="button" class="btn btn-primary">Save changes</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>
<script>
    var id=0;
    function GiayUpdate(ele) {
        id = ele;
        axios.post("/giay/getByKeyword", {MaGiay: id})
            .then(response => {return response.data})
            .then(data => {
                data=data[0]
                $("#tenGiay:text").val(data.TenGiay)
                $("#Size:text").val(data.Size)
                $("#SoLuong:text").val(data.SoLuong)
                $("#Gia:text").val(data.Gia)
                $("#MauSac").val(data.MauSac)
                $("#Mota:text").val(data.Mota)
            })
    }


    function GiayDelete(ele) {
        axios.post("/giay/delete", {MaGiay: ele})
            .then(function () {
                getAll();
            })
    }

    $("#update").click(function () {
        axios.post("/giay/edit/send", {
            MaGiay: id,
            TenGiay: $("#tenGiay").val(),
            Size: $("#Size").val(),
            SoLuong: $("#SoLuong").val(),
            MauSac: $("#MauSac").val(),
            Gia: $("#Gia").val(),
            MaLG: $("#MaLG option").val(),
            MaNSX: $("#MaNSX option").val(),
            Mota: $("#Mota").val()
        })
            .then(() => {
                getAll();
            })
            .then(() => {
                $("#myModal").modal("hide");
            })
            .catch(err => console.log(err))

    })
</script>
</body>
</html>
