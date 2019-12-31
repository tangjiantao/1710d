<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function fenye(pageNum) {
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
	}
	function add() {
		location="add.jsp";
	}
	function upd(h_id) {
		location="update.jsp?h_id="+h_id;
	}
</script>
</head>
<body>
<form action="list.do" method="post">
	<input type="hidden" name="pageNum">
	房产坐落地址：<input type="text" name="h_address" value="${con.h_address}">
	房主姓名：<input type="text" name="o_name" value="${con.o_name}">
	<button>查询</button>
</form>
<table>
	<tr>
		<th>房产编号</th>
		<th>房主姓名</th>
		<th>坐落地址</th>
		<th>用途</th>
		<th>面积</th>
		<th>不动资产证书</th>
		<th>操作
			<input type="button" value="添加" onclick="add()">
		</th>
	</tr>
	<c:forEach items="${list}" var="h" varStatus="count">
		<tr>
			<th>${count.count+page.startRow-1}</th>
			<th>
				<c:forEach items="${h.owner}" var="o">
					${o.o_name}
				</c:forEach>
			</th>
			<th>${h.h_address}</th>
			<th>${h.h_use}</th>
			<th>${h.h_area}</th>
			<th>
				<img alt="" src="load/${h.h_pic}" style="width: 100px; height: 100px;">
			</th>
			<th>
				<input type="button" value="修改" onclick="upd(${h.h_id})">
			</th>
		</tr>
	</c:forEach>
	<tr>
		<th colspan="10">
			<button onclick="fenye(1)">首页</button>
			<button onclick="fenye(${page.prePage==0?'1':page.prePage})">上一页</button>
			<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
			<button onclick="fenye(${page.pages})">尾页</button>&nbsp;&nbsp;&nbsp;&nbsp;
			当前是${page.pageNum}/${page.pages}页，一共${page.total}页&nbsp;&nbsp;&nbsp;&nbsp;
		</th>
	</tr>
</table>
</body>
</html>