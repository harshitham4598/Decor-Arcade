<%-- 
    Document   : spaceplanning
    Created on : Mar 15, 2019, 5:10:18 AM
    Author     : HARSHI
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Designing Page</title>
        <style>
            html,body{  
                margin: 0;
                padding: 0;
                height: 90%;
                text-align: center;
                
            }
            section{
                min-height: 80%;
            }
            a{
                text-decoration: none;
            }

            /*-------------------------navbar-----------------------------*/

            #navbar a{
                font-family: cursive;
                font-weight: 400;
                color: whitesmoke;
                text-transform: uppercase;    
            }
            #navbar{
                width: 100%;
                height: 65px;
                position: fixed;
                top: 0;
                left: 0;
                background: #494949;
                box-shadow: 10px;
                z-index: 1;
                background-image:url("images/texture.jpg");
            }
            #navbar li{
                display:inline-block;
            }
            #logo{
                width: 120px;
                float:left;
                margin:1px 10px 0 0;
            }
            #logo img{
                padding: 0px 10px;
                width: 90%;
            }
            #logo:hover{opacity: 0.5;}

            header nav{
                float:right;
                margin: 10px 50px 0 0;
            }
            #navbar nav ul li{
                float: left;
                margin-right: 25px;
            }
            #navbar nav ul li a{
                font-size: 13px;
            }
            #navbar nav ul li:hover{
                padding-top: 5px;
            }

                       /*-----------------------------------selection----------------------------------*/
            @media (max-width:960px)
            {
                #select{
                    width: auto;
                }
            }
            #select{
                background-color: #F8F8F8;
                height:25%;
                width: 100%;
            }
            #select img{
                width: 40px;
                height: 40px;
                border-radius: 5px;
            }
            #projects img :hover{
                transform: scale(1.1);
                -webkit-transform: scale(1.1);
                -moz-transform: scale(1.1);
            }
            #select h3{
                color:black;
                font-size: 14px;
            }

            #project td {
                cursor: pointer;
            }

            #project a{
                color:black;
                display: inline-block;
                text-decoration: none;
            }
            #comp{
                padding: 10px;
                border:2px solid #FFFFFF;
                height: 100px;
                width: 70px;

            }
            #comp:hover
            {
                cursor: pointer;
                background-color: #D3D3D3;
            }
            #select .wed{
                background-color: pink;
            }
            /*----------------------------------booking---------------------------------*/
            @media (max-width:1000px)
            {
                #booking{
                    width: auto;
                }
            }
            #booking h3{
                font-size: 30px;
                color:#FF3366;
            }
            .promos {
                width: 900px;
                margin: 0 auto;
                margin-top: 50px;
            }
            #booking .promo {
                width: 300px;
                height: 70vh;
                background: #2F0909; 
                color: #64AAA4;
                float: left;
                border-radius: 200px;
            }
            .deal {
                padding: 20px 10px 0 0;
                font-family: fantasy;
            }
            .deal span {
                display: block;
                text-align: center;
            }
            .deal span:first-of-type {
                font-size: 33px;  
            }
            .deal span:last-of-type {
                font-size: 13px;
            }
            .promo .price {
                display: block;
                width: 300px;  
                background: white;
                margin: 25px 0 10px 0;
                text-align: center;
                font-size: 25px;
                padding: 27px 0 17px 0;
                 border-radius: 300px;
                
            }
            #booking ul {
                display: block;
                margin: 20px 0 10px 0;
                padding: 0;
                list-style-type: none;
                text-align: center;
                color: #999999;
            }
            #booking li {
                display: block;
                margin: 10px 0 0 0;
            }
            .but  {
                border: none;
                border-radius: 40px;
                background: silver;
                color: black;
                padding: 15px 37px;
                margin: 10px 0 20px 60px;
                margin-left: auto;
                margin-right: auto;
                font-size: 15px;
            }
            .scale {
                transform: scale(1.2);
                box-shadow: 0 0 4px 1px rgba(20, 20, 20, 0.8);
            }
            .but {
                background: silver;
            }
            .but:hover
            {
                cursor: pointer;
                background-color: #b99;
            }
            .scale .price {
                color: #64AAA4;
            }  
            #booking hr{
                width:40px;
                height: 3px;
                background: #494949;
                border:0;
                margin: 0 auto 40px auto;
            }
            .features{
                font-size: 18px;
                font-family: initial;
            }
            /*---------------------------contact------------------------*/
            #contact table{
                width: auto;
            }
            #contact  img{
                width: 70px;
                margin:10px 0px 0 0; 
            }   
            #contact img:hover{
                transform: scale(1.3);
            }
            #contact h4{
                margin: 0 auto 0 auto;
                font-size: 30px;
                font-weight: 200;
            }            
            #contact p{
                width: 400px;
                font-size: 25px;
                color: #656161;

            }
            #contact h3{
                font-size: 20px;
                color:#FF3366;
            }
  /*--------------------------------Footer------------------------------------------*/
            @media (max-width:960px)
            {
                #footer #largebox #largebox1 {
                    width: auto;
                }
            }
            #footer{
                background-image:url("img/foot.jpg"); 
                background-color: #282828;
            }
            #box1 li{ list-style-type: none; text-align: left;}
            #box2 li {list-style-type: none;  }
            #box3 li{list-style-type: none;}
            #box2 a {text-decoration: none;
                     color: white;}
            #box href{color: blue;}

            #largebox{
                width: 1000px;
                height: 200px;
                margin: 0 auto;
            }
            #box1{
                width: 300px;
                height: 200px;
                float: left;
                color:white;
            }
            #box2{
                width: 300px;
                height: 200px;
                float: left;
                color:white;
                text-align: center;
            }
            #box3{
                width: 300px;
                height: 200px;
                float: right;
                color: white;
                text-align: left;
            }

            #largebox1{
                width: 1000px;
                height: 250px;
                margin: 0 auto;
            }
            #box4{
                width: 500px;
                height: 250px;
                float: left;
                text-align: left;
                color:white;
            }
            #box5{
                width: 500px;
                height: 250px;
                float: right; 
                color: white;
            }
            #box5  img{
                width: 50px;
                margin:10px 0px 0 0; 
            } 
            #box5 img:hover{
                opacity: 0.5;
                cursor: pointer;
            }
            #mainfooter{
                width: 100%;
                height: 40px;
                background-color: black;
                color: white;
            }
            .fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}
