<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
<style>
	body { font-family:sans-serif; }
	h1 { text-align:center; }
	form { text-align:center; }
	input { font-family:sans-serif; }
	button { font-weight:bold; }

</style>
</head>
<body>
	<h1>Email Validation</h1>
	<form action="MyServlet" method="get">
		<input type="text" name="email" placeholder="insert email" /><button type="submit">Validate</button>
	</form>
</body>
</html>