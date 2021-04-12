<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <title>T3H - Shop Shoe Auth</title>
    <style>
        body {
            background-image: url("https://vanishla.com/.../uploads/2017/10/spiration-light.png");
            background-repeat: repeat;
        }
        .card{
            transition: transform 0.2s;
        }
        .card:hover{
            transform: scale(1.05);
        }
    </style>
    <script>
        $(document).ready(function() {
            $('.card').click(function () {
                console.log('clicked');
                $('#modal-image').modal('toggle');

                var imgs = $('#modal-image').find('img');

                console.log(imgs.length);
                var src = $($(this).find('img')).attr('src');
                console.log(src)
                $(imgs[0]).attr('src', src);
            })
        });
    </script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01"
            aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <a class="navbar-brand" href="#">Hidden brand</a>
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
<div class="container">
    <div class="card-deck mt-3">
        <div class="card shadow">
            <img class="card-img-top" src="https://i.pinimg.com/originals/a8/87/77/a887775949b6c8d1f5767a5b68211b4c.jpg?fbclid=IwAR2NxjRH50NbS3ELJXNWj_yRbDChWonLJj3h313G6kWnqIlabnlEIMYQUik"
                 alt="Card image cap">
            <div class="card-body">
                <section class="mb-4">
                    <!-- Facebook -->
                    <a
                            class="btn btn-primary btn-floating m-1"
                            style="background-color: #3b5998;"
                            href="#!"
                            role="button"
                    ><i class="fab fa-facebook-f"></i
                    ></a>
                    <!-- Twitter -->
                    <a
                            class="btn btn-primary btn-floating m-1"
                            style="background-color: #55acee;"
                            href="#!"
                            role="button"
                    ><i class="fab fa-twitter"></i
                    ></a>
                    <!-- Google -->
                    <a
                            class="btn btn-primary btn-floating m-1"
                            style="background-color: #dd4b39;"
                            href="#!"
                            role="button"
                    ><i class="fab fa-google"></i
                    ></a>
                    <!-- Instagram -->
                    <a
                            class="btn btn-primary btn-floating m-1"
                            style="background-color: #ac2bac;"
                            href="#!"
                            role="button"
                    ><i class="fab fa-instagram"></i
                    ></a>
                    <!-- Linkedin -->
                    <a
                            class="btn btn-primary btn-floating m-1"
                            style="background-color: #0082ca;"
                            href="#!"
                            role="button"
                    ><i class="fab fa-linkedin-in"></i
                    ></a>
                    <!-- Github -->
                    <a
                            class="btn btn-primary btn-floating m-1"
                            style="background-color: #333333;"
                            href="#!"
                            role="button"
                    ><i class="fab fa-github"></i
                    ></a>
                </section>
                <h5 class="card-title">Card title</h5>
                <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional
                    content. This content is a little bit longer.</p>
                <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                <span>Price:<b>99.99$</b></span>
            </div>
            <div class="card-footer">
                <button class="btn btn-info btn-block">Details</button>
                <button class="btn btn-primary btn-block" data-bs-toggle="popover">buy</button>
            </div>
        </div>
    </div>
</div>
<div id="modal-image" class="modal tabindex="-1">
<div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
            <h5 class="modal-title">Modal title</h5>
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        </div>
        <div class="modal-body">
            <div class="card">
                <img class="card-img-top" src=""
                     alt="Card image cap">
            </div>
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            <button type="button" class="btn btn-primary">Save changes</button>
        </div>
    </div>
</div>
</div>
<footer class="bg-light text-center text-white mt-3">
    <!-- Grid container -->
    <div class="container p-4 pb-0">
        <!-- Section: Social media -->
        <section class="mb-4">
            <!-- Facebook -->
            <a
                    class="btn btn-primary btn-floating m-1"
                    style="background-color: #3b5998;"
                    href="#!"
                    role="button"
            ><i class="fab fa-facebook-f"></i
            ></a>
            <!-- Twitter -->
            <a
                    class="btn btn-primary btn-floating m-1"
                    style="background-color: #55acee;"
                    href="#!"
                    role="button"
            ><i class="fab fa-twitter"></i
            ></a>
            <!-- Google -->
            <a
                    class="btn btn-primary btn-floating m-1"
                    style="background-color: #dd4b39;"
                    href="#!"
                    role="button"
            ><i class="fab fa-google"></i
            ></a>
            <!-- Instagram -->
            <a
                    class="btn btn-primary btn-floating m-1"
                    style="background-color: #ac2bac;"
                    href="#!"
                    role="button"
            ><i class="fab fa-instagram"></i
            ></a>
            <!-- Linkedin -->
            <a
                    class="btn btn-primary btn-floating m-1"
                    style="background-color: #0082ca;"
                    href="#!"
                    role="button"
            ><i class="fab fa-linkedin-in"></i
            ></a>
            <!-- Github -->
            <a
                    class="btn btn-primary btn-floating m-1"
                    style="background-color: #333333;"
                    href="#!"
                    role="button"
            ><i class="fab fa-github"></i
            ></a>
        </section>
        <!-- Section: Social media -->
    </div>
    <!-- Grid container -->
    <!-- Copyright -->
    <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
        © 2020 Copyright:
        <a class="text-white" href="https://bkt.net.vn/"> by Me</a>
    </div>
    <!-- Copyright -->
</footer>
</body>

</html>