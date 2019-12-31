<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./resources/css/css.css" rel="stylesheet">
<script type="text/javascript">
	var orderMethod='${vo.orderMethod=="asc"?"desc":"asc"}'
	function myOrder(orderColumn){
		
		location.href="list?orderColumn="+orderColumn+"&orderMethod="+orderMethod+"";
	}

</script>
</head>
<body>
<form action="list" method="post">
	名称:<input type="text" name="name" value="${vo.name }"/>
	电影年代:<select name="year">
			<option value="0">请选择年代</option>
			<option value="2015" ${vo.year==2015?'selected':'' }>2015</option>
			<option value="2019" ${vo.year==2019?'selected':'' }>2019</option>
			<option value="2020" ${vo.year==2020?'selected':'' }>2020</option>
			</select><br>
	上映时间:<input type="text" name="dateBegin" value="${vo.dateBegin }"/>-
	<input type="text" name="dateEnd" value="${vo.dateEnd }"/><br>
	价格:<input type="text" name="priceBegin" value="${vo.priceBegin }"/>-
	<input type="text" name="priceEnd" value="${vo.priceEnd }"/><br>
	
	电影时长:<input type="text" name="longTimeBegin" value="${vo.longTimeBegin }"/>-
	<input type="text" name="longTimeEnd" value="${vo.longTimeEnd }"/>
	<input type="submit" value="搜索"/>
</form>

<table>

	<tr>
		<td>编号</td>
		<td>名称</td>
		<td>价格</td>
		
		<td><a href="javascript:myOrder('longTime')">时长</a></td>
		<td><a href="javascript:myOrder('year')">年代</a></td>
		<td><a href="javascript:myOrder('datea')">上映时间</a></td>
		
		<td>区域</td>
		<td>状态</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${movies }" var="m">
	<tr>
		<td>${m.id }</td>
		<td>${m.name }</td>
		<td>${m.price}</td>
		<td>${m.longTime}</td>
		<td>${m.year}</td>
		<td>${m.datea}</td>
		<td>${m.area}</td>
		<td>${m.status==0?'即将上映':m.status==1?'正在热映':'已经下架'}</td>
		
		<td>操作</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>