package Sistema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author Marlon //
 */
public class ControlHabitacion {

    private Habitacion habitaciones[];
    private int cont;

    //constructor
    public ControlHabitacion(int tam) {

        habitaciones = new Habitacion[tam];
        cont = -1;
    }

    public void llenarHabitaciones(Habitacion habit) {

        if (cont < habitaciones.length - 1) {
            cont++;
            habitaciones[cont] = habit;
        }
    }

    public String mostrarHabitaciones() {

        String cadena = "";
        for (int i = 0; i <= cont; i++) {
            cadena += habitaciones[i].getDNI() + "\t" + habitaciones[i].getNombre() + "\t" + habitaciones[i].getSexo() + "\t" + habitaciones[i].getNacionalidad() + "\t" + habitaciones[i].getDiasAlojados() + "\t" + habitaciones[i].getEstado() + "\n";
        }
        return cadena;

    }

//por el numero de la habitacion
    public String buscarCliente(String nombreCliente) {
        String resultado = " no encontrado\n";
        for (int i = 0; i <= cont; i++) {
            if (habitaciones[i].getNombre().equalsIgnoreCase(nombreCliente)) {
                resultado = habitaciones[i].getDNI() + "\t" + habitaciones[i].getNombre() + "\t" + habitaciones[i].getSexo() + "\t" + habitaciones[i].getNacionalidad() + "\t" + habitaciones[i].getDiasAlojados() + "\t" + habitaciones[i].getEstado() + "\t";
            }
        }

        return resultado;
    }

    //generar fecha
    public static String obtenerFechaActual() {

        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fechaActual.format(formato);
    }
    //generar el ruc de la empresa

    public static String generarRUC() {
        return "12" + new Random().nextInt(10000000) + new Random().nextInt(10);
    }

    public String generarFacturaFormateada(String nombre, String ruc, String nacionalidad, int numHabitacion, int diasAlojados, double precioDiario) {
        return String.format("Datos del cliente                          Expendido en:\n"
                + "Cliente: %s\t\tPerú,Per \n"
                + "RUC: %s\t\tFecha %s\n"
                + "Nacionalidad: %s\n"
                + "Num. Habitacion\tDias\t Precio X Días\t\tImporte Total\n"
                + "%d\t\t%d\t  %.2f\t\t\ts/%.2f\n",
                nombre, ruc, obtenerFechaActual(), nacionalidad, numHabitacion, diasAlojados, precioDiario, diasAlojados * precioDiario);

    }

    public String generarFactura(String nombre) {
        String resultado = "Cliente no encontrado\n";

        for (int i = 0; i <= cont; i++) {
            if (habitaciones[i].getNombre().equalsIgnoreCase(nombre)) {
                resultado = generarFacturaFormateada(habitaciones[i].getNombre(), generarRUC(), habitaciones[i].getNacionalidad(), habitaciones[i].getNumHabitacion(), habitaciones[i].getDiasAlojados(), habitaciones[i].getPrecioDario());
            }
        }

        return resultado;
    }

}
