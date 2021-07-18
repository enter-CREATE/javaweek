<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <#include "../common/common.ftl">
    <link rel="stylesheet" href="../../static/css/style_detail.css">
</head>
<body>
<div>
    <a href="/delicious/detail/index" style="color: #D61315;margin-left: 1138px">点击此次即可添加菜品</a>
</div>
<div class="box">
    <#list detailList as detail>
    <table class="table">
            <td><img src="${detail.delicacyImg}" alt="">
                <div>
                    <a href="http://localhost:8888/delicious/treasures/selects?delicacy_detail=${detail.delicacyName}">${detail.delicacyName}</a>
                    <button style="float: right;color: #D61315">删除此菜品</button>
                    <p>
                        &nbsp;&nbsp;&nbsp;&nbsp;${detail.delicacyType}
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        ${detail.delicacyDepartment}<br>
                        &nbsp;&nbsp;&nbsp;&nbsp;${detail.delicacyExplain}
                    </p>

                </div>
            </td>
    </table>
    </#list>
</div>
</body>
</html>