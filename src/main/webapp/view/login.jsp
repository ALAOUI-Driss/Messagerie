<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
>
</head>

</head>
<body>
	<br>
	<div class="container flex justify-content-center">
			<div class="card card-body">
			
				<h1 class="d-flex justify-content-center">Bienvenue</h1>
				<div class="col-md-8 col-md-offset-3">

					<form action="LoginServletExc">

						<div class="form-group d-flex justify-content-center row">
						<div class="col-2">
							<label for="uname">Email:</label> 
						</div>
							<div class="col">
						<input type="text" class="form-control" id="email" placeholder="entrer le mail"
								name="email" required>
						</div>
						</div>

						<div class="form-group d-flex justify-content-center row">
						<div class="col-2">
							<label for="uname">Password:</label> 
							</div>
							<div class="col">
							<input type="password" class="form-control" id="password" placeholder="entrer le mot de passe"
								name="password" required>
						</div>
						</div>
						<div class="form-group d-flex justify-content-center row">
						<div class="col">
						<button type="submit" class="btn btn-success d-flex justify-content-center">Entrer</button>
						</div>
						</div>
					</form>
						<a href="register"><button type="submit" class="btn btn-primary d-flex justify-content-center">nouvel utilisateur</button></a>
				</div>
			</div>
		</div>
</body>
</html>