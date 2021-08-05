package com.redbeeacademy.algoritmostest.Lista;
/*
Realizar los siguientes métodos:
1) Guarde un numero en una lista
2) Intercambie el elemento de la posicion 2 por la posicion 4.
3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista
4) Calcular el promedio de los elementos de una lista
5) Eliminar la posicion donde se encuentre el valor maximo de la lista
6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Lista {

    public static List<Integer> guardarEnLista(Integer numero) {
        List<Integer> listaNumeros = new ArrayList<>();
        if (numero != null) {
            listaNumeros.add(numero);
        } else {
            listaNumeros.add(0);
        }
        return listaNumeros;
    }

    public static List<Integer> intercambiar(List<Integer> lista) {
        Integer tercerElemento = lista.get(2);
        Integer quintoElemento = lista.get(4);
        List<Integer> listaNueva = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) != null){
                listaNueva.add(lista.get(i));
            }
        }
        listaNueva.remove(2);
        listaNueva.add(2, quintoElemento);
        listaNueva.remove(4);
        listaNueva.add(4, tercerElemento);
        return listaNueva;

    }

    public static List<Integer> agregarElementoAlInicio(List<Integer> lista, Integer numero) {
        List<Integer> listaNueva = new ArrayList<>(lista);
        if (numero != null) {
            listaNueva.add(0, numero);
        }

        return listaNueva;
    }

    public static Double promedioLista(List<Integer> lista) {
        Double suma = 0.0;
        Integer elementoVacio = 0;
        for (Integer elemento : lista) {
            if (elemento != null) {
                suma += elemento;
            } else {
                elementoVacio++;
            }

        }
        return suma / (lista.size() - elementoVacio);
    }

    public static List<Integer> eliminarMaximo(List<Integer> lista) {
        //TODO -> implement me
        return null;
    }

    public static List<Integer> repetidos(List<Integer> a, List<Integer> b) {
        //TODO -> implement me
        return null;
    }

}
