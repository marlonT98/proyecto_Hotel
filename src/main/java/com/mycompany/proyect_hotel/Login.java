package com.mycompany.proyect_hotel;


public class Login {

    private String usuario = "pase";
    private int pass = 123;

    public Login() {
    }

    public boolean contraseñaCorrecta(String usuario, int pass) {
        if (this.usuario.equals(usuario) && this.pass == pass) {
            return true;
        }
        return false;
    }

}
