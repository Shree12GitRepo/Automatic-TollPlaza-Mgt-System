<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/css/owner_Details.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>

<title>Veichle Registration Details</title>
</head>
<body>

	<div class="text-center bg-primary text-white " style="height: 50px;">
		<label style="margin-top: 1%;"><span><i
				class="fa fa-motorcycle" aria-hidden="true" style="font-size: 30px;"></i></span>Veichle
			Details</label>
	</div>
	<div class="d-flex justify-content-center mt-4 table-responsive">

		<form:form action="/vchlReg/${OwnerID}" modelAttribute="vchlDtls"
			method="POST">
			<table class="table table-condensed">


				<tr class="form-inline">
					<td><label for="mail">Veichle Type</label></td>
					<td>
						<form:select path="vchl_Type" class="custom-select custom-select-lg mb-3">
							<form:option value="NONE" label="----Select Country-----"/>
							<form:option value="2whlr" label="2 Whlr"/>
						</form:select>
					</td>

				</tr>
				<tr class="form-inline">
					<td><label for="mail">Veichle Brand</label></td>
					<td>
						<form:select path="vchl_Brand" class="custom-select custom-select-lg mb-3">
							<form:option value="NONE" label="----Select Veichle Brand----"/>
							<form:option value="Honda" label="Honda"/>
						</form:select>
					</td>

				</tr>
				<tr class="form-inline">
					<td><label for="VNP">Veichle Number Plate</label></td>
					<td><form:input path="vchl_Numbplate" type="text"
							class="form-control" id="owner_mob_no" /></td>
				</tr>
				

				<tr>
					<td><button type="submit" class="btn btn-primary"
							id="prev_btn"><a href="/redirctOwner?ownerID=${ownerRegID}" style="color:#fff;">PREV</a></button></td>
					<td><button type="submit" class="btn btn-primary"
							id="next_btn">NEXT</button></td>
				</tr>
			</table>


		</form:form>
	</div>
	<!-- Validation Form Script -->
	<script type="text/javascript">
		$(function() {
			$("form")
					.validate(
							{
								errorPlacement : function(error, element) {
									if (element.prop('type') === 'text') {
										error.insertAfter(element.parent());
									} else {
										error.insertAfter(element.parent());
									}
								},

								rules : {
									owner_Fname : {
										required : true,
										minlength : 6,
										maxlength : 40
									},
									owner_Lname : {
										required : true,
										minlength : 6,
										maxlength : 40
									},
									owner_email : {
										required : true,
										email : true
									},
									owner_DOB : {
										required : true,
										date : true
									},

									owner_Mob : {
										required : true,
										length : 10,
										digits : true
									},
									owner_Gender : {
										required : true
									}
								},
								messages : {
									owner_Fname : {
										required : "FirstName is required!",
										minlength : "FirstName must be at least 6 characters long"
									},
									owner_Lname : {
										required : "LastName is Required",
										minlength : "LastName must be at least 6 characters long"
									},
									owner_email : {
										required : "Mail is equired",
										email : "your mail should be XXX@gmail.com format"
									},
									owner_DOB : {
										required : "Your Date must be Required",
										date : "Date Format Should be MM/dd/YYYY format"
									},
									owner_Mob : {
										required : "Mobile Number Must be Required",
										length : "Your mob number must be 10 digits",
										digits : "You can only enter digits"
									},
									owner_Gender : {
										required : "Gender is Required"
									}
								}

							});
		});
	</script>
	<!-- End Of Validation Form Script -->
</body>
</html>