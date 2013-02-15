<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>	

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>

<body>
<s:form action="inputOkAction" method="POST">
<div style="width: 400px; font-family: Arial; font-size: 9pt;">
	<table>
		<tr>
			<td style="padding-bottom: 10px;">
				<h2>Hello World</h2>
				<h3>Page: <b>Input</b></h3>
			</td>
		</tr>
		<tr>
			<td>
				<s:textfield name="nameInput" label="Type your name"/>
			</td>
		</tr>
		<tr>
			<td>
				<s:submit value="Ok"/>
			</td>
		</tr>		
	</table>
</div>
</s:form>
</body>

</html>