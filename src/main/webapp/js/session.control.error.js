function codeError() {
    Swal.fire({
        icon: "error",
        title: "La sesión ha expirado",
        text: "Por favor, inicie sesión nuevamente",
        cancelButton: "Cerrar"
    });
}