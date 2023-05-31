package posnet;

/**
 * Clase que representa una tarjeta de crédito.
 */
public class TarjetaDeCredito {

    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    /**
     * Constructor de la clase TarjetaDeCredito.
     *
     * @param entidadBancaria    la entidad bancaria emisora de la tarjeta
     * @param nroTarjeta         el número de tarjeta
     * @param saldo              el saldo disponible en la tarjeta
     * @param titular            el titular de la tarjeta
     * @param entidadFinanciera  la entidad financiera asociada a la tarjeta
     */
    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }

    /**
     * Verifica si la tarjeta tiene saldo disponible para realizar una transacción con el monto especificado.
     *
     * @param monto  el monto a verificar
     * @return true si la tarjeta tiene saldo disponible, false en caso contrario
     */
    public boolean tieneSaldoDisponible(double monto) {
        return saldo >= monto;
    }

    /**
     * Descuenta el monto especificado del saldo de la tarjeta.
     *
     * @param monto  el monto a descontar
     */
    public void descontar(double monto) {
        saldo = saldo - monto;
    }

    /**
     * Obtiene el nombre completo del titular de la tarjeta.
     *
     * @return el nombre completo del titular
     */
    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }

    /**
     * Devuelve una representación en forma de cadena de la tarjeta de crédito.
     *
     * @return la representación en forma de cadena de la tarjeta
     */
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

}
