<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
	body {
		background-color: rgb(212, 212, 212); /* grey color */
	}

	.container {
		max-width: 600px;
		margin: 0 auto;
		margin-top: 20px;
		padding-top: 20px;
		padding-bottom: 20px;
	}

	.form-group {
		margin-bottom: 25px;
	}

	.my-box {
		box-shadow: 5px 5px 5px hsl(0, 2%, 64%);
		padding: 50px;
		background-color: rgb(255, 255, 255);
	}
	
</style>
</head>
<body>



<div class="container">
	<div class="my-box">
		<h2>Registration Form</h2>
		<form action="RegisterController" method="post">
			<div class="form-group">
				<label for="regno">Reg Number:</label>
				<input type="text" class="form-control" id="regno" name="regno" placeholder="Enter Register Number">
			</div>

			<div class="form-group">
				<label for="custname">Customer Name:</label>
				<input type="text" class="form-control" id="custname" name="custname" placeholder="Enter Customer Name">
			</div>

			<div class="form-group">
				<label for="username">User Name:</label>
				<input type="text" class="form-control" id="username" name="username" placeholder="Enter Username">
			</div>

			<div class="form-group">
				<label for="password">Password:</label>
				<input type="password" class="form-control" id="password" name="password" placeholder="Enter Password">
			</div>

			<div class="form-group">
				<label for="accbalance">Account Balance:</label>
				<input type="text" class="form-control" id="accbalance" name="accbalance" placeholder="Enter Account Balance">
			</div>

			<div class="center">
				<a href="Back" class="btn btn-secondary back-button">Back</a>
				<input type="submit" class="btn btn-primary" value="Submit">
			</div>
		</form>
	</div>
</div>

</body>
</html>
