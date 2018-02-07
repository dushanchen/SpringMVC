<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加课程</title>
</head>
<body>
	<center>
		${message }
		<form method="post" action="addCourse">
			<table>
				<tr>
					<td>课程名称</td>
					<td><input type="text" name="title"/></td>
				</tr>
				<tr>
					<td>副标题</td>
					<td><input type="text" name="enTitle"/></td>
				</tr>
				<tr>
					<td>图片</td>
					<td><input type="text" name="image"/></td>
				</tr>
			</table>
			
		</form>
	</center>
</body>
</html>