<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>

</head>
<body>
${msg}
<form action="login.do" method="post">
	<table>
		<tr>
			<th>用户名</th>
			<th>
				<input type="text" name="username">
			</th>
		</tr>
		
		<tr>
			<th>密码</th>
			<th>
				<input type="password" name="password">
			</th>
		</tr>
		
		<tr>
			
			<th colspan="10">
				<button>登录</button>
			</th>
		</tr>
	</table>
</form>
</body>
</html>