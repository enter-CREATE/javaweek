<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <#include "../common/common.ftl">
    <link rel="stylesheet" href="../../static/css/style_treasures.css">
</head>
<body>
<div class="box">
    <#list units as treasures>
        <table class="table">
            <td><img src="${treasures.delicacyImg}" alt="">
                <div class="float">
                    <p>
                        ${treasures.delicacyName}(${treasures.delicacyDepartment})<br>
                        主料：${treasures.culinaryMainMaterials}<br>
                        配料：${treasures.culinaryAccessories}<br>
                        调料：${treasures.culinarySeasoning}
                    </p>
                </div>
                <div class="ex">
                    <p>具体步骤：<br>
                        ${treasures.culinaryExplain}
                    </p>
                </div>
            </td>
        </table>
    </#list>
</div>
</body>
</html>