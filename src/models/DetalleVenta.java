package models;

public class DetalleVenta {

    private int numeroBoleta;
    private String codigoEmpleado;
    private String codigoArticulo;
    private int cantArticulo;

    public DetalleVenta() {
    }

    public DetalleVenta(int numeroBoleta, String codigoEmpleado, String codigoArticulo, int cantArticulo) {
        this.numeroBoleta = numeroBoleta;
        this.codigoEmpleado = codigoEmpleado;
        this.codigoArticulo = codigoArticulo;
        this.cantArticulo = cantArticulo;
    }

    public int getCantArticulo() {
        return cantArticulo;
    }

    public void setCantArticulo(int cantArticulo) {
        this.cantArticulo = cantArticulo;
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

}
