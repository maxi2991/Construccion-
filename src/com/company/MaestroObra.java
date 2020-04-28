package com.company;

public class MaestroObra extends Empleado_de_obra {
    private float sueldoDia;

    public MaestroObra(String dni, String name, String tel, int edad, float sueldo ){
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
        return "Soy Maestro de obras y supervizo a los obreros en la construccion";
    }
    @Override
    public String toString(){
        return "Maestro Mayor "+super.getNombre()+" "+super.getDni()+ " "+super.getTelefono()+ " "+super.getEdad()+" "+getSueldoDia();
    }
}
