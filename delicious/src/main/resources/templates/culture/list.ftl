<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../../static/css/style_culture.css">
    <#include "../common/common.ftl">
</head>
<body>

<div class="wrapper">
    <table class="table">
        <thead>
        <tr>
            <th>
                Id
            </th>
            <th>
                食品图片
            </th>
            <th>
                代表食品
            </th>
            <th>
                菜系
            </th>
            <th>
                风格
            </th>

            <th>
                创建时间
            </th>
        </tr>
        </thead>
        <tbody>

        <#list cultureList as culture>
            <tr class="success">
                <td>
                    ${culture.cultureId}
                </td>
                <td>
                    <img src="${culture.img}" alt="">
                </td>
                <td>
                    ${culture.foodName}
                </td>
                <td>
                    ${culture.cultureName}
                </td>
                <td>
                    ${culture.cultureStyle}
                </td>
                <td>
                    ${culture.createTime}
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>

</body>
</html>