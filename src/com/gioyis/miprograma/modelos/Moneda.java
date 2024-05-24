package com.gioyis.miprograma.modelos;

import com.gioyis.miprograma.apiconversor.MiMoneda;

public class Moneda {
    private String abreviaturaMoneda;
    private String abreviaturaSegundaMoneda;
    private double cantidad;
    private double valor;

    public Moneda(MiMoneda miMonedaApi) {
        this.abreviaturaMoneda = miMonedaApi.target_code();
        this.abreviaturaSegundaMoneda = miMonedaApi.base_code();
        this.valor = Double.valueOf(miMonedaApi.conversion_rate());
    }

    public Moneda(Moneda moneda) {
        this.abreviaturaMoneda = moneda.abreviaturaMoneda;
        this.abreviaturaSegundaMoneda = moneda.abreviaturaSegundaMoneda;
        this.valor = moneda.valor;
        this.cantidad = moneda.cantidad;
    }

    public String getAbreviaturaMoneda() {
        return abreviaturaMoneda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAbreviaturaMoneda(String abreviaturaMoneda) {
        this.abreviaturaMoneda = abreviaturaMoneda;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "com.gioyis.miprograma.principal.modelos.com.gioyis.miprograma.modelos.Moneda{" +
                "abreviaturaMoneda='" + abreviaturaMoneda + '\'' +
                ", abreviaturaSegundaMoneda='" + abreviaturaSegundaMoneda + '\'' +
                ", cantidad=" + cantidad +
                ", valor=" + valor +
                '}';
    }
}
