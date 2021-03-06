<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
    运输车辆资料列表
</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/invalid.css" type="text/css" media="screen"/>
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
    <div id="maintip"><strong>位置：</strong>运输车辆资料列表</div>
</div>
<div class="content-box role">
    <div class="content-box-content">
        <div class="tab-content default-tab" id="form">
            <div>
                <p style="float: left;margin:-16px 10px"><img src="images/user-info.gif"/></p>
                <p style="float: left;" class="left_txt2">运输车辆资料列表</p>
                <div align="center" style="float: left;margin-left: 40%">
                    <a href='addCus' class="btn btn-success"><span
                            class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;新增</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href='javascript:self.location.reload();' class="btn btn-success"><span
                            class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;刷新</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <A href="javascript:history.go(-1)" class="btn btn-success"><span
                            class="glyphicon glyphicon-backward"></span>&nbsp;&nbsp;返回</A>
                </div>
                <table id="tran" style="background-color: white" align="center" width="800" cellpadding="3" cellspacing="1"
                       border="1">
                    <thead style="font:16px bold">
                    <tr>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            车牌号
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            装车数量
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            出发地
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            目的地
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            发车时间
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            车辆状态
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            运输收入
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            运输成本
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            司机姓名
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            司机电话
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            负责人
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            负责人电话
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            运输工具
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            操作
                        </td>
                    </tr>
                    </thead>
                    <tbody style="border: 1px" align="center">
                    </tbody>
                    <script language="javascript">
                        function testDel() {
                            var val = document.getElementById("isDel").value;
                            if (val != "未发车") {
                                alert("已发车不能删除");
                                return false;
                            }
                            if (!confirm('删除确认')) {
                                return false;
                            }
                            return true;
                        }
                    </script>
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
        $.ajax({
            url: "tran",
            data: "pn=" + pn,
            type: "GET",
            success: function (result) {
                console.log(result);
                //1.解析并显示员工数据
                build_tran_table(result);
                //2.解析并显示分页信息
                build_page_info(result);
                //3.解析显示分页条数据
                build_page_nav(result);
            }
        });
    }
    var d=new Date();
    function build_tran_table(result) {
        //清空table表格
        $("#tran tbody").empty();
        var tran = result.extend.pageInfo.list;
        $.each(tran, function (index, item) {
            d.setTime(item.sendtime);
            var cardno = $("<td></td>").append(item.car.cardno);
            var gcount = $("<td></td>").append(item.gcount);
            var areaname = $("<td></td>").append(item.area1.areaname);
            var areaname1 = $("<td></td>").append(item.area2.areaname);
            var sendtime=$("<td></td>").append(d.toLocaleDateString());
            var carstatus = $("<td></td>").append(item.carstatus);
            var sendfee = $("<td></td>").append(item.sendfee);
            var carfee = $("<td></td>").append(item.carfee);
            var driver = $("<td></td>").append(item.driver);
            var drivertel = $("<td></td>").append(item.drivertel);
            var master = $("<td></td>").append(item.master);
            var mastertel=$("<td></td>").append(item.mastertel)
            var sendtypename = $("<td></td>").append(item.sendtype.sendtypename);
            var b1 = $("<button onclick="+"javascript:window.location.href='getCarroad?id="+ item.transid +"'></button>").addClass(
                "btn btn-primary btn-sm").append("途经站点");
            var b2 = $("<button onclick="+"javascript:window.location.href='getTran?id="+ item.transid +"'></button>").addClass(
                "btn btn-warning btn-sm").append("修改");
            var b3 = $("<button class='btn-danger'></button>").addClass(
                "btn btn-danger btn-sm").append("删除");
            b3.attr("del-id", item.transid);
            var btnTd = $("<td></td>").append(b1).append(" ").append(b2).append(" ").append(b3);
            $("<tr></tr>").append(cardno).append(gcount).append(areaname).append(areaname1).append(sendtime).
            append(carstatus).append(sendfee).append(carfee).append(driver).append(drivertel).append(master).
            append(mastertel).append(sendtypename).append(btnTd).appendTo("#tran tbody");
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
        $.each(result.extend.pageInfo.navigatepageNums, function (index,
                                                                  item) {
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

    //删除一条记录
    $(document).on("click", ".btn-danger", function () {
        //弹出是否确认删除对话框
        var transid = $(this).attr("del-id");
        layer.confirm("确认删除吗？", {
            btn: ['确认', '取消'] //按钮
        }, function () {
            //确认，发送ajax请求删除即可
            $.ajax({
                url: "/deltran/" + transid,
                type: "DELETE",
                success: function (result) {
                    layer.msg('删除成功', {icon: 1});
                    to_page(currentPage);
                }
            });
        }, function () {

        });
    });
</script>
</body>
</html>
