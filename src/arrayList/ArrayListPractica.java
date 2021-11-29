package arrayList;

import java.util.ArrayList;

public class ArrayListPractica {
     public static void main(String[] args) {
        //método main() en el cual a su vez crees una instancia de ArrayList
         // que contenga cuatro objetos de tipo Persona e imprímelos en pantalla.

         ArrayList<Persona> list = new ArrayList<>();
         list.add(new Persona ("Luisa", "Luna"));
         list.add(new Persona ("Alejandro", "Tellez"));
         list.add(new Persona ("Fernando", "Lopez"));
         list.add(new Persona ("Juan", "Perez"));

         System.out.println(list);

    }
}