.slideshow-container {
    size:auto;
  max-width: 1000px;
  position: relative;
  margin: auto;
  background-position: center center;
                background-size: 120% 100%;
                background-attachment: scroll;
                background-color: whitesmoke;
}
.dot {
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}.active {
  background-color: #717171;
}
        </style>
    </head>
    <body>
        <%
        response.setHeader("Cache-Control" , "no-cache, no-store, must-revalidate");
        if(session.getAttribute("em")== null){
         response.sendRedirect("main.jsp");
        }
        %>
        <header id="navbar">
            <div id="logo">
                <a href="#">
                    <img src="img/logo.png" alt="logo">
                </a>
            </div>

            <nav id="main-nav">
                <ul>
                    <li><a href="logout.jsp">logout</a></li>
                    <li><a href="home.jsp">HOME</a></li>
                </ul>
            </nav>
        </header>
        <!-----------------------------------home--------------------------------------->      
       
        <section>   <br><br><br>  
        <div class="slideshow-container">
            <b><h1> <u>All Designs</u></h1></b>
<div class="mySlides fade">
  <img src="img/all0.jpg" style="width:80%;">

</div>

<div class="mySlides fade">

  <img src="img/all2.jpg" style="width:80%;">
</div>
 
<div class="mySlides fade">

  <img src="img/all5.jpg" style="width:80%;">
</div>
                       

<div class="mySlides fade">

  <img src="img/all3.jpg" style="width:80%">
</div>
            
  <div class="mySlides fade">
  <img src="img/all4.jpg" style="width:80%;">

</div>
             <div class="mySlides fade">
  <img src="img/texture.jpg" style="width:80%;">

</div>
    
</div>
<br>

<div style="text-align: center">
   <span class="dot"></span> 
    <span class="dot"></span> 
    <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
   <span class="dot"></span> 
 </div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1;}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 3000); 
}
</script>
<br>
        </section>
    <!-----------------------------contact----------------------------->

