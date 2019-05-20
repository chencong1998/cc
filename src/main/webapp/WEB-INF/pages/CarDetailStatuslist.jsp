<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
    <title>订单查询结果</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/reset.css" type="text/css"
          media="screen"/>
    <link rel="stylesheet" href="css/style.css" type="text/css"
          media="screen"/>
    <link rel="stylesheet" href="css/invalid.css" type="text/css"
          media="screen"/>
    <script language="javascript" src="js/jquery-1.7.2.js"></script>
    <!-- 引入jquery -->
    <script type="text/javascript" src="static/js/jquery.min.js"></script>
    <!-- 引入样式 -->
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="layer/layer.js"></script>
</head>
<body>
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip">
        <strong>位置：</strong>订单查询
    </div>
</div>
<div class="content-box role">
    <div class="content-box-content">
        <div class="tab-content default-tab" id="form">
            <div>
                <p style="float: left;margin:-16px 10px"><img src="images/user-info.gif"/></p>
                <p style="float: left;" class="left_txt2">订单查询</p>
                <div align="center" style="float: left;margin-left: 60%">
                    <a href='javascript:self.location.reload();' class="btn btn-success"><span
                            class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;刷新</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <A href="javascript:history.go(-1)" class="btn btn-success"><span
                            class="glyphicon glyphicon-backward"></span>&nbsp;&nbsp;返回</A>
                </div>
                <input type="hidden" id="i0" value="${detailid}"/>
                <input type="hidden" id="i1" value="${orderid}"/>
                <input type="hidden" id="i2" value="${transID}"/>
                <input type="hidden" id="i3" value="${sendCustID}"/>
                <input type="hidden" id="i4" value="${sendCity}"/>
                <input type="hidden" id="i5" value="${receCustID}"/>
                <input type="hidden" id="i6" value="${receCity}"/>
                <table style="background-color: white" id="detailss" align="center" width="800" cellpadding="3"
                       cellspacing="1" border="1">
                    <thead style="font:16px bold">
                    <tr>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">订单号
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">托运日期
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">车牌号
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">发货单位
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">收货单位
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">货物名称
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">包装
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">件数
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">运输费
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">保险费
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">其他费
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">出发地
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">目的地
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap"
                            style="BORDER: #c1dad7 1px solid">是否发货
                        </td>
                    </tr>
                    </thead>
                    <tbody style="border: 1px" align="center">
                    </tbody>
                </table>
                <table style="color: white">
                    <tr>
                        <td>
                            <div class="row">
                                <!-- 分页文字信息 -->
                                <div class="col-md-6" id="page_info_area"></div>
                                <!-- 分页条信息 -->
                                <div class="col-md-6" id="page_nav_area"></div>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    var totalRecode, currentPage;
    /* 1.页面加载完成以后，直接去发送一个ajax请求，要到分页数据 */
    $(function () {
        //去首页
        to_page(1);
    });

    function to_page(pn) {
        var i0 = document.getElementById("i0").value;
        var i1 = document.getElementById("i1").value;
        var i2 = document.getElementById("i2").value;
        var i3 = document.getElementById("i3").value;
        var i4 = document.getElementById("i4").value;
        var i5 = document.getElementById("i5").value;
        var i6 = document.getElementById("i6").value;
        $.ajax({
            url: "detailss",
            data: {"pn": pn, "i0": i0, "i1": i1, "i2": i2, "i3": i3, "i4": i4, "i5": i5, "i6": i6},
            type: "POST",
            dataType:'json',
            asyncy:'true',
            success: function (result) {
                console.log(result);
                //1.解析并显示员工数据
                //document.write(result)
                build_detailss_table(result);
                //2.解析并显示分页信息
                build_page_info(result);
                //3.解析显示分页条数据
                build_page_nav(result);
            }
        });
    }
    /*var d = new Date();*/
    function build_detailss_table(result) {
        //清空table表格
        $("#detailss tbody").empty();
        var detailss = result.extend.pageInfo.list;
        //alert(detailss)
        $.each(detailss, function (index, item) {
            var detailid = $("<td></td>").append(item.detailid);
            var sendtime = $("<td></td>").append(item.sendtime);
            var cardno = $("<td></td>").append(item.car.cardno);
            var customername = $("<td></td>").append(item.customer.customername);
            var customername1 = $("<td></td>").append(item.customer1.customername);
            var goodsname = $("<td></td>").append(item.goodsname);
            var unitname = $("<td></td>").append(item.unitname);
            var gcount = $("<td></td>").append(item.gcount);
            var sendfee = $("<td></td>").append(item.sendfee);
            var insurancefee = $("<td></td>").append(item.insurancefee);
            var otherfee = $("<td></td>").append(item.otherfee);
            var areaname = $("<td></td>").append(item.area.areaname)
            var areaname1 = $("<td></td>").append(item.area1.areaname);
            var orderid = $("<td></td>").append(item.orderid);
            $("<tr></tr>").append(detailid).append(sendtime).
            append(cardno).append(customername).
            append(customername1).append(goodsname).
            append(unitname).append(gcount).
            append(sendfee).append(insurancefee).
            append(otherfee).append(areaname).
            append(areaname1).append(orderid).
            appendTo("#detailss tbody");
        });
    }
    //解析显示分页信息
    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append(
            "当前" + result.extend.pageInfo.pageNum + "页,总"
            + result.extend.pageInfo.pages + "页,总"
            + result.extend.pageInfo.total + "记录")
        totalRecode = result.extend.pageInfo.total;
        currentPage = result.extend.pageInfo.pageNum;
    }

    function ifadd(id, pn) {
        if (id != "") {
            to_page(id * 2);
            return true;
        }
        if (pn != "") {
            to_page(pn);
            return true;
        }
        if (id == "" || pn == "") {
            to_page(1);
            return true;
        }
    }

    //解析显示分页条,点击分页要能去下一页....
    function build_page_nav(result) {
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        //构建元素
        var firstPageLi = $("<li></li>").append(
            $("<a></a>").append("首页"));
        var prePageLi = $("<li></li>").append(
            $("<a></a>").append("&laquo;"));
        if (result.extend.pageInfo.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        } else {
            //为元素添加点击翻页的事件
            firstPageLi.click(function () {
                to_page(1);
            });
            prePageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum - 1);
            });
        }
        var nexPageLi = $("<li></li>").append(
            $("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append(
            $("<a></a>").append("末页"));
        if (result.extend.pageInfo.hasNextPage == false) {
            nexPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        } else {
            nexPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum + 1);
            });
            lastPageLi.click(function () {
                to_page(result.extend.pageInfo.pages);
            });
        }
        //添加首页和前一页的提示
        ul.append(firstPageLi).append(prePageLi);
        //回调函数
        //1,2,3,4,5
        $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if (result.extend.pageInfo.pageNum == item) {
                numLi.addClass("active");
            }
            numLi.click(function () {
                to_page(item);
            });
            ul.append(numLi);
        });
        ul.append(nexPageLi).append(lastPageLi);
        //把ul加入到nav
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }
</script>
</body>
</html>
