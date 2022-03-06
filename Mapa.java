package Lista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer,String> id = new HashMap<>(); // piersza wartość nie może się powtarzać, bo ją usunie
        id.put(1,"Ania");
        id.put(2,"Ania");
        id.put(3,"Ania");
        id.put(4,"Ania");
        id.put(5,"Ania");
        id.put(6,"Ania");
        id.forEach((k,v) -> System.out.println(k + ", "+v));
//------------------------------------------------------------------------
        System.out.println("--------------------------------------------------");
        Map<String,String> id2 = new HashMap<>();
        id2.put("Maja","Ania");
        id2.put("Stefan","Kamil");
        id2.put("Kamil","Ania");
        id2.put("Marek","Ania");
        id2.put("Zbigniew","Ania");
        id2.put("Lila","Ania");
        id2.forEach((k,v) -> System.out.println(k + ", "+v));
//------------------------------------------------------------------------
        System.out.println("--------------------------------------------------");
        Map<String,String> id3 = new HashMap<>();
        id3.put("Sopot","Ania");
        id3.put("Tczew","Kamil");
        id3.put("Gdynia","Bartek");
        id3.put("Gdańsk","Robert");
        id3.forEach((miasto,imie) -> System.out.println("Miasto: "+miasto));
        System.out.println("----------");
        id3.forEach((miasto,imie) -> System.out.println("Imię: "+imie));
//------------------------------------------------------------------------
        System.out.println("--------------------------------------------------");
        List<String> miasta =new ArrayList<String>();
        List<String> imiona =new ArrayList<String>();
        for (String miasto1 : id3.keySet())      {
            //System.out.println("Imiona: " + imie);
            miasta.add(miasto1);//using keyset() method for iteration over keySet
        }
        System.out.println("-----------");
        for (String imie1 : id3.values()) {       //using values() for iteration over keys
            //System.out.println("Miasta: " + miasto);
            imiona.add(imie1);
        }
        System.out.println(imiona);
        System.out.println(miasta);

    }
}
