<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>adminHome::</title>
</head>
<body>
	<div align="center">
		<h1 align="center">Welcome to Admin Home Page</h1>
		<form:form method="post" action="saveConfiguration">
			<table>
				<tr>
					<td><form:label path="cloudProviderName">Cloud Provider:</form:label></td>
					<td><form:select path="cloudProviderName">
							<form:option value="NONE" label="Select" />
							<form:options items="${cloudproviderlist}" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="apiGateway">ApiGateway:</form:label></td>
					<td><form:select path="apiGateway">
							<form:option value="NONE" label="Select" />
							<form:options items="${apigatewaylist}" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="serviceDiscovery">Service Discovery:</form:label></td>
					<td><form:select path="serviceDiscovery">
							<form:option value="NONE" label="Select" />
							<form:options items="${servicelist}" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="dashBoard">Dash Board :</form:label></td>
					<td><form:select path="dashBoard">
							<form:option value="NONE" label="Select" />
							<form:options items="${dashboardlist}" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="monitoring">Monitoring :</form:label></td>
					<td><form:select path="monitoring">
							<form:option value="NONE" label="Select" />
							<form:options items="${monitoringlist}" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="server">Server:</form:label></td>
					<td><form:select path="server">
							<form:option value="NONE" label="Select" />
							<form:options items="${serverlist}" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="storgae">Storage:</form:label></td>
					<td><form:select path="storgae">
							<form:option value="NONE" label="Select" />
							<form:options items="${storagelist}" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="dataBase">Database:</form:label></td>
					<td><form:select path="dataBase">
							<form:option value="NONE" label="Select" />
							<form:options items="${databaselist}" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="sso">SSO:</form:label></td>
					<td><form:select path="sso">
							<form:option value="NONE" label="Select" />
							<form:options items="${ssolist}" />
						</form:select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>