package com.company;

public abstract class Empleado_de_obra extends Empleado {
    private int edad;

    public Empleado_de_obra(String dni, String name, String tel, int edad){
        super(dni,name,tel);
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract String realizarTarea();
}
