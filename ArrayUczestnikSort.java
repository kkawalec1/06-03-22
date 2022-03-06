package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayUczestnikSort {

    public static void main(String[] args) {
        List<Uczestnik> lista = new ArrayList<>();
        lista.add(new Uczestnik("Witold", "Tarasiewicz", "M",25));
        lista.add(new Uczestnik("Katarzyna", "Kawalec", "K",38));
        lista.add(new Uczestnik("Alicja", "Szostek", "K",30));
        lista.add(new Uczestnik("Marcin", "Kowalski", "M",28));
        lista.add(new Uczestnik("Anton", "Majewski", "M",55));
        /*for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }*/
        /*for (Uczestnik ucz:lista) {
            if (ucz.getPłeć().equals("K")){
                System.out.println("K: " + ucz);
            }}
        for (Uczestnik ucz:lista) {
            if (ucz.getPłeć().equals("M")){
                System.out.println("M: " + ucz);
            }}*/
        System.out.println("---------------------------Z listy po nazwisku zaczynającym się na 'K'--------------");
        for (Uczestnik ucz : lista) {
            if (ucz.getNazwisko().startsWith("K")) {
                System.out.println("Nazwisko na K: " + ucz);

            }
        }
        System.out.println("---------------------------Z listy po wieku --------------");
        for (Uczestnik ucz : lista) {
            if (ucz.getWiek() > 30) {
                System.out.println("Osoby powyżej 30: " + ucz);
            } else System.out.println("Osoby poniżej/równa 30: " + ucz);
        }
        System.out.println("---------------------------Z listy sortowanie --------------");
        Collections.sort(lista, Comparator.comparing(Uczestnik::getWiek));
        for (Uczestnik ucz : lista) {
            if (ucz.getWiek() > 30) {
                System.out.println("Osoby powyżej 30: " + ucz);
            } else System.out.println("Osoby poniżej/równa 30: " + ucz);
        }


    }}


