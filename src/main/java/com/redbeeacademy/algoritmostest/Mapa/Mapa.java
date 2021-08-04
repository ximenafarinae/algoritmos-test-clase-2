package com.redbeeacademy.algoritmostest.Mapa;

import java.util.*;

public class Mapa {
    Map<Integer,String> miHashMap = new HashMap<>();

    public Map<Integer, String> getMiHashMap() {
        miHashMap.put(1, "IronMaiden");
        miHashMap.put(3, "BlackSabbath");
        miHashMap.put(11, "Metallica");
        miHashMap.put(16, "Muse");
        miHashMap.put(18, "Foofigther");
        miHashMap.put(7, "PearlJam");
        miHashMap.put(15, "YeahYeahYeahs");
        miHashMap.put(8, "SoundGarden");
        return miHashMap;
    }

    public void imprimir(){

        // imprimimos map con un iterador
        Iterator<Integer> it = getMiHashMap().keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println("Clave: " + key + "-> Valor: "+ getMiHashMap().get(key));
        }
    }

    public static void treeMap(){
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "IronMaiden");
        treeMap.put(3, "BlackSabbath");
        treeMap.put(11, "Metallica");
        treeMap.put(16, "Muse");
        treeMap.put(18, "Foofigther");
        treeMap.put(7, "PearlJam");
        treeMap.put(15, "YeahYeahYeahs");
        treeMap.put(8, "SoundGarden");

        // Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        Iterator<Integer> it = treeMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
        }
    }

    public static void linkedListMap(){

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "IronMaiden");
        linkedHashMap.put(3, "BlackSabbath");
        linkedHashMap.put(11, "Metallica");
        linkedHashMap.put(16, "Muse");
        linkedHashMap.put(18, "Foofigther");
        linkedHashMap.put(7, "PearlJam");
        linkedHashMap.put(15, "YeahYeahYeahs");
        linkedHashMap.put(8, "SoundGarden");

        // Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        Iterator<Integer> it = linkedHashMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
        }
    }
}
