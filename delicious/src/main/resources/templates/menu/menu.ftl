<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../../static/css/style_menu.css">
    <#include "../common/common.ftl.html">
</head>
<body>
<div class="container">
    <div class="wrap" style="left: -600px;">
        <img src="images/5.jpg" alt="">
        <img src="images/1.jpg" alt="">
        <img src="images/2.jpg" alt="">
        <img src="images/3.jpg" alt="">
        <img src="images/4.jpg" alt="">
        <img src="images/5.jpg" alt="">
        <img src="images/1.jpg" alt="">
    </div>
    <div class="buttons">
        <span class="on">1</span>
        <span>2</span>
        <span>3</span>
        <span>4</span>
        <span>5</span>
    </div>
    <a href="javascript:;" class="arrow arrow_left"><</a>
    <a href="javascript:;" class="arrow arrow_right">></a>
</div>
</div>
<script>
    var wrap = document.querySelector(".wrap");
    var next = document.querySelector(".arrow_right");
    var prev = document.querySelector(".arrow_left");
    next.onclick = function () {
        next_pic();
    }
    prev.onclick = function () {
        prev_pic();
    }
    function next_pic () {
        index++;
        if(index > 4){
            index = 0;
        }
        showCurrentDot();
        var newLeft;
        if(wrap.style.left === "-3600px"){
            newLeft = -1200;
        }else{
            newLeft = parseInt(wrap.style.left)-600;
        }
        wrap.style.left = newLeft + "px";
    }
    function prev_pic () {
        index--;
        if(index < 0){
            index = 4;
        }
        showCurrentDot();
        var newLeft;
        if(wrap.style.left === "0px"){
            newLeft = -2400;
        }else{
            newLeft = parseInt(wrap.style.left)+600;
        }
        wrap.style.left = newLeft + "px";
    }
    var timer = null;
    function autoPlay () {
        timer = setInterval(function () {
            next_pic();
        },2000);
    }
    autoPlay();

    var container = document.querySelector(".container");
    container.onmouseenter = function () {
        clearInterval(timer);
    }
    container.onmouseleave = function () {
        autoPlay();
    }

    var index = 0;
    var dots = document.getElementsByTagName("span");
    function showCurrentDot () {
        for(var i = 0, len = dots.length; i < len; i++){
            dots[i].className = "";
        }
        dots[index].className = "on";
    }

    for (var i = 0, len = dots.length; i < len; i++){
        (function(i){
            dots[i].onclick = function () {
                var dis = index - i;
                if(index == 4 && parseInt(wrap.style.left)!==-3000){
                    dis = dis - 5;
                }
                if(index == 0 && parseInt(wrap.style.left)!== -600){
                    dis = 5 + dis;
                }
                wrap.style.left = (parseInt(wrap.style.left) +  dis * 600)+"px";
                index = i;
                showCurrentDot();
            }
        })(i);
    }
</script>
</body>
</html>