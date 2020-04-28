package com.company;

public class Arquitecto extends Empleado{
    private String matricula;
    private float sueldoDiario;

    public Arquitecto(String dni, String name, String tel,String matricula, float sueldo){
       super(dni,name,tel);
       this.matricula=matricula;
       this.sueldoDiario=sueldo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(float sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    @Override
    public String realizarTarea(){

        return "Soy arquitecto y estoy creando mi proximo plano";
    }

    @Override
    public String toString(){

        return "Arquitecto "+super.getNombre()+" "+super.getDni()+" "+getMatricula()+ " "+ super.getTelefono()+" "+getSueldoDiario();
    }
}