<div id="contact"><br><br>
    <b><h3>For more album?</h3></b>
    <table align="center">
        <tr>
            
            <td><a href="https://instagram.com/home_design68" target="null"><img src="img/instagram.png"alt="avatar"></a></td>
           
        </tr>
        <tr>
        <b>   <td> <h4>instagram</h4></td></b>
            
        </tr><tr></tr><tr></tr>
        <tr>
           </tr>
    </table><br><br></div><br><br>


<!-----------------------------booking----------------------------->
<section id="booking">
    <h3><u>ALL PLANS</u></h3><br><hr>
    <div class="promos">  
        <div class="promo">
            <div class="deal">
                <span>Basic</span>
                <span></span>
            </div>
            <span class="price">Rs 40,000/-</span>
            <ul class="features">
                <li>Few Designers</li>
                <li>------</li>
                <li>Limited time</li>
                <li>------</li>
                <li>Your home will renovated in<br> 3 weeks</li> 
                <li>------</li>
                <li>With average quality<br>Products</li>
            </ul>
           <!-- <button>Book now</button>-->
        </div>

        <div class="promo scale">
            <div class="deal">
                <span>Awesome</span>
                <span></span>
            </div>
            <span class="price">Rs 80,000/-</span>
            <ul class="features">
                <li>Many Designers</li>
                <li>------</li>
                <li>Limited time</li>
                <li>------</li>
                <li>Your home will renovated in<br> 2 weeks</li> 
                <li>------</li>
                <li>With highly assured quality<br>Products</li>

            </ul>

           <!-- <button>Book now</button>-->
        </div>
        <div class="promo">
            <div class="deal">
                <span>Premium</span>
                <span></span>
            </div>
            <span class="price">Rs 60,000/-</span>
            <ul class="features">
                <li>Minimum Designers</li>
                <li>------</li>
                <li>Limited time</li>
                <li>------</li>
                <li>Your home will renovated in<br> 4 weeks</li> 
                <li>------</li>
                <li>With semi-average quality<br>Products</li>
            </ul>
            <!--<button>Book now</button>-->
        </div>
    </div>   
</section><br><br><br><br><br><br><br><br><br><br><form method="post" action="booking.jsp">
    <center><button class="but" ><b>Book now</b></button></center></form>

<!----------------------footer---------------------------------->
<div id="footer"><br>
    <div id="largebox">
        <div id="box1">
            <li><u><b>Find us</b></u></li><br>
            <li><b>Address:</b> #190,7th cross vidyanagar <br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mysore-570011, India</li><br>
            <li><b>Phone:</b>&nbsp;&nbsp;9164815372</li>
            <li><b>gmail:</b>&nbsp;&nbsp;decorearcade@gmail.com</li>
        </div>

        <div id="box2">
            <b><u><li>Customer</li></u></b><br>
            <li><a href="home.jsp">Home</a></li>
            
        </div>

        <div id="box3">
            <b> <u>  <li> Top Cities</li></u></b><br>
            <li>Bangalore</li>
            <li>Dharwad</li>
            <li>Hubli</li>
            <li>Shivmogga</li>
            <li>Madikeri</li>
            <li>Chikmangalore</li>
            <li>Mysuru</li>
        </div>
    </div>
    <div id="largebox1">
        <div id="box4">
            <div id="logo">
                <a href="#">
                    <img src="img/logo.png" alt="logo">
                </a>
            </div><br><br><br><br><br>
            <b>  Decor Arcade helps you hire the best professionals from designers to <br>
            stylists, tutors, trainers and a lot more. Find pre defined packages at<br> 
            unbelievable prices from pro's, chat live to check availability and buy instantly to book them. Buy <br>
            Packages, from the Best Professionals, its <br>
            just a click away </b>
        </div>

        <div id="box5">
            <b> <u> <p>follow us</p></u></b>
            <table align="center">
                <tr>
                     <td><a href="https://instagram.com/decor_arcade" target="null"> <img src="img/instagram.png"alt="avatar"></a></td><td></td><td></td>
                    <td><a href="https://www.facebook.com/decor.arcade" target="null">  <img src="img/facebook.png"alt="avatar"></a></td><td></td><td></td>
                    <td> <img src="img/twitter.png"alt="avatar"></td>
                </tr>
            </table>
        </div>
    </div>
    <div id="mainfooter"><br>
        <b>   © Copyright @harshitham</b>
    </div>   
</div>
</body>
</html>



