<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es" data-bs-theme="dark">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title>Iniciar Sesión | Dental Clinic</title>
    <link href="css/styles.css" rel="stylesheet"/>
    <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
</head>
<body class="bg-login">
<script src="./js/sweetalert2.js"></script>
<script src="./js/login.control.error.js"></script>

<%
    int errorNumber = 0;
    if (request.getParameter("error") != null) {
        errorNumber = Integer.parseInt(request.getParameter("error"));
        out.println("<script>codeError(" + errorNumber + ");</script>");
    }
%>
<div id="layoutAuthentication">
    <div id="layoutAuthentication_content">
        <main>
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-5">
                        <div class="card shadow-lg border-0 rounded-lg mt-5">
                            <div class="card-header"><h3 class="text-center font-weight-light my-4">Iniciar Sesión</h3>
                            </div>
                            <div class="card-body" data-bs-theme="dark">
                                <form method="post" action="login">
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputDni" name="inputDni" type="number"
                                               placeholder="123456789"/>
                                        <label for="inputDni">Numero de identificación</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputPassword" type="password"
                                               name="inputPassword" placeholder="Password"/>
                                        <label for="inputPassword">Contraseña</label>
                                    </div>
                                    <div class="form-check mb-3">
                                        <input class="form-check-input" id="inputRememberPassword" type="checkbox"
                                               value=""/>
                                        <label class="form-check-label" for="inputRememberPassword">Recordar
                                            contraseña</label>
                                    </div>
                                    <div class="d-flex align-items-center justify-content-between mt-4 mb-0">
                                        <a class="small" href="password.html">¿Olvidaste tu contraseña?</a>
                                        <!-- <a class="btn btn-primary" href="dashboard.jsp">Ingresar</a> -->
                                        <button type="submit" class="btn btn-primary btn-block">Ingresar
                                        </button>
                                    </div>
                                </form>
                            </div>
                            <div class="card-footer text-center py-3">
                                <div class="small"><a href="register.jsp">¿Aún no tienes cuenta? Registrese aqui</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
    <div id="layoutAuthentication_footer">
        <footer class="py-4 bg-light mt-auto">
            <div class="container-fluid px-4">
                <div class="d-flex align-items-center justify-content-between small">
                    <div class="text-muted">Copyright &copy; Your Website 2023</div>
                    <div>
                        <a href="#">Privacy Policy</a>
                        &middot;
                        <a href="#">Terms &amp; Conditions</a>
                    </div>
                </div>
            </div>
        </footer>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
<script src="js/scripts.js"></script>
</body>
</html>
