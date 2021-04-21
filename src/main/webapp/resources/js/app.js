const sign_in_btn = document.querySelector("#sign-in-btn");
const sign_up_btn = document.querySelector("#sign-up-btn");
const container = document.querySelector(".container");

sign_up_btn.addEventListener("click", () => {
    container.classList.add("sign-up-mode");
});

sign_in_btn.addEventListener("click", () => {
    container.classList.remove("sign-up-mode");
});

// Đăng kí cho người dùng mới
$("#signup").click(function () {
    var fullname = $("#fullnameup").val();
    var username = $("#usernameup").val();
    var password = $("#passwordup").val();
    var Data1 = {};
    Data1['FullName'] = fullname;
    Data1['userName'] = username;
    Data1['password'] = password;
    Data1['role'] = "Customer";
    if (fullname.length == 0 || username.length == 0 || password.length == 0) {
        $("#exist").show();
    } else {
        // Check xem tên tài khoản đăng kí có bị trùng hay không
        axios.get("/login/getall")
            .then(response => {
                return response.data
            })
            .then(data => {
                for (let i = 0; i < data.length; i++) {
                    console.log(Data1['userName'])
                    if (data[i].userName.includes(Data1['userName'])) {
                        $("#exist").show();
                        break;
                    } else {
                        $("#exist").hide();
                        axios.post("/logup/add", Data1)
                            .then(response => {
                                return response.data
                            })
                            .then(result => {
                                $("#exist").empty().text("Thêm Thành Công").show()
                            })
                        break;
                    }
                }
            })
    }
})


// Đắng Nhập
$("#signin").click(function () {
    var username = $("#usernamein").val();
    var password = $("#passwordin").val();
    if (username.length == 0 || password.length == 0) {
        $("#err").show();
    } else {
        $("#err").hide();
        var Data = {};
        Data["userName"] = username;
        Data["password"] = password;
        axios.post("/login/send",Data)
            .then(response=>{return response})
            .transformRequest(function (){$("#loader").show();})
            .then(result=>{
                setTimeout(function () {
                    $("#loader").hide();
                    if (result.role.includes("admin")) {
                        sessionStorage.setItem("admin", result.username);
                        window.location.href = "giay/create"
                    } else if (result.role.includes("Customer")) {
                        sessionStorage.setItem("customer", "a");
                        alert("Chào mừng bạn !!!");
                    }
                }, 2000)
            })
            .catch(err=>{
                $("#loader").hide();
                alert("Tài khoản hoặc mật khẩu chưa chính xác !!!")
            })
        $.ajax({
            url: "/login/send",
            type: "POST",
            dataType: "JSON",
            contentType: "application/json",
            data: JSON.stringify(Data),
            beforeSend: function () {
                $("#loader").show();
            },
            success: function (result) {
                setTimeout(function () {
                    $("#loader").hide();
                    if (result.role.includes("admin")) {
                        sessionStorage.setItem("admin", result.username);
                        window.location.href = "giay/create"
                    } else if (result.role.includes("Customer")) {
                        sessionStorage.setItem("customer", "a");
                        alert("Chào mừng bạn !!!");
                    }
                }, 2000)
            },
            error: function () {
                $("#loader").hide();
                alert("Tài khoản hoặc mật khẩu chưa chính xác !!!")
            }
        });
    }

});