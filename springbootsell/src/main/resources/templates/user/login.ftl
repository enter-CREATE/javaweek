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
            background-color: darkcyan;
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
            left: 200px;
        }
        #na{
            width: 280px;
            height: 35px;
            position: relative;
            top: 35px;
        }
        #pw{
            width: 280px;
            height: 35px;
            position: relative;
            top: 50px;
        }
    </style>
</head>
<body>
<div class="big">
    <form class="form-horizontal" method="post" role="form" action="/seller/user/login">
    <div class="middule">
        <div id="na">账号：<input type="text" name="userName"><br></div>
        <div id="pw">密码：<input type="password" name="password"></div>
    </div>
    <button id="smart1" type="submit">登录</button>
    </form>
</div>
</body>
</html>
