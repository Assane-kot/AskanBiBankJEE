<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Dashboard</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">

<!-- Custom styles for this template-->
<link href="/Askanbibankjee/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="#">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</div>
				<div class="sidebar-brand-text mx-3">ASKANBI BANK</div>
			</a>

			<!-- Divider -->

			<!-- Nav Item - Dashboard -->
			<li class="nav-item active"><a class="nav-link" href="#"> <i
					class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span></a></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Interface</div>

			<!-- MENU POUR SUPERADMIN -->
			<c:if test="${sessionScope['role'] eq 'Super-User'}">


				<!-- Nav Item - Pages Collapse Menu -->
				<li class="nav-item"><a href="vue/admin.php"
					class="nav-link collapsed" href="#" aria-expanded="true"
					aria-controls="collapseTwo"> <i class="material-icons">person</i>
						<span>ADMINISTRATEURS</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="jsp/ac-classe.php"> <i class="material-icons">home</i> <span>AGENCES</span></a>
				</li>
			</c:if>

			<c:if test="${sessionScope['role'] eq 'Administrateur'}">
				<!-- Nav Item - Utilities Collapse Menu -->
				<li class="nav-item"><a class="nav-link collapsed"
					href="vue/admin.jsp" aria-expanded="true"
					aria-controls="collapseUtilities"> <i class="material-icons">person</i>
						<span>AGENTS</span>
				</a></li>


				<li class="nav-item"><a class="nav-link collapsed"
					href="jsp/ac-client.jsp" aria-expanded="true"
					aria-controls="collapsePages"> <i class="material-icons">person</i>
						<span>CLIENTS</span>
				</a></li>
				<li class="nav-item"><a class="nav-link collapsed"
					href="vue/operation.php" aria-expanded="true"
					aria-controls="collapsePages"> <i class="material-icons">person</i>
						<span>OPERATIONS</span>
				</a></li>
			</c:if>

			<c:if test="${sessionScope['role'] eq 'Agent'}">

				<!-- Nav Item - Pages Collapse Menu -->
				<li class="nav-item"><a class="nav-link collapsed"
					href="vue/ac-client.php" aria-expanded="true"
					aria-controls="collapsePages"> <i class="material-icons">person</i>
						<span>CLIENTS</span>
				</a></li>
				<li class="nav-item"><a class="nav-link collapsed"
					href="vue/Depot.php" aria-expanded="true"
					aria-controls="collapsePages"> <i class="material-icons">person</i>
						<span>OPERATIONS</span>
				</a></li>

			</c:if>


			<!-- MENU SEULEMENT POUR SUPER ADMIN -->



			<!-- Divider -->
			<hr class="sidebar-divider d-none d-md-block">

			<!-- Sidebar Toggler (Sidebar) -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>

			<!-- Sidebar Message -->
			<div class="sidebar-card d-none d-lg-flex">
				<img class="sidebar-card-illustration mb-2"
					 src="/Askanbibankjee/img/undraw_posting_photo.svg" alt="...">
				<p class="text-center mb-2">
					<strong>ASKAAN BI BANQUE</strong><br> Forger votre avenir avec
					notre banque
				</p>
				<a class="btn btn-success btn-sm" href="">Visiter Notre Site </a>
			</div>

		</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">


				</nav>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">
				<p class="succes">Vous êtes connecté en tant que :
								${sessionScope.login} profile ${sessionScope.role}</p>
				

					<!-- Page Heading -->
					<div
						class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">Dashboard</h1>

						<div
							class="d-sm-flex align-items-center justify-content-between mb-4">

							<a href="#"
								class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
								<form action="${pageContext.request.contextPath}/authentification" method="post">



									<!-- /.col -->
									<div class="col-4">
										<button type="submit" class="btn btn-primary btn-block"
											name="depot" value="logout">DECONNECTER</button>
									</div>


									<!-- /.col -->
								</form>
							</a>

						</div>
						    

					</div>
					
                 
                       <div class="row">

                        <div >

                            <!-- Illustrations -->
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">ASKAAN BI BANQUE</h6>
                                </div>
                                <div class="card-body">
                                    <div class="text-center">
                                        <img class="img-fluid px-3 px-sm-4 mt-3 mb-4" style="width: 25rem;"
                                            src="/Askanbibankjee/img/undraw_posting_photo.svg" alt="...">
                                    </div>
                                    <p>Askaan bii banque est une banque 100% sénégalaise.
Askaan bi est faite pour simplifier le quotidien des sénégalais. Aider les jeunes  dans leur financement de projet.
</p>
                                    
                                </div>
                            </div>

                            <!-- Approach -->
                            
                        </div>
                    </div>

					


						

						

					
					<!-- Content Row -->
					<div class="row"></div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright &copy; Your Website 2021</span>
					</div>
				</div>
			</footer>
			<!-- End of Footer -->

		
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="vendor/chart.js/Chart.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="js/demo/chart-area-demo.js"></script>
	<script src="js/demo/chart-pie-demo.js"></script>

</body>

</html>