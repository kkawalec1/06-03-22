package Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayScanner2 {
    public static void main(String[] args) {

//-----------------------------------------------------------------------------------------------------
        System.out.println("----------Dopisumejemy argumenty do listy--------------");
        Scanner zoo = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>(); //Tworzymy listę String
        list.add("lis"); //dodajemy obiekty do listy
        list.add("koń");
        list.add("słoń");
        list.add("żyrafa");
        list.add("zebra");
        list.add("łabędź");
        System.out.println("Dopisz zwierzęta do zoo, jeśli napiszesz 0 to skończysz:");
        while (zoo.hasNextLine()) {
            String z = zoo.nextLine();
            if (z.equals("0")) {
                break;
            }
            list.add(z);
        }
        list.forEach(lis -> System.out.println(lis));
//--------------------------------------------------------------------------------------------------


    }
}


        /* Przykład na którym zrobiłam zadanie:

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Enter your numbers, -1 to stop:");
        while (keyboard.hasNextInt()) {
            int num = keyboard.nextInt();
            if (num == -1) {
                break;
            }
            number.add(num);
        }
        System.out.println(number);*/


