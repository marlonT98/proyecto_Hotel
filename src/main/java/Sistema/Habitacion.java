package Sistema;

/**
 *
 * @author Marlon
 */
public class Habitacion {

    //Atributos de la clase habitacion
    private String nombre;
    private int DNI;
    private char sexo;
    private String nacionalidad;
    private int numHabitacion;
    private int piso;
    private int diasAlojados;
    private double precioDario;
    private String estado;
    private String tipoHabitacion;

    public Habitacion(String nombre, int DNI, char sexo, String nacionalidad, int numHabitacion, int piso, int diasAlojados, double precioDario, String estado, String tipoHabitacion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.numHabitacion = numHabitacion;
        this.piso = piso;
        this.diasAlojados = diasAlojados;
        this.precioDario = precioDario;
        this.estado = estado;
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getDiasAlojados() {
        return diasAlojados;
    }

    public void setDiasAlojados(int diasAlojados) {
        this.diasAlojados = diasAlojados;
    }

    public double getPrecioDario() {
        return precioDario;
    }

    public void setPrecioDario(double precioDario) {
        this.precioDario = precioDario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String toString() {

        return "nombre: " + nombre + " DNI: " + DNI + " Nacionalidad: " + nacionalidad + " Dias alojados: " + diasAlojados + " habitacion: " + numHabitacion + " precio: " + precioDario;

    }

}
