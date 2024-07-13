<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Page</title>
<style>
	body {
		 background-color: rgb(212, 212, 212); /* Grey color */
		font-family: Arial, sans-serif;
	}

	.container {
		max-width: 600px;
		margin: 0 auto;
		margin-top: 150px;
		background-color: #fff; /* White container background */
		padding: 20px;
		border-radius: 5px;
		box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
	}

	.form-group {
		margin-bottom: 25px;
	}

	label {
		font-weight: bold;
		margin-left:15px;
	}

	input[type="text"] {
		width: 90%;
		padding: 10px;
		border: 1px solid #ccc;
		border-radius: 4px;
		margin:15px;
		
	}

	.center {
		text-align: center;
	}

	.btn {
		padding: 10px 20px;
		border: none;
		border-radius: 8px;
		cursor: pointer;
	}

	.btn-secondary {
		background-color: #888;
		color: #fff;
	}

	.btn-primary {
		background-color: #3498db;
		color: #fff;
	}

	.btn-primary:hover {
		background-color: #2376b4;
	}

	.back-button {
		margin-right: 20px;
	}

	/* Updated styling for the link */
	a {
		text-decoration: none;
		color: #3498db;
	}

	a:hover {
		text-decoration: underline;
	}
	
	/* Added CSS to align buttons to the left */
	.button-container {
		text-align: left;
		margin-top: 10px;
		margin-left:15px;
		padding-bottom:10px;
	}

</style>
</head>
<body>
<div class="container">
	<form action="UpdateController" method="post">
		<div class="form-group">
			<label for="regNo">ENTER REGISTER NUMBER TO UPDATE:</label>
			<input type="text" class="form-group" id="regNo" name="regNo" placeholder="Register number">
		</div>

		<div class="form-group">
			<label for="accbal">ENTER THE ACCOUNT BALANCE:</label>
			<input type="text" class="form-group" id="accbal" name="accbal" placeholder="Account balance">
		</div>
		
		<div class="button-container">
			<a href="Back" class="btn btn-secondary back-button">Back</a>
			<input type="submit" class="btn btn-primary" value="Submit">
		</div>
	</form>
</div>

</body>
</html>
