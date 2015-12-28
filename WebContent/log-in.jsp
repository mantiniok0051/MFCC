<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
				<title>My Fitness Companion</title>

				<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
				<link rel="stylesheet" type="text/css" href="css/myfcc.css">

			</head>
			<body>

			
					<div class="container well fcc-pannel" id="">
						<div class="row">
							<div class="col-xs-12" id="brand">
								<img src="img/polygon-colors-04.png" alt="Account Avatar" id="brand-logo" class="img-responsive brand-logo">
							</div>
						</div>
						<form id="log-in-form" name="log-in-form" action="doLogIn" class="fcc-form" method="post">
								<div class="form-group">
									<input type="text" class="form-control" placeholder="UserID" name="usuario" id="txt-user" required autofocus>
								</div>
								<div class="form-group">
									<input type="password" class="form-control" placeholder="Password" name="pass" id="txt-pass" required="true">
								</div>
								<button class="btn btn-default btn-block" type="button" id="send">Log me in</button>
								<div class="checkbox fcc-pane-sm" id="keepMe">
									<label for="" class="checkbox">
										<input type="checkbox" value="1" name="remember">Keep me logged on this device</input>
									</label>
									
									<p class="help-block"><a href="#">Having problems to log in?</a></p>
									<p class="help-block"><a href="sign-in.jsp">Sign in for a new account.</a></p>
								</div>
						</form>
					</div>
				<script src="js/jquery-1.11.3.js"></script>
				<script src="js/bootstrap.min.js"></script>
				<script src="js/myfcc-js.js"></script>
			</body>
		</html>