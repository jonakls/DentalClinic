function codeError(code) {
    switch (code) {
        case 0:
            return "Success";
        case 1:
            alert("El numero de identificación es incorrecto");
            break;
        default:
            alert("Error desconocido");
            break;
    }
}