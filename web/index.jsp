<%@ page import="Servlets.QHandler" %><%--
  Created by IntelliJ IDEA.
  User: Denis
  Date: 12.09.2016
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width-device-width, initial-scale-1.0"/>
    <title> 2D&Paul </title>
    <link rel="stylesheet" href="css/style.css" media="screen"/>



</head>
<body>

<div id="particles-js"></div>

<div id="ship"></div>

<div class="page-wrapper">



    <div class="imgQest"><img src="img/qest.png"/><div id="priv">Задай вопрос вселенскому разуму</div></div>

    <form action="QHandler">
        <div class="vopros">

        <center>
            <div id="vpr">
            <i> <h2 id="intro"> Что делать если ? </h2></br>
              <input type="text" name="question" onfocus="this.value" placeholder="Напишите вопрос тут" /></br>
                 <button id="but1">Узнать ответ!</button></i>
            </div>
        </center>

        </div>
    </form>

</div>


<script src="assets/jquery/jquery-3.1.0.js"defer ></script>

<script src="assets/particles/particles.js" defer></script>
<script src="js/main.js"defer ></script>
<script src="assets/flipping_text-master/jquery.flipping_text.js"defer ></script>


</body>
</html>