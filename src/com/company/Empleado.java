package com.company;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private String telefono;

    public Empleado(String dni, String name, String tel) {
        this.dni=dni;
        this.nombre=name;
        this.telefono=tel;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString(){
        return getDni()+" "+getNombre()+" "+getTelefono();
    }

    public abstract String realizarTarea();
}
