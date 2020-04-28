package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> empleados= new ArrayList();
    private List<Obra> obras= new ArrayList();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleado(Empleado nuevo){
        empleados.add(nuevo);
    }

    public void agregarObra(Obra nueva){
        obras.add(nueva);
    }

    public void mostrarObras(){
        for(Obra obra: obras){
            if( obra instanceof Domestica){
                System.out.println(obra.toString());
            }else{
                if(obra instanceof Hotel){
                    System.out.println(obra.toString());
                }else{
                    if(obra instanceof Comercio){
                        System.out.println(obra.toString());
                    }
                }
            }
        }

    }

    public void mostrarEmpleados(){
        for(Empleado emple: empleados){
            if(emple instanceof Arquitecto){
                System.out.println(emple.toString());
            }else{
                if(emple instanceof MaestroObra ){
                    System.out.println(emple.toString());
                }else{
                    if(emple instanceof Obrero){
                        System.out.println(emple.toString());
                    }
                }
            }

        }

    }
}
