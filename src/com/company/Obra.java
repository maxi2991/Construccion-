package com.company;

import java.util.ArrayList;
import java.util.List;

public class Obra {
    private String direccion;
    private float metrosCuadrados;
    private int tiempo; // en dias
    private float costoMetroCuadrado;
    private List<Obrero> obreros= new ArrayList();
    private Arquitecto arqui;
    private MaestroObra[] masters= new MaestroObra[3];
    private int cantMaster=0;

    public Obra(String direccion, float metrosCuadrados, int tiempo, float costoMetroCuadrado, Arquitecto arquitec) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.tiempo = tiempo;
        this.costoMetroCuadrado = costoMetroCuadrado;
        this.arqui=arquitec;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public float getCostoMetroCuadrado() {
        return costoMetroCuadrado;
    }

    public void setCostoMetroCuadrado(float costoMetroCuadrado) {
        this.costoMetroCuadrado = costoMetroCuadrado;
    }

    public  void agregarObrero(Obrero nuevo){
        obreros.add(nuevo);
    }

    public void agregarMaestro(MaestroObra nuevo){

        if(this.cantMaster<masters.length){
            masters[this.cantMaster]=nuevo;
            this.cantMaster++;
        }
    }

    public float calcularCostoEmpleados(){
        float total=0;
        if(this.cantMaster>0 && obreros.size()>1) {
            total=arqui.getSueldoDiario() + (this.cantMaster * masters[0].getSueldoDia()) + (obreros.size()*obreros.get(0).getSueldoDia());
        }
        return total;
    }

    public float calcularPrecioObra(){
        float costoEmpleados=calcularCostoEmpleados();
        if(obreros.size()>1 && this.cantMaster>0) {
            return (costoMetroCuadrado * metrosCuadrados) + (costoEmpleados * tiempo);
        }else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Direccion: "+getDireccion()+" metros cuadrados "+getMetrosCuadrados()+ " costo x m2 "+getCostoMetroCuadrado()+" tiempos en dias: "+getTiempo()+ " precio aprox: "+calcularPrecioObra();
    }
    public void mostrarEmpleados(){
        System.out.println(this.arqui.toString());
        for(int i=0; i<this.cantMaster; i++){
            System.out.println(this.masters[i].toString());
        }
        for(int i=0; i<obreros.size();i++){
            System.out.println(obreros.get(i).toString());
        }
    }

}
