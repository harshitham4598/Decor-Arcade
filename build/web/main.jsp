<%-- 
    Document   : main
    Created on : Mar 14, 2019, 3:00:56 AM
    Author     : HARSHI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
        <style>
           <%---------------------------------header section------------------------------------%>
            body{
                height:100vh;
                margin:0px;
                border: 0px;
                background-color:#fff ;
                      text-decoration:none;
            }
             header{
                background: linear-gradient(rgba(0,0,0,3),rgba(0,0,0,0)), url( "img/main.jpg");
                height:95vh;
                -webkit-background-size:cover;
                background-size: cover;
                background-position:center bottom;
                position:relative;
            }
            .wrap{
                 width :1170px;
                margin:auto;
            }
            .nav-area{
                float:right;
                list-style:none;
                margin-top: 30px;
            }
            .nav-area li{
                display:inline-block;
            }
            .nav-area li a{
                color:#fff;
                text-decoration: none;
                padding:5px 20px;
                font-family:poppins;
                font-size: 16px;
            }
            .nav-area li a:hover{
                background: #fff;
                color: #333;
            }
            .logo img{
                background-color:  transparent;
                padding:15px 15px;
                width: 190px ;
                float:left;
                height: 155px;
            }
            .welcome-text{
                position: absolute;
                width:530px;
                margin: 18% 30%;
                text-align: center;
            }
            .welcome-text h1{
                text-align: center;
                color: #fff;
                text-transform: uppercase;
                font-size: 45px;
                font-family: initial;
            }
            .welcome-text h2{
                color: #fff; 
                font-size: 20px;
            }
            .welcome-text p{
                color: #fff;
               font-size: 15px;

            }
            .welcome-text a{
                border: 1px solid #fff;
                padding:10px 15px;
                text-decoration: none;
                text-transform: uppercase;
                font-size: 13px;
                margin-top: 18px;
                display: inline-block;
                color: #fff;
            }
            .welcome-text a:hover{
                background: #fff;
                color: #b99;
            }
            .welcome-text a{
                background: #fff;
                color: #333;
            }
          <%-----------------------------------------section 2--------------------------------------------------%>         
          .wrap1 {
                text-align: center;
                font-family: lato;
                font-size: 150%;
                color: #333;
                background: transparent;
                text-decoration: deepskyblue;
                padding: 20px 90px;
            }
            .wrap1 h2{
                font-family: lato;
                font-size: 45px;
                color: #333;
            }           
            .wrap1 h2{

                font-family:inherit;
                text-transform: uppercase;
                font-weight: bold;
                color:#000;
                text-align: center;
                margin-bottom: 45px;
                font-size: 35px;
            }
              .wrap1 p{
                font-size: 25px;
                text-align: center;
                font-family: initial;
                width: 1110px;
                margin: 2% auto;
                color: #000;

              }
               *{
                margin: 0px;
                padding: 0px;
                transition:ease all .4s ;
            }
            .container{
               background: linear-gradient(rgba(0,0,0,50),rgba(0,0,0,50));
               background-size: cover;
                width: 100%;
                height: 90vh;
                overflow: hidden;
                display: flex;
            }
            .one , .two{
                flex: 1;
                background-position: center;
                background-size: cover;
            }
            
            .content{
                width: 100%;
                height: 100vh;
            }
            .one .content{
        background: linear-gradient(to right,rgba(0,0,0,0),rgba(0,0,0,0));
      font-size: 30px;
        text-align: center;
        font-family: serif;
        padding: 190px 2px;
        color: #fff;
            }
            .two .content{
        background: linear-gradient(to right,rgba(0,0,0,0),rgba(0,0,0,0));
            }
            @media(max-width:768px)
            {
                .container{
                    flex-direction: column;
                    
                }
            }
            .xop-section{
               width: 700px;
                margin: 0 auto;
                padding: 20px 1px;
                height: 30vh;
                margin-top: 1px;
                -webkit-background-size:cover;
                background-size: cover;
            }
            .xop-section h2{
            color: aliceblue; 
            padding: 17px 220px;
            float: left;
            font-size: 35px;  
            }
            
            .xop-grid{
                padding: 1px 10px;
                list-style: image;
                display: inline-block;
                text-align: left;
                width: 90%;
          
            }            
            .xop-grid li{
                width: 175px;
                height: 200px;
                display:inline-block ;
                float:left;          
                padding: 10px 1px;
                
            }
            .xop-box{
                width:  160px;
                height: 160px;
                position: relative;
                cursor: pointer;
                border-radius: 10px;
                border: 2px solid #fff;
              transition: 0.3s ;
              background-size: cover;
            }
            .xop-img-1:hover , .xop-img-2:hover , .xop-img-3:hover , .xop-img-4:hover , .xop-img-5:hover , .xop-img-6:hover {
                transform: scale(1.40);
            }
            .xop-img-1{
                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,0.90)),url("img/home10.jpg");
                              background-size: cover;
                }
            .xop-img-2{
                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url("img/home6.jpg");
                              background-size: cover;
            }
            .xop-img-3{
                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url("img/home7.jpg");
                              background-size: cover;
            }
            .xop-img-4{
                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url("img/home8.jpg");
                              background-size: cover;
            }
            .xop-img-5{
                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url("img/home9.jpg");
                              background-size: cover;
            }
            .xop-img-6{
                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url("img/home11.jpg");
                              background-size: cover;
                 }
            
            .xop-info{
                position: absolute;
                width: inherit;
                height: inherit;
                text-align: center;
                text-decoration:none;

            }
            .xop-info h3{
                font-family:fantasy;
                font-weight: 900;
                color: #000;
                font-size: 25px;
                padding: 20px 10px;
                text-align: center;
                text-decoration:none;
            }           
 <%---------------------section 3--------------------------------------------%>
 .ab img{
     width:  80px;
                height:80px;
                position: relative;
                cursor: pointer;
                border-radius: 10px;
                border: 2px solid #fff;
               margin-left:380px;
 }
 .ab img:hover{
    opacity: 0.5;
                cursor: pointer;
 }
 .bc img{
  width:  90px;
                height:90px;
                position: relative;
                cursor: pointer;
                border-radius: 10px;
                border: 2px solid #fff;
               margin-left:380px;   
 }
 <%----------------------image slider-----------------------------%>
 * {
     box-sizing: border-box;
 }
