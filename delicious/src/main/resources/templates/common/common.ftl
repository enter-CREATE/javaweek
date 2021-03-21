<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>menu</title>
    <link rel="stylesheet" href="../../static/css/style_menu.css">
</head>
<body>
<div class="head">
    <div class="head_top">
        <div class="head_top_1">
            <span>欢迎用户</span>
        </div>
    </div>
    <div class="head_body">
        <div class="search">
            <form action="#">
                <input type="text">
                <button type="submit">搜索</button>
            </form>
        </div>
        <div class="pic"><img src="../../static/images/pic.jpg" alt=""></div>
    </div>
</div>
<div class="body">
    <ul id="nav">
        <li><a href="http://localhost:8888/delicious/menu/menu">首页</a></li>
        <li class="dropdown">
            <a href="http://localhost:8888/delicious/detail/list" class="dropbtn">美食浏览</a>
            <div class="dropdown-content">
                <a href="w">主食</a>
                <a href="w">各地小吃</a>
            </div>
        </li>
        <li class="dropdown">
            <a href="#" class="dropbtn">美食文化</a>
            <div class="dropdown-content">
                <a href="w">中国文化</a>
                <a href="w">外国文化</a>
            </div>
        </li>
        <li class="dropdown">
            <a href="http://localhost:8888/delicious/treasures/list" class="dropbtn">烹饪宝典</a>
            <div class="dropdown-content">
                <a href="w">中华菜谱</a>
            </div>
        </li>
        <li><a href="#">美食新闻</a></li>
        <li><a href="#">更多</a></li>
    </ul>
</div>
</body>
</html>