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
<form role="form"  method="post" action="/delicious/detail/save" style="margin-left: 165px;margin-right: 165px;font-size: 24px;color: #D61315;background-color: #F2B1AB">
    <div class="form-group" style="margin: 0 auto">
        <label for="exampleInputEmail1">菜名</label>
        <input name="productName" type="text" class="form-control" value="${(delicacyDetail.delicacyName)!''}">
    </div>

    <div class="form-group" style="margin: 0 auto">
        <label for="exampleInputEmail1">类型</label>
        <input name="productPrice" type="text" class="form-control" value="${(delicacyDetail.delicacyType)!''}">
    </div>

    <div class="form-group" style="margin: 0 auto">
        <label for="exampleInputEmail1">简介</label>
        <input name="productStock" type="text" class="form-control" value="${(delicacyDetail.delicacyExplain)!''}">
    </div>

    <div class="form-group" style="margin: 0 auto">
        <label for="exampleInputEmail1">菜系</label>
        <input name="productDescription" type="text" class="form-control" value="${(delicacyDetail.delicacyDepartment)!''}">
    </div>

    <div class="form-group" style="margin: 0 auto">
        <label for="exampleInputEmail1">菜品图片</label>
        <img width="100" height="100" src="${(delicacyDetail.delicacyImg)!''}" alt="">
        <input name="productIcon" type="text" class="form-control" value="${(delicacyDetail.delicacyImg)!''}">
    </div>

    <input hidden type="text" name="productId" value="${(delicacyDetail.detailId)!''}">
    <button type="submit" class="btn btn-default" style="font-size: 20px;margin: 0 140px">提交</button>
</form>
</body>
</html>