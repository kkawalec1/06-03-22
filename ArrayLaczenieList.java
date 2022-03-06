package Lista;

import java.util.*;

public class ArrayLaczenieList {
    public static void main(String[] args) {
        List<Uczestnik> lista = new ArrayList<>();
        lista.add(new Uczestnik("Witold", "Tarasiewicz", "M",25));
        lista.add(new Uczestnik("Katarzyna", "Kawalec", "K",38));
        lista.add(new Uczestnik("Alicja", "Szostek", "K",30));
        lista.add(new Uczestnik("Marcin", "Kowalski", "M",28));
        lista.add(new Uczestnik("Anton", "Majewski", "M",55));

        List<Uczestnik> lista2 = new ArrayList<>();
        lista2.add(new Uczestnik("Marek", "Lisowski", "M",17));
        lista2.add(new Uczestnik("Dominika", "Wilk", "K",26));
        lista2.add(new Uczestnik("Ula", "Kowal", "K",31));
        lista2.add(new Uczestnik("Piotr", "Wiejski", "M",69));
        lista2.add(new Uczestnik("Marcin", "Skalski", "M",85));
//---------------------------Połączenie list-------------------------------------------------------------------------------
        lista.addAll(lista2);
        //lista.forEach(l-> System.out.println(l));
//---------------------------Usuwanie duplikatów w liście-------------------------------------------------------------------------------
        List<Uczestnik> lista3 = new ArrayList<>();
        lista3.add(new Uczestnik("Marek", "Lisowski", "M",17));
        lista3.add(new Uczestnik("Dominika", "Wilk", "K",26));
        lista3.add(new Uczestnik("Ula", "Kowal", "K",31));
        lista3.add(new Uczestnik("Ula", "Kowal", "K",31));
        lista3.add(new Uczestnik("Marek", "Skalski", "M",85));
        lista3.forEach(l3-> System.out.println("---"+l3));

        Set<Uczestnik> UsunD = new LinkedHashSet<>(lista3);
        lista3 = new ArrayList<>(UsunD);
        System.out.println("--"+lista3);

//------------------------------------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------");
        List<String> las = Arrays.asList("cis","sosna","cis","dąb");
        System.out.println("Przed: " + las);
        Set<String> UsunDuplikat1 = new LinkedHashSet<>(las);
        las = new ArrayList<>(UsunDuplikat1);
        System.out.println("Po: " + las);
//------------------------------------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------");
        List<String> las2 = new ArrayList<>();
        las2.add("cis");
        las2.add("cis");
        las2.add("cis");
        las2.add("sosna");
        las2.add("orzech");
        System.out.println("# Przed: " + las2);
        Set<String> UsunDuplikat2 = new LinkedHashSet<>(las2);
        las2 = new ArrayList<>(UsunDuplikat2);
        System.out.println("# Po: " + las2);
 //-------------------------------------------------------------------------------------------------------



    }
}
