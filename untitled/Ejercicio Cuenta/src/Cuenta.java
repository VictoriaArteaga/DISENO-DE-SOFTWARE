public class Cuenta {

    private final String titular;
    private double cantidad;

    Cuenta(String titular) {
        this.titular = titular;
    }

    Cuenta(String titular, double cantidad) {

        this.titular = titular;
        this.cantidad = cantidad;
    }

    // getters and setters.

    public String getTitular() {
        return this.titular;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidadActual) {
        this.cantidad = cantidadActual;
    }

    // Métodos especiales.

    public void ingresar(double cantidad) {

        if (cantidad <= 0) {

            System.out.println(" La cantidad ingresada es incorrecta ");

        } else {
            System.out.println(" Ingresando dinero... ");
            this.cantidad += cantidad;
        }

    }

    public void retirar(double cantidadRetirar) {

        if ( this.cantidad < cantidadRetirar) {
            this.cantidad = 0;
        }

        else {
            System.out.println(" Retirando dinero... ");
            this.cantidad -= cantidadRetirar;
        }
    }

    public String toString() {

        return "Titular: " + this.titular + "\n" +
                "Cantidad: " + this.cantidad;
    }
}