body {
    font-family: Verdana, sans-serif;
}
.mySlides {
    display: none;
}
img {
    vertical-align: middle;
}

.slideshow-container {
  max-width: 750px;
  position: relative;
  margin: auto;
}
.slideshow-container h1{
    text-align:center;
    padding:30px 5px;
}

.dot {
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-blocks;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}

.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 0.6s;
  animation-name: fade;
  animation-duration: 2.6s;
}

@-webkit-keyframes fade {
  from {opacity: .1} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .1} 
  to {opacity: 1}
}

@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
}
<%------------------------------footer section---------------------------------------%>
 footer {
   background: linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)), url( "img/foot.jpg");
  margin-top: auto;
  width: 100%;
}
      
     ul {
        list-style: none;
        float: right;
        }
            .flex-rw {
         display: flex;
         flex-flow: row wrap;
}
    a {
      text-decoration: none;
     }
     .footer-list-top {
    width: 33.333%;
     }
     .footer-list-top > li {
      text-align: center;
      padding-bottom: 10px;
}
       .footer-list-header {
     padding: 10px 0 15px 0;
     color: #fff;
     font: 2.3vw "Oswald", sans-serif;
       }
    .footer-list-anchor {
       font: 1.3em "Open Sans", sans-serif;
     }
     .footer-social-section {
  width: 100%;
  align-items: center;
  justify-content: space-around;
  position: relative;
  margin-top: 5px;
}
.footer-social-section flex-rw{
    align-content: center;
}
.footer-social-section::after {
  content: "";
  position: absolute;
  z-index: 1;
  top: 50%;
  left: 10px;
  border-top: 1px solid #B99;
  width: calc(100% - 20px);
}
.footer-social-overlap {
  position: relative;
  z-index: 2;
  background: rgb(55,55,55);
  padding: 0 20px;
}
.footer-social-icons-wrapper {
    width: 100%;
    padding: 10PX 20PX;
    
  }
  .footer-social-overlap > a:not(:first-child) {
    margin-left: 20px;
  }
  .footer-bottom-section {
    padding: 0 5px 10px 5px;
  }
  .footer-bottom-wrapper {
    text-align: center;
    width: 100%;
    margin-top: 10px;
    background-color: white;
  }
  .foot{
       text-align: center;
    width: 100%;
    margin-top: 10px;
  color: #B99;

  }
  .footer-bottom-rights{
      background-color: white;
      font-size: 12px;
  }

@media only screen and (max-width: 480px) {
  .footer-social-overlap > a {
    margin: auto;
  }
  .footer-social-overlap > a:not(:first-child) {
    margin-left: 0;
  }
  .footer-bottom-rights {
    display: block;
  }
}
@media only screen and (max-width: 320px) {
  .footer-list-header {
    font-size: 2.2em;
  }
  .footer-list-anchor {
    font-size: 1.2em;
  }
  .footer-social-connect {
    font-size: 2.4em;
  }
  .footer-social-overlap > a {
    font-size: 2.24em;
  }
  .footer-bottom-wrapper {
    font-size: 1.3em;
    background-color: white;
    color: #B99;

  }
}
.footer-address{
    background-color: white;
    font-size: 15px;
}
.footer-icons{
align-content: center;
color: #B99;
margin-left:  350px;
margin-top:  10px;
margin-top: 50px;
font-size: 40px;

}
.footer-connect a{
    
     border: 1px solid #fff;
                padding:5px 15px;
                text-decoration:none;
                text-transform: uppercase;
                font-size: 13px;
                margin-top: 10px;
                display: inline-block;
                color: #bff;
                margin-left: 560px;
             
}
.footer-connect a:hover{
                background: #fff;
                color: #b99;
            }
            .footer-connect  a{
                background: #fff;
                color: #333;
            }
       .generic-anchor {
           color: #B99;        
	&:visited {
		color: #B99;
	}
	&:hover {
		color: #B99;
	}
         }
         
         #box5  img{
                width: 50px;
                margin:10px 0px 0 0; 
            }
             ab{
                width: 30px;
                margin:10px 0px 0 0; 
            }
            
 
        </style>
        <meta charset="UTF-8">
        <title>home</title>
        <link rel="spreadsheet" href="#">
        <link 
            href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" 
            rel="stylesheet">
        <link
         href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
            rel="stylesheet">
    </head>
    <body>
                <header>
                <div class="wrap">
                <div class="logo" >              
                    <img src="img/logo.png" alt="">          
                </div> 
                    <ul class="nav-area">
                    
                    <li><a href="login.jsp">login</a></li>
                     <li><a href="admin.jsp">Admin</a></li>                   
                    </ul>
                </div> 
                    <div class="welcome-text">
                    <h1><b>DECOR ARCADE</b></h1>
                    <br>
                    <section class="w1-container w1-center w2-content" style="max-width:600px">
                        <h2 class="w1">Are you looking for best Home Makeover!</h2>
                        <p class="w2"><i>We love your home</i></p>
                    </section>
                    <a href="footer">Contact us</a>
                </div> 
                </header>
        <%--------------------------------------------------section2--------------------------%>
        <br>
        <br>
        <br>
        <section class="wrap1">
            <h2>Why Decor Arcade?</h2> 
            
            <p>
                Most of these families are having serious financial problems. They're struggling to pay 
                their bills for home makeover, including the mortgage.Yes, Decor Arcade is doing great
                things to improve their homes and lifestyles.Decor Arcade is not only a home
                makeover application with a crunch budget but an effort to bring families together by making
                over their mundane living space into their dream homes.  
            </p>
            <br>
        </section>
        <%-----------------------------------section 3----------------------------%>
<!--        <section>
         
            <center>  <b> contact us:</b></center></h3>
               <div class="ab"> 
                   <img src="img/email.png" alt=""/><img src="img/at.png" alt=""/><img  src="img/phone.png" alt=""/>
            </div>
        <h3>Message Us:</h3>9164815372
        <h3>Mail Us:</h3>decorarcade6@gmail.com
        <h3>Call Us:</h3>9164815372</section>-->
        <%-----------------------image slider--------------------------%>
        <div class="slideshow-container">
            <h1> <u>Best Designes</u></h1>
