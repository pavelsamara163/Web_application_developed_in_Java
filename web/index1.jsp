<%@ page import="Servlets.QHandler" %><%--
  Created by IntelliJ IDEA.
  User: Павел
  Date: 12.09.2016
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Refresh" content="5; url=http://localhost:8080/adviser.net/index.jsp"/>
    <meta charset="UTF-8">
    <meta name="viewport" content="width-device-width, initial-scale-1.0"/>
    <title> 2D&Paul </title>
    <link rel="stylesheet" href="css/style.css" media="screen"/>



</head>
<body>

<div id="particles-js"></div>

<div id="ship1"></div>

<div class="page-wrapper1">

    <div class="imgOtvet"><img src="img/obot.png"/>
        <center>
    <div class="qest"><em><h2><%QHandler handler = new QHandler();%>
        <%=handler.getAnswer()%>
    </h2></em></div>
        </center>
    </div>


</div>


<script src="assets/jquery/jquery-3.1.0.js" defer></script>
<script src="assets/particles/particles.js" defer></script>
<script src="js/main.js" defer></script>
<script src="assets/flipping_text-master/jquery.flipping_text.js" defer></script>

</body>
</html>