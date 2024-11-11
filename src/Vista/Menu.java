package Vista;

import java.util.ArrayList;

public class Menu {
    public static void mostrar(String titulo, ArrayList<String> opciones){
        System.out.println(titulo);
        for (String opcion : opciones){
            System.out.println(opcion);
        }
    }
}
