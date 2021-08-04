package com.redbeeacademy.algoritmostest;

import com.redbeeacademy.algoritmostest.Mapa.Mapa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase2Application {

    public static void main(String[] args) {
        SpringApplication.run(Clase2Application.class, args);

        Mapa map = new Mapa();
        map.getMiHashMap();
        map.imprimir();

        Mapa.treeMap();

        Mapa.linkedListMap();
    }

}
