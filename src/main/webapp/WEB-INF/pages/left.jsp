<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link rel="StyleSheet" href="css/dtree.css" type="text/css"/>
    <script type="text/javascript" src="../../js/menu.js"></script>
</head>
<body style="background-color:#FFFFFF;margin:0;">
<script type="text/javascript">
    d = new dTree('d');
    d.add(0, -1, '&nbsp;系统菜单', '', 'images/daohang.jpg');
    if (1 == "1") {
        d.add(1, 0, '&nbsp;用户管理', '', 'images/ico_System.gif', 'images/ico_System.gif');
    }

    if (1 == "1") {
        d.add(10, 1, '&nbsp;新增用户', 'addUser', 'images/send.jpg');
    }
    if (1 == "1") {
        d.add(11, 1, '&nbsp;用户列表', './UserServlet?action=list&currPage=1&opr=first', 'images/ico_System.gif');
    }
    if (1 == "1") {
//d.add(12,1,'&nbsp;修改资料','kjsdx.aspx','images/ico_Sms.gif');
    }
    if (1 == "1") {
        d.add(15, 1, '&nbsp;修改密码', 'modifypwd.jsp', 'images/ico_Search.gif');
    }
    if (1 == "1") {
        d.add(9, 0, '&nbsp;客户管理', '', 'images/ico_Log.gif', 'images/ico_Log.gif');
    }
    if (1 == "1") {
        d.add(91, 9, '&nbsp;新增客户', './CustomerServlet?action=init', 'images/ico_DecisionMaking.gif');
    }
    if (1 == "1") {
//d.add(92,9,'&nbsp;修改资料','SendDBMsg.jsp','images/ico_Form.gif');
    }
    if (1 == "1") {
        d.add(93, 9, '&nbsp;客户资料', './CustomerServlet?action=list&currPage=1&opr=first', 'images/ico_DataDict.gif');
    }
    if (0 == "1") {
//d.add(94,9,'&nbsp;批量发送记录','kdxfsjls.aspx','images/ico_Passenger.gif');
    }
    if (1 == "1") {
        d.add(3, 0, '&nbsp;运输工具', '', 'images/ico_MaterialClass.gif', 'images/ico_MaterialClass.gif');
    }
    if (1 == "1") {
        d.add(31, 3, '&nbsp;新增汽车', './CarServlet?action=init', 'images/ico_Page.gif');
    }
    if (1 == "1") {
        d.add(32, 3, '&nbsp;资料列表', './CarServlet?action=list&currPage=1&opr=first', 'images/ico_Passenger.gif');
    }
    if (1 == "1") {
        d.add(5, 0, '&nbsp;运输管理', '', 'images/ico_User.gif', 'images/ico_User.gif');
    }
    if (1 == "1") {
        d.add(51, 5, '&nbsp;车辆调度', './TransCarServlet?action=list&currPage=1&opr=first', 'images/ico_Role.gif');
    }
    if (1 == "1") {
        d.add(52, 5, '&nbsp;订单管理', './CarDetailServlet?action=list&currPage=1&opr=first', 'images/ico_EventSign.gif');
    }
    if (1 == "1") {
        d.add(53, 5, '&nbsp;未发车', './TransCarServlet?action=initstart&currPage=1&opr=first', 'images/ico_Expert.gif');
    }
    if (1 == "1") {
        d.add(54, 5, '&nbsp;已发车', './TransCarServlet?action=initfinish&currPage=1&opr=first', 'images/ico_Expert.gif');
    }
    if (1 == "1") {
        d.add(55, 5, '&nbsp;已到站', './TransCarServlet?action=over&currPage=1&opr=first', 'images/ico_Expert.gif');
    }
    if (1 == "1") {
        d.add(56, 5, '&nbsp;订单明细', './CarDetailServlet?action=rep', 'images/ico_Excel.gif');
    }
    if (1 == "1") {
//d.add(57,5,'&nbsp;付款状态','kyftj.aspx','images/yw.gif');
    }
    if (1 == "1") {
//d.add(58,5,'&nbsp;车辆货物明细','kndtj.aspx','images/Zxtj.gif');
    }
    if (1 == "1") {
        d.add(7, 0, '&nbsp;财务管理', '', 'images/Zxmxtj.gif', 'images/Zxmxtj.gif');
    }
    if (1 == "1") {
        d.add(71, 7, '&nbsp;收付款管理', './CustomerServlet?action=rep', 'images/yw.gif');
    }
    if (1 == "1") {
        d.add(72, 7, '&nbsp;客户往来明细', 'BalanceRep.jsp', 'images/Zxtj.gif');
    }
    if (1 == "1") {
        d.add(73, 7, '&nbsp;客户往来统计', 'BalanceRep2.jsp', 'images/Zxtj.gif');
    }


    if (1 == "1") {
        d.add(6, 0, '&nbsp;系统管理', '', 'images/ico_Resource.gif', 'images/ico_Resource.gif');
    }
    if (1 == "1") {
        d.add(61, 6, '&nbsp;区域设置', './AreaServlet?action=list&currPage=1&opr=first', 'images/ico_Refresh.gif');
    }
    if (1 == "1") {
        d.add(62, 6, '&nbsp;运输工具类别', './SendTypeServlet?action=list&currPage=1&opr=first', 'images/sound.gif');
    }
    if (1 == "1") {
        d.add(63, 6, '&nbsp;客户类型设置', './CustTypeServlet?action=list&currPage=1&opr=first', 'images/2.gif');
    }
    if (1 == "1") {
        d.add(64, 6, '&nbsp;付款方式设置', './PaidTypeServlet?action=list&currPage=1&opr=first', 'images/xtyh.gif');
    }
    if (1 == "1") {
        d.add(65, 6, '&nbsp;订单状态设置', './OrderStatusServlet?action=list&currPage=1&opr=first', 'images/xtyh.gif');
    }
    if (1 == "1") {
        d.add(8, 0, '&nbsp;安全管理', '', 'images/ico_MaterialClass.gif', 'images/ico_MaterialClass.gif');
    }
    if (1 == "1") {
//d.add(81,8,'&nbsp;模块管理','consumeAction!listmsg2.action','images/ico_Page.gif');
    }
    if (1 == "1") {
        d.add(82, 8, '&nbsp;权限设置', './AccModuleServlet?action=init', 'images/ico_Passenger.gif');
    }
    document.write(d);
</script>
</body>
</html>
