<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking Page</title>
        <style>
            *{
         box-sizing: border-box;
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
                width: 150px ;
                float:left;
                height: 130px;
            }
            <%------------------logo ends here------------------%>
            form{
                background-color: rgba(128,128,128,0.6);
                width:500px;
                margin-left:35%; 
                color:white;
                margin-top:-5%;
            }
     input[type=text], select, textarea {
     width: 100%;
     padding: 10px 12px;
     border: 2px solid #ccc;
     border-radius: 6px;
     resize: vertical;
     margin-left:20px;
}
     label {
       padding: 12px 12px 12px 21px;
       display: inline-block;
       font-size:120%;
    }
    input[type=submit] {
      background-color: #4CAF50;
      color: white;
      padding: 12px 30px;
      border: none;
      border-radius: 6px;
      cursor: pointer;
      
     }
    input[type=submit]:hover {
       background-color: #45a049;
    }
    .container {
    border-radius: 5px;
    background: linear-gradient(rgba(0,0,0,1),rgba(0,0,0,0)), url( "img/booking.jpg");
    height:150vh;
    background-size:cover;
    padding: 130px 20px;
     }
    .col-25 {
      float: left;
      width: 25%;
      margin-top: 6px;
      }
    .col-75 {
      float: left;
      width: 65%;
      margin-top: 6px;
     }
   .row:after {
     content: "";
     display: table;
     clear: both;
     }
    @media screen and (max-width: 600px) {
     .col-25, .col-75, input[type=submit] {
      width: 100%;
       margin-top: 0;
    }
   }
   .col-76 {
      float: right;
      width: 65%;
      margin-top: 18px;
             padding:0px 10px;
     }
       @media screen and (max-width: 600px) {
   .col-76 {
      width: 100%;
       margin-top: 0;
    }}
   .contain{
       width:20px;
       height:20px;
      margin-left:100px;
   }
    .checkmark{
        width:200px;
        height:20px;
    }
    <%----------------------------checkbox--------------------%>
    .multiselect {
  width: 200px;
}

.selectBox {
  position: relative;
   padding:7px 0px;
 float:left;
}

.selectBox select {
  width: 160%;
  font-family: sans-serif solid;
  font-size: 15px;
  padding:10px 10px;
}

.overSelect {
  position: absolute;

 }

#checkboxes {
  display: none;
  border: 1px #dadada solid;
}

#checkboxes label {
  display: block;
}

#checkboxes label:hover {
  background-color:whitesmoke;
}
.check{
    font-family: sans-serif;
    font-size: 10px;
}
.cen{
    float:left;
padding:0px 140px;
}
.checkmark{
    width:25px;
    height:25px;
    background-color:#EEE;
}
        </style>
<meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Design</title>
        <link rel="stylesheet" href="#">             
        <link
         href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
            rel="stylesheet">   
    </head>
    <body>
        <%
        response.setHeader("Cache-Control" , "no-cache, no-store, must-revalidate");
        if(session.getAttribute("em")== null){
         response.sendRedirect("main.jsp");
        }
        %>
        <div class="wrap">
                <div class="logo" >              
                    <img src="img/logo.png" alt="">          
                </div> 
                    <ul class="nav-area">
                    <li><a href="home.jsp">Home</a></li>
                    <li><a href="logout.jsp">logout</a></li>                    
                    </ul>
                </div> 
        <br>
        <div class="container">
            <form action="1booking.jsp" method="post"><br>
      <center><h1><u>BOOKING</u></h1></center>
    <div class="row">
      <div class="col-25">
        <label for="fname">First Name:</label>
      </div>
      <div class="col-75">
        <input type="text" id="fname" name="fname" placeholder="Your name..">
      </div>
    </div>      
       <div class="row">
      <div class="col-25">
        <label for="fname">Phone number:</label>
      </div>
      <div class="col-75">
          <input type="text" id="pno" name="phone" placeholder="Your number.." pattern="[6-9][0-9]{9}">
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="fname">Email ID:</label>
      </div>
      <div class="col-75">
        <input type="text" id="email" name="email" placeholder=" email..">
      </div>
    </div>
     <%---------------------------------------address----------------------%>  
    <div class="row">
      <div class="col-25">
        <label for="subject">Address:</label>
      </div>
      <div class="col-75">
        <textarea id="subject" name="address" placeholder="Write something.." style="height:100px"></textarea>
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="fname">Date:</label>
      </div>
      <div class="col-76">
        <input type="date" id="date" name="date" placeholder="">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="country">Package:</label>
      </div>
      <div class="col-75">
        <select id="country" name="pac">
           <option value="average">Average</option>
          <option value="premium">Premium</option>
          <option value="awesome">Awesome</option>
        </select>
      </div>
    </div>
 
     
    
   <%----------------------------------checkbox-------------------------------%>
<div class="row">
      <div class="col-25">
          <label for="subject">Design:</label>
          <center> <table class="cen">
                  <tr>
                      <td><input type="checkbox" class="checkmark" value="WallPainting" name="vocher"><br>Wall Painting <td></td><td></td><td></td><td></td>
                  <td><input type="checkbox"  class="checkmark" value="spaceplanning" name="vocher" /><br>Space Planning</td><td></td><td></td><td></td><td></td><td></td>
                  <td><input type="checkbox" class="checkmark" value="woodwork&furniture" name="vocher" /><br>WoodWork & furniture</td>

              </tr>
              
              <tr>
                   <td><input type="checkbox" class="checkmark" value="tiling&flooring" name="vocher"/><br>Tiling & Flooring</td><td></td><td></td><td></td><td></td>
                  <td><input type="checkbox" class="checkmark" value="decore&interior" name="vocher" /><br>Decor & Interior </td><td></td><td></td><td></td><td></td><td></td>

                  <td> <input type="checkbox" class="checkmark" value="all" name="vocher"/><br>All Designs</td>
              </tr>
              </table> </center>
  </div>
</div>

       
 <div class="row">
        <br>
        <center><input type="submit" value="book"></center>
        <br>
    </div>
</form>
 </div>
    </body>
</html>