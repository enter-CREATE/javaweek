<html>
<#include "../common/header.ftl">
<body>
<div id="wrapper" class="toggled">
    <#--    边栏nav-->
    <#include "../common/nav.ftl">
    <#--     右侧-->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <table class="table table-bordered table-condensed">
                        <thead>
                        <tr>
                            <th>订单id</th>
                            <th>买家名字</th>
                            <th>买家手机号</th>
                            <th>买家地址</th>
                            <th>买家微信</th>
                            <th>订单总金额</th>
                            <th>订单状态</th>
                            <th>支付状态</th>
                            <th>创建时间</th>
                            <th>更新时间</th>
                            <th colspan="2">操作</th>
                        </tr>
                        </thead>
                        <tbody>

                        <#list orderList as order>
                            <tr class="success">
                                <td>${order.orderId}</td>
                                <td>${order.buyerName}</td>
                                <td>${order.buyerPhone}</td>
                                <td>${order.buyerAddress}</td>
                                <td>${order.orderAmount}</td>

                                <td>
<#--                                    //订单状态-->
                                    <#if order.orderStatus == 0>
                                        新订单
                                    <#elseif order.orderStatus == 1>
                                        完结
                                    <#elseif order.orderStatus == 2>
                                        已取消
                                    </#if>
                                </td>
<#--                                //支付状态-->
                                <td>
                                    <#if order.payStatus == 0>
                                        等待支付
                                    <#elseif order.payStatus == 1>
                                        支付成功
                                    </#if>
                                </td>

                                <td>${order.createTime}</td>
                                <td>${order.updateTime}</td>
                                <td><a href="/seller/order/details?detailId=${order.buyerOpenid}&orderId=${order.orderId}">详情</a></td>
                                <td>
                                    <#if order.orderStatus == 0>
                                        <a href="/seller/order/cancel?orderId=${order.orderId}">取消订单</a>
                                    <#elseif order.orderStatus == 1>
                                        完结
                                    <#else>

                                    </#if>
                                </td>
                            </tr>
                        </#list>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>