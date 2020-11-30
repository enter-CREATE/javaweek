<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>商品类别显示</title>
    <link rel="stylesheet" href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.0.1/css/bootstrap-theme.css">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>商品类别列表</h1>
            </div>
            <table class="table">
                <thead>
                <tr>
                    <th>类目id</th>
                    <th>类目名称</th>
                    <th>类目编号</th>
                    <th>创建时间</th>
                    <th>更新时间</th>
                </tr>
                </thead>
                <tbody>
                <#list categoryList as category>
                    <tr class="success">
                        <td>
                            ${category.categoryId}
                        </td>
                        <td>
                            ${category.categoryName}
                        </td>
                        <td>
                            ${category.categoryType}
                        </td>
                        <td>
                            ${category.createTime}
                        </td>
                        <td>
                            ${category.updateTime}
                        </td>
                    </tr>
                </#list>
            </table>
        </div>
    </div>
</div>
</body>
</html>