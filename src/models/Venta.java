package models;

import java.util.Date;

public class Venta {

    private int numeroBoleta;
    private Date fechaVenta;
    private float total;
    private float subTotal;
    private float IGV = 0.18f;

    public Venta() {
    }

    public Venta(int numeroBoleta, Date fechaVenta, float total, float subTotal) {
        this.numeroBoleta = numeroBoleta;
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.subTotal = subTotal;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getIGV() {
        return IGV;
    }

    public void setIGV(float IGV) {
        this.IGV = IGV;
    }

}
