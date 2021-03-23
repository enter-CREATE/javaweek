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
<div class="box">
    <#list unit as detail>
        <table class="table">
            <td><img src="${detail.delicacyImg}" alt="">
                <div>
                    <a href="http://localhost:8888/delicious/treasures/selects?delicacy_detail=${detail.delicacyName}">${detail.delicacyName}</a>
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