<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <style>
        *{padding: 0px;margin: 0px;}
        .big{
            height: 240px;
            width: 300px;
            border: 1px red solid;
            margin: 20px auto;
        }
        .middule{
            width: 280px;
            height: 120px;
            margin: 20px auto;
        }
        input{
            width: 200px;
            height: 30px;
        }
        #smart1{
            width: 60px;
            height: 45px;
            text-align: center;
            line-height: 45px;
            font-size: 24px;
            position: relative;
            top: 10px;
            left: 50px;
        }
        #smart2{
            width: 60px;
            height: 45px;
            text-align: center;
            line-height: 45px;
            font-size: 24px;
            position: relative;
            top: 10px;
            left: 100px;
        }
        #na{
            width: 280px;
            height: 35px;
            position: relative;
            top: 20px;
        }
        #pw{
            width: 280px;
            height: 35px;
            position: relative;
            top: 30px;
        }
    </style>
</head>
<body>
<div class="big">
    <div class="middule">
        <div id="na">账号：<input type="text"><br></div>
        <div id="pw">密码：<input type="password"></div>
    </div>
    <button id="smart1">登录</button>
    <button id="smart2">注册</button>
</div>
</body>
</html>