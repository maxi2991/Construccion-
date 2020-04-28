package com.company;

public class Obrero extends Empleado_de_obra {
    private float sueldoDia;

    public Obrero(String dni, String name, String tel, int edad, float sueldo){
        super(dni,name,tel,edad);
        this.sueldoDia=sueldo;

    }

    public float getSueldoDia() {
        return sueldoDia;
    }

    public void setSueldoDia(float sueldoDia) {
        this.sueldoDia = sueldoDia;
    }

    @Override
    public String realizarTarea(){
        return "Soy obrero y construyo";
    }
    @Override
    public String toString(){
        return "Obrero "+super.getNombre()+" "+super.getDni()+ " "+super.getEdad()+ " "+super.getTelefono()+" "+ getSueldoDia();
    }

}
