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
    // A fix cái này cho e với
    //
    var Data1 = {};
    Data1['userID']=null;
    Data1['FullName']=$("#fullnameup").val();
    Data1['userName']=$("#usernameup").val();
    Data1['password']=$("#passwordup").val();
    Data1['role']="Customer";
    console.log(Data1)
    $.ajax({
        url: "/logup/add",
        type: "POST",
        dataType: "JSON",
        contentType: "application/json",
        data: JSON.stringify(Data1),
        success:function (result) {
            console.log(result);
        }
    })
})



// Đắng Nhập
$("#signin").click(function () {
    var Data = {};
    Data["userName"] = $("#usernamein").val();
    Data["password"] = $("#passwordin").val();
    $.ajax({
        url: "/login/send",
        type: "POST",
        dataType: "JSON",
        contentType: "application/json",
        data: JSON.stringify(Data),
        success: function (result) {
            if(result.role.includes("admin")){
                sessionStorage.setItem("admin",result.username);
                window.location.href="giay/create"
            }
            else if(result.role.includes("Customer")){
                sessionStorage.setItem("customer","a");
                alert("khoong biet");
            }
        },
        error:function (){
            alert("Tài khoản hoặc mật khẩu chưa chính xác !!!")
        }
    });
});