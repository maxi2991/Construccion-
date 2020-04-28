package com.company;

public class Hotel extends Comercial{
    private int pisos;

    public Hotel(String direccion, float metrosCuadrados, int tiempo, float costoMetroCuadrado, Arquitecto arquitec, String name, int pisos) {
        super(direccion, metrosCuadrados, tiempo, costoMetroCuadrado, arquitec, name);
        this.pisos = pisos;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    @Override
    public String toString(){
        return "Hotel pisos: "+getPisos()+ " Direccion: "+super.getDireccion()+" metros cuadrados "+ super.getMetrosCuadrados()+ " costo x m2 "+super.getCostoMetroCuadrado()+" tiempos en dias: "+super.getTiempo()+ " precio aprox: "+super.calcularPrecioObra();
    }
}
