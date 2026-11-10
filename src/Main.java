import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Juan", 25, 1.70f);
        System.out.printf("List - Lista");

        List<Persona> lista = new ArrayList<>();
        lista.add(persona);
        lista.add(persona1);
        lista.add(persona2);
        lista.add(new Persona("PepeTola", 46, 1.65f));
        lista.add(new Persona("Vero", 38, 1.60f));
        lista.add(new Persona("Francisco", 22, 1.68f));
        lista.add(new Persona("Paulina", 26, 1.58f));
        lista.add(new Persona("Jeimy", 18, 1.88f));
        lista.add(new Persona("Stiven", 44, 1.72f));
        lista.add(new Persona("Javier", 78, 1.50f));

        persona.setNombre("David");

        System.out.println("Listado de personas");
        for (Persona p : lista) {
            System.out.println(p.descripcion());
        }

        lista.get(0).setEdad(18);
        lista.get(0).imprimirdatos();

        lista.get(1).setEdad(18);
        lista.get(1).imprimirdatos();

        lista.get(2).setEdad(18);
        lista.get(2).imprimirdatos();

        lista.get(3).setEdad(18);
        lista.get(3).imprimirdatos();

        lista.get(4).setEdad(18);
        lista.get(4).imprimirdatos();

        System.out.println("Set - Conjunto");
        Set<String> nombres = new HashSet<>();
        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Irene");
        nombres.add("Michael");
        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Irene");
        nombres.add("Michael");
        System.out.println("Nombre unicos (sin orden garantizado): " + nombres);

        Set<Persona> nombres2 = new HashSet<>();
        nombres2.add(new Persona("Francisco", 22, 1.68f));
        nombres2.add(new Persona("Paulina", 26, 1.58f));
        nombres2.add(new Persona("Vero", 44, 1.77f));
        nombres2.add(new Persona("Vero", 27, 1.88f));
        nombres2.add(new Persona("Vero", 11, 1.44f));


        for (Persona p : nombres2) {
            System.out.println(p.descripcion());
        }

        System.out.println("HashMap");
        Map<String, Persona> codigounico = new HashMap<>();
        codigounico.put("E01", persona);
        codigounico.put("E02", persona1);
        codigounico.put("E03", persona2);
        codigounico.put("E04", lista.get(4));

        System.out.println("Codigo unico E03 " + codigounico.get("E03").descripcion());
        System.out.println("Codigo unico E02 " + codigounico.get("E02").descripcion());
        //System.out.println("Codigo unico E10 " + codigounico.get("E10").descripcion());
        System.out.println("Codigo unico E10 " + codigounico.containsKey("E10"));

        Scanner sc = new Scanner(System.in);

        System.out.println("---- INGRESO DE PERSONAS ----");
        while(true) {
            System.out.println("Ingrese el un nombre o digite 0 para finalizar: ");
            String texto = sc.nextLine();
            try {
                int numero = Integer.parseInt(texto);
                if (numero == 0){
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Ingreso: " + texto);
            }
        }
        sc.close();
        System.out.println(); // atajo → sout
    }
}