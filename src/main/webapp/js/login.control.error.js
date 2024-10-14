function codeError(code) {
    switch (code) {
        case 1:
            Swal.fire({
                icon: "error",
                title: "Error",
                text: "Los campos no deben estar vacíos",
                cancelButton: "Cerrar"
            });
            break;
        case 2:
            Swal.fire({
                icon: "error",
                title: "Error",
                text: "Numero de identificación o contraseña incorrecta",
                cancelButton: "Cerrar"
            });
            break;
        default:
            Swal.fire({
                icon: "error",
                title: "Error",
                text: "Error desconocido, por favor contacte al administrador",
                cancelButton: "Cerrar"
            });
            break;
    }
}