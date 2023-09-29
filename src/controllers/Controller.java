package controllers;

import utils.Constantes;

public class Controller {

    public static float getComisionVentas(int numeroVentas) {
        return numeroVentas * 0.10f;
    }

    public static float getDescuentoImpuesto(float sueldoBase, float comisionVentas) {
        float TA = sueldoBase + comisionVentas;
        float descuento = 0;

        if (TA > 3000) {
            descuento = 0.06f;
        }

        if (TA > 2300 && TA <= 3000) {
            descuento = 0.04f;
        }

        if (TA >= 1500 && TA <= 2300) {
            descuento = 0.03f;
        }

        return descuento;
    }

    public static float getDescuentoSeguro(int estadoCivil, int numeroHijos) {
        float descuento = 0;

        if (estadoCivil == Constantes.SOLTERO) {
            descuento = 120;
        }

        if (estadoCivil == Constantes.CASADO && numeroHijos == 0) {
            descuento = 100;
        }

        if (estadoCivil == Constantes.DIVORCIADO && numeroHijos > 0) {
            descuento = 50 + (50 * numeroHijos);
        }

        return descuento;
    }
    
    public static float getSueldoNeto(float sueldoBase, float comisionVentas, float comsionImpuesto, float descuentoSeguro) {
        return sueldoBase + comisionVentas - comsionImpuesto - descuentoSeguro;
    }

}
