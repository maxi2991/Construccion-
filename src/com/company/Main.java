package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Obrero persona1= new Obrero("21546555","pedro marquez","45965214",32,1500);
        Obrero persona2= new Obrero("19546555","mario rodriguez","41115214",45,1500);
        Arquitecto persona3=new Arquitecto("12448696","Roberto Macallister","11456925","FRTG45896523",2000);
        MaestroObra persona4=new MaestroObra("25478963","Santiago garcia","48956321",42,1800);
        Empresa empresa=new Empresa("EDENOR");
        Comercio comercio=new Comercio("Alvear 414",1256,35,22,persona3,"Arcores","dulceria");
        Hotel hotel=new Hotel("Zamora 2025",2000,50,12,persona3,"Los alerces",5);
        Domestica hogar=new Domestica("Cabildo 345",500,20,15,persona3,3);
/*
Muestra las tareas de cada empleado
        System.out.println(persona1.realizarTarea());
        System.out.println(persona2.realizarTarea());
        System.out.println(persona3.realizarTarea());
        System.out.println(persona4.realizarTarea());



  */

        empresa.agregarEmpleado(persona1);
        empresa.agregarEmpleado(persona2);
        empresa.agregarEmpleado(persona3);
        empresa.agregarEmpleado(persona4);
        empresa.agregarObra(comercio);
        empresa.agregarObra(hotel);
        empresa.agregarObra(hogar);

        hogar.agregarObrero(persona1);
        hogar.agregarObrero(persona2);
        hogar.agregarMaestro(persona4);
        comercio.agregarObrero(persona1);
        comercio.agregarObrero(persona2);
        comercio.agregarMaestro(persona4);
        hotel.agregarObrero(persona1);
        hotel.agregarObrero(persona2);
        hotel.agregarMaestro(persona4);

        comercio.mostrarEmpleados();

        empresa.mostrarObras();




    }
}
