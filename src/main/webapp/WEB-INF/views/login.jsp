<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script
            src="https://kit.fontawesome.com/64d58efce2.js"
            crossorigin="anonymous"
    ></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/img/logo.svg"/>" rel="shortcut icon" type="image/x-icon">
    <title>Sign in & Sign up Form</title>
    <style>
        .load{
            display: none;
            color:red;
            font-family: "Arial Narrow";
            font-size: 1.1rem;
        }
        #err{
            display: none;
            color:red;
            font-family: "Arial Narrow";
            font-size: 1.1rem;
        }
        #exist{
            display: none;
            color:red;
            font-family: "Arial Narrow";
            font-size: 1.1rem;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="forms-container">
        <div class="signin-signup">
            <div class="form sign-in-form">
                <h2 class="title">Sign in</h2>
                <div class="input-field">
                    <i class="fas fa-user"></i>
                    <input name="username" id="usernamein" type="text" placeholder="Username"/>
                </div>
                <div class="input-field">
                    <i class="fas fa-lock"></i>
                    <input name="password" id="passwordin" type="password" placeholder="Password"/>
                </div>
                <input id="signin" type="button" value="Login" class="btn solid"/>
                <div id="err">Tài khoản hoặc mật khẩu chưa nhập</div>
                <div class="load" id="loader">
                    <img src="<c:url value="/resources/img/ajax-loader.gif"></c:url> ">
                </div>
                <p class="social-text">Or Sign in with social platforms</p>
                <div class="social-media">
                    <a href="#" class="social-icon">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-twitter"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-google"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-linkedin-in"></i>
                    </a>
                </div>
            </div>
            <div class="form sign-up-form">
                <h2 class="title">Sign up</h2>
                <div class="input-field">
                    <i class="fas fa-user"></i>
                    <input id="fullnameup" type="text" placeholder="FullName"/>
                </div>
                <div class="input-field">
                    <i class="fas fa-envelope"></i>
                    <input id="usernameup" type="email" placeholder="UserName"/>
                </div>
                <div class="input-field">
                    <i class="fas fa-lock"></i>
                    <input id="passwordup" type="password" placeholder="Password"/>
                </div>
                <input id="signup" type="button" class="btn" value="Sign up"/>
                <div id="exist">Có lỗi xẩy ra vui lòng thử lại !!!</div>
                <p class="social-text">Or Sign up with social platforms</p>
                <div class="social-media">
                    <a href="#" class="social-icon">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-twitter"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-google"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-linkedin-in"></i>
                    </a>
                </div>
            </div>
        </div>
        <div class="panels-container">
            <div class="panel left-panel">
                <div class="content">
                    <h3>New here ?</h3>
                    <p>
                        Love is like a plate of beef <br>
                        Eating in is chewy <br>
                        Chewing a lot is boring
                    </p>
                    <button class="btn transparent" id="sign-up-btn">
                        Sign up
                    </button>
                </div>
                <img src="<c:url value="/resources/img/login.svg" />" class="image" alt=""/>
            </div>
            <div class="panel right-panel">
                <div class="content">
                    <h3>One of us ?</h3>
                    <p>
                        Together we build a civilized, modern and healthy world
                    </p>
                    <button class="btn transparent" id="sign-in-btn">
                        Sign in
                    </button>
                </div>
                <img src="<c:url value="/resources/img/rocket.svg" />" class="image" alt=""/>
            </div>
        </div>
    </div>
    <script>

    </script>
    <script src="<c:url value="/resources/js/app.js"></c:url> "></script>
</div>
</body>
</html>