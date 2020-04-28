package com.company;

public class Comercio extends Comercial {
    private String rubro;

    public Comercio(String direccion, float metrosCuadrados, int tiempo, float costoMetroCuadrado, Arquitecto arquitec, String name, String rubro) {
        super(direccion, metrosCuadrados, tiempo, costoMetroCuadrado, arquitec, name);
        this.rubro = rubro;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString(){
        return "Comercio "+getRubro()+ " Direccion: "+super.getDireccion()+" metros cuadrados "+ super.getMetrosCuadrados()+ " costo x m2 "+super.getCostoMetroCuadrado()+" tiempos en dias: "+super.getTiempo()+ " precio aprox: "+super.calcularPrecioObra();
    }

}
