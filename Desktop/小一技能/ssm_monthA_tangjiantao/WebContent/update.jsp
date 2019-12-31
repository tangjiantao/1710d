<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function() {
		$.post("ownerAll.do",function(arr){
			for ( var i in arr) {
				var s=arr[i];
				var op="<input type='checkbox' name='oids' value='"+s.o_id+"'>"+s.o_name+"";
				$("#hz").append(op);
			}
			
			var h_id=${param.h_id};
			$.post("selectOne.do",{h_id:h_id},function(obj){
				
				var owner=obj.owner;
				for ( var i in owner) {
					$("[name=oids]").each(function() {
						if (this.value==owner[i].o_id) {
							$(this).prop("checked",true);
						}
					})
				}
				
				$("[name=h_address]").val(obj.h_address);
				$("[name=h_use]").val(obj.h_use);
				$("[name=h_area]").val(obj.h_area);
			},"json")
		},"json")
	})
</script>
</head>
<body>
<form action="update.do" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<th>房产坐落地址</th>
			<th>
				<input type="hidden" name="h_id" value="${param.h_id}">
				<input type="text" name="h_address">
			</th>
		</tr>
		
		<tr>
			<th>房产用途</th>
			<th>
				<input type="text" name="h_use">
			</th>
		</tr>
		
		<tr>
			<th>房产面积</th>
			<th>
				<input type="text" name="h_area">
			</th>
		</tr>
		
		<tr>
			<th>房产户主</th>
			<th id="hz">
				
			</th>
		</tr>
		
		<tr>
			<th>不动资产证书</th>
			<th>
				<input type="file" name="myFile">
			</th>
		</tr>
		
		<tr>	
			<th colspan="10">
				<button>点击修改</button>
			</th>
		</tr>
	</table>
</form>
</body>
</html>