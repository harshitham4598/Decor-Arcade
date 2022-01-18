<%-- 
    Document   : login
    Created on : Mar 14, 2019, 3:11:17 AM
    Author     : HARSHI
--%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <style>
           @import"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css";
            body{
                margin: 0;
                padding: 0;
                font-family: serif;
                background:linear-gradient(rgba(0,0,0,2),rgba(0,0,0,0)), url("img/admin1.jpg");
                height:110vh;
                background-size:cover;
            }
            .wrap{
            width :1170px;
            margin:auto;
            }
            .nav-area{
                float:right;
                list-style:none;
                margin-top: 20px;
            }
            
            .nav-area li{
                display:inline-block;
            }
            .nav-area li a{
                color:#fff;
                text-decoration: snow;
                padding:5px 10px;
                font-family: poppins;
                font-size: 16px;
            }
            .nav-area li a:hover{
                background: #fff;
                color: #333;
            }
            .logo img
            {
                padding:10px 5px;
                width: 140px ;
                float:left;
                height: 100px;
            }
            .Login-page{
                width: 360px;
                padding: 10% 0 0;
                margin: auto;
            }            
            .register-form{
                width: 280px;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50% ,-50%);
                color: #fff;
            }
            .register-form h1{
                float: left;
                font-size: 40px;
                border-bottom: 6px solid #fff;
                margin-bottom: 50px;
                padding: 3px;
            }
             .login-form{
                width: 280px;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50% ,-50%);
                color: #fff;
            }
            .login-form h1{
                float: left;
                font-size: 40px;
                border-bottom: 6px solid #fff;
                margin-bottom: 50px;
                padding: 3px;
            }
            .textbox{
                width: 100%;
                overflow: hidden;
                font-size: 20px;
                padding: 8px 0;
                margin: 8px 0;
                border-bottom: 1px solid activecaption;
            }
            .textbox i{
                width: 26px;
                float: left;
                text-align: center;
            }
            .textbox input{
                border: none;
                outline: none;
                background: none;
                color: #fff;
                font-size: 18px;
                width: 80%;
                float: left;
              margin: 0 10px;  
            }
            .btn{
                width:  100%;
                background: none;
                border: 2px solid #fff;
                color: #fff;
                padding: 5px 5px;
                font-size: 18px;
                cursor: pointer;
                margin: 12px;
                align-items: center;
            }
            a{
                text-decoration: none;
                color: #fff;
                cursor: pointer;
            padding: 15px 50px;
                width:  100%;
                    margin: 12px 0;
                background: none;

                text-align: center;
            }
            .form .message{
                margin: 15px 0 0;
                color: aliceblue;
                font-size: 18px;
                padding: 0 20px;
 
            }
            
            .form .message a{
                color: #ccccff;
                text-decoration: none;
                font-size: 20px;
                padding: 18px 15px;
            }
            .form .register-form{
                display: none;
            }
            .form button:hover,.form button:active
            {
                background: #ccccff;
            }
            
        </style>
                <meta charset="UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="#">
    </head>
    <body>
         <header>
            <div class="wrap">
                         <div class="logo" >              
                        <img src="img/logo.png" alt="">          
                         </div>
                <div id="navbar">
                <ul class="nav-area">
                    <li><a href="main.jsp">Home</a></li>
                    
                </ul>
             </div>
             <div class="Login-page">
             <div class="form">
                             
                 <form class="login-form" action="1admin.jsp" method="post" >
                             <h1>LOGIN</h1>
                               
                             <div class="textbox" >
<i class="fa fa-user-circle" aria-hidden="true"></i>

                <input type="text" placeholder="username" name="uname"  >
            </div>
             <div class="textbox" >
<i class="fa fa-unlock-alt" aria-hidden="true"></i>

                <input type="password" placeholder="password" name="pass"  >
            </div>
          <input class="btn" type="submit"  value="LOGIN" > 
    
            </p>
                         </form>             
</div>
             </div>        
        <script src='https://code.jquery.com/jquery-3.3.1.min.js'>
        </script>
        <script>
         $('.message a').click(function(){
        $('form').animate({height:"toggle",opacity:"toggle"},"slow");
    });
        </script>        
    </body>
</html>

