package Sistema;


public class Login {

    private String usuario = "pass";
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