<div class="mySlides fade">
  <img src="img/slide1.jpg" style="width:100%">
</div>
  <div class="mySlides fade">
  <img src="img/slide2.jpg" style="width:100%">
  </div>
  <div class="mySlides fade">
  <img src="img/slide3.jpg" style="width:100%">
  </div>
  <div class="mySlides fade">
  <img src="img/slide4.jpg" style="width:100%">
  </div>  
             <div class="mySlides fade">
   <img src="img/slide5.jpg" style="width:100%">
  </div> 
             <div class="mySlides fade">
  <img src="img/slide6.jpg" style="width:100%">
  </div> 
             <div class="mySlides fade">
  <img src="img/slide7.jpg" style="width:100%">
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
<!%----------------------------footer section-----------------------------%>
<footer class="foot-row" >           
            <ul class="footer-list-top">
                <li>
                    <h4 class="footer-list-header"><u>About Decor Arcade</u></h4></li>
        <li>
        <a href='/shop/about-mission' class="generic-anchor footer-list-anchor" itemprop="significantLink">GET TO KNOW US</a>
        </li>
        <li><a href='/promos.html' class="generic-anchor footer-list-anchor" itemprop="significantLink">PROMOS</a></li>
        <li>
       <a href='/retailers/new-retailers.html' class="generic-anchor footer-list-anchor" itemprop="significantLink">BECOME A DESIGNER</a>
        </li>
  <li>
        <a href='/shop/about-show-schedule' class="generic-anchor footer-list-anchor" itemprop="significantLink">EVENTS</a>
    </li>
            </ul>
            <ul class="footer-list-top">
    <li>
        <h4 class="footer-list-header"><u>Gift collection</u></h4></li>
    <li><a href='giftcard.jsp' class="generic-anchor footer-list-anchor">GIFT CARD</a></li>
    <li><a href='coupon.jsp' class="generic-anchor footer-list-anchor">20%OFF</a></li>
    <li><a href='/scratchcards/cat/id/32' class="generic-anchor footer-list-anchor">SCRATCH CARDS</a></li>
    <li><a href='/Ladies-Accessories/cat/id/117' class="generic-anchor footer-list-anchor" target="_blank">HANDBAGS & JEWELRY</a></li>
  </ul>
    <ul class="footer-list-top">
    <li id='help'>
        <h4 class="footer-list-header"><u>Please Help Me</u></h4></li>
    <li><a href='/shop/about-contact' class="generic-anchor footer-list-anchor" itemprop="significantLink">CONTACT</a></li>
    <li><a href='/faq.html' class="generic-anchor footer-list-anchor" itemprop="significantLink">FAQ</a></li>
    <li id='find-a-store'><a href='/shop/store-locator' class="generic-anchor footer-list-anchor" itemprop="significantLink">STORE LOCATOR</a></li>
    <li id='order-tracking'><a href='/shop/order-status' itemprop="significantLink" class="generic-anchor footer-list-anchor">PACKAGE STATUS</a></li>
  </ul>
<section>
    <div id="box5">
        <center> <b> <u> <p>follow us</p></u></b>
            <table>
                <tr>
                   <td><a href="https://instagram.com/decor_arcade" target="null"> <img src="img/instagram.png"alt="avatar"></a></td><td></td><td></td>
                   <td><a href="https://www.facebook.com/decor.arcade" target="null"><img src="img/facebook.png"alt="avatar"></a></td><td></td><td></td>
                   <td><img src="img/twitter.png"alt="avatar"></td>
                </tr>
           </table>
        </center>
    </div>
  </section>
  <section class="footer-bottom-section flex-rw">
  <div class="footer-bottom-wrapper">   
  <i class="fa fa-copyright" >
  </i> 2019 DecorArcade <address class="footer-address" >Mysore, India</address><span class="footer-bottom-rights"> - All Rights Reserved - </span>
    </div>
       <span class="footer-connect">
          <a href="#">CONTACT US</a>
        </span>
       <div class="foot">
   <a href="/terms-of-use.html" class="generic-anchor" rel="nofollow">Terms</a> | <a href="/privacy-policy.html" class="generic-anchor" rel="nofollow">Privacy</a>
            </div>
          </section>
        </footer>
    </body>
  </html>

