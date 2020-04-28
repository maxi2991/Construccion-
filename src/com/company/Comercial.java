package com.company;

public class Comercial extends Obra {
    private String name;

    public Comercial(String direccion, float metrosCuadrados, int tiempo, float costoMetroCuadrado, Arquitecto arquitec, String name) {
        super(direccion, metrosCuadrados, tiempo, costoMetroCuadrado, arquitec);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
