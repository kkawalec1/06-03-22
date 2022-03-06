package Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); //Tworzymy listę String
        list.add("lis"); //dodajemy obiekty do listy
        list.add("koń");
        list.add("słoń");
        list.add("żyrafa");
        list.add("zebra");
        list.add("łabędź");
        //System.out.println(list); //metoda wywołania 1
        //System.out.println("-----------------------------------------------------------------------");
       /* for (int i=0; i<list.size(); i++) { //metoda wywołania 2
            System.out.println(list.get(i));
        }*/
        // list.add -> dodawanie do listy
        // list.remove -> usuwanie z listy

        System.out.println("-----------------------------------------------------------------------");
        //list.forEach(zoo -> System.out.println(zoo)); //metoda wywołania listy 3, "zoo" nowa zmienna
        System.out.println("-------DODAWANIE DO LISTY ZE SCANNERA z warunkiem podania liczby wpisywanych obiektów----------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ilość wprowadzanych pozycji:");
        int ilosc = scanner.nextInt();
        System.out.println("Wpisz nazwę zwierzaka "+ilosc +" razy:");
        int i = 0;
        while (i < ilosc+1){
            String ptak = scanner.nextLine();
            list.add(ptak);
            i++;
        }
       for (int c = 0; c < list.size(); c++){
            System.out.println(list.get(c));
        }






    }
}
