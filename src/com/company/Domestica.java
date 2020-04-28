package com.company;

public class Domestica extends Obra {
    private int cantidadHabitaciones;

    public Domestica(String direccion, float metrosCuadrados, int tiempo, float costoMetroCuadrado, Arquitecto arquitec, int cantidadHabitaciones) {
        super(direccion, metrosCuadrados, tiempo, costoMetroCuadrado, arquitec);
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    @Override
    public String toString(){
        return "Domestica cantidad de habitaciones: "+getCantidadHabitaciones()+ " Direccion: "+super.getDireccion()+" metros cuadrados "+ super.getMetrosCuadrados()+ " costo x m2 "+super.getCostoMetroCuadrado()+" tiempos en dias: "+super.getTiempo()+ " precio aprox: "+super.calcularPrecioObra();
    }
}
