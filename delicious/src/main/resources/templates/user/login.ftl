<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../../static/css/style_login.css">
</head>
<body>
<div class="first">
    <img src="../../static/images/login.png" alt="">
    <form class="second" method="post" role="form" action="/delicious/user/login">
        <div class="s_first"><span>用户登录</span></div>

        <div class="input_content">
            <div id="na">
                <input type="text" autocomplete="off" placeholder="用户名" name="userName" required="required"/>
            </div>
            <div id="pw" style="margin-top: 16px">
                <input type="password"
                       autocomplete="off" placeholder="登录密码"
                       name="password" required="required" maxlength="32"/>
            </div>
        </div>
        <div style="text-align: center">
            <button id="smart1" type="submit" class="enter-btn" >登录</button>
        </div>
        <div class="foo">
            <div style="float: left;"><span>忘记密码 ?</span></div>
            <div style="float: right;"><span>注册账户</span></div>
        </div>
    </form>
</div>

</body>
</html>