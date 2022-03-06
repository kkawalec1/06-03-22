package Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayScanner3 {
    public static void main(String[] args) {

//-----------------------------------------------------------------------------------------------------
                Scanner zoo = new Scanner(System.in);
                ArrayList<String> list = new ArrayList<String>(); //Tworzymy listę String
                list.add("lis"); //dodajemy obiekty do listy
                list.add("koń");
                list.add("słoń");
                list.add("żyrafa");
                list.add("zebra");
                list.add("łabędź");

//----------Czyścimy listę lub nie i dopisujemy nowe argumenty do listy--------------"

                System.out.println("Lista przed zmianami: " + list);
                System.out.println("Chcesz wyczyścić listę? Wpisz 'T' lub 'N'");
                String a = zoo.nextLine();
                if (a.equals("T")) {
                    list.clear();
                    System.out.println("Ilość argumentów: "+list.size());
                    System.out.println("Wpisuj nowe argumenty, jeżeli chcesz zakończyć wpisz '0'");
                    while (zoo.hasNextLine()) {
                        String z = zoo.nextLine();
                        if (z.equals("0")) {
                            break;
                        }
                        list.add(z);
                    }
                    System.out.println("Lista po zmianach: ");
                    list.forEach(lis -> System.out.println(lis));
                }

                if(a.equals("N")) {
                    System.out.println("Wpisuj nowe argumenty, jeżeli chcesz zakończyć wpisz '0'");
                    while (zoo.hasNextLine()) {
                        String z = zoo.nextLine();
                        if (z.equals("0")) {
                            break;
                        }
                        list.add(z);
                    }
                    System.out.println("Lista po zmianach: ");
                    list.forEach(lis -> System.out.println(lis));
                }
                else {
                    System.out.println("Wprowadzono złą wartość. Wpisz duże 'T' lub duże 'N'");
                }
            }
        }
