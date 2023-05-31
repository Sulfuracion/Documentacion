package posnet;

/**
 * Clase que representa un ticket de pago.
 */
public class Ticket {

    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;

    /**
     * Constructor de la clase Ticket.
     *
     * @param nombreApellido  el nombre y apellido del titular de la tarjeta
     * @param montoTotal      el monto total del pago
     * @param montoPorCuota   el monto por cuota en caso de pagos en cuotas
     */
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    /**
     * Devuelve una representación en forma de cadena del ticket.
     *
     * @return la representación en forma de cadena del ticket
     */
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoTotal=" + montoTotal + ", montoPorCuota=" + montoPorCuota + '}';
    }

}
