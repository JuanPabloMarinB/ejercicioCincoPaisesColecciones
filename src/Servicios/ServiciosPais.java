package Servicios;

import Entidades.Pais;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ServiciosPais {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    Pais p1;
    Set<String> paises = new TreeSet();

    public void agregarPaises() {

        boolean salir = false;
        String resp;
        String paisIngresado;


        do {
            Pais p1 = new Pais();
            System.out.println("Ingresa el nombre de un país");
            p1.setNombre(sc.next());
            p1.setNombre(p1.getNombre().substring(0, 1).toUpperCase() + p1.getNombre().substring(1).toLowerCase());
            paises.add(p1.getNombre());

            System.out.println("¿Quieres añadir otro país? S o N");

            do {
                resp = sc.next();
                if (!"n".equalsIgnoreCase(resp) && !"s".equalsIgnoreCase(resp)) {
                    System.out.println("Ingrese una opción Correcta");
                }
            } while (!"n".equalsIgnoreCase(resp) && !"s".equalsIgnoreCase(resp));

        } while (resp.equalsIgnoreCase("s"));

        System.out.println("Paises agregados");

        for (String elemento : paises) {
            System.out.println(elemento);
        }

        System.out.println("Ingresa el país que quieres eliminar");
        paisIngresado = sc.next();
        paisIngresado = paisIngresado.substring(0,1).toUpperCase() + paisIngresado.substring(1).toLowerCase();

        boolean flag=false;

        Iterator<String> it = paises.iterator();

        while (it.hasNext()) {
            String aux1 = it.next();
            if (aux1.equalsIgnoreCase(paisIngresado)){
                it.remove();
                flag=true;
            }
        }
        if(flag==false)
            System.out.println("País no encontrado");


        System.out.println("Paises agregados sin " + paisIngresado);

        for (String elemento : paises) {
            System.out.println(elemento);
        }


    }
}
