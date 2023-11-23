/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_hotel;

/**
 *
 * @author Marlon
 */
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
