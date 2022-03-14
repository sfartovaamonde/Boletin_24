package com.samu.lecturaFicheiros;

import java.util.ArrayList;
import LibreriaSamuel.LerDatos;
import java.util.Arrays;
import Arrays.metodosArray;
import java.util.Collections;
import java.util.Comparator;



public class Libreria {

    public static ArrayList<Libro> Engadir (ArrayList<Libro> lista, Libro libr){
        boolean comp = false;
        libr.setISBN(LerDatos.lerString("ISBN del libro: "));
        int stock = LerDatos.lerInteger("Cuantos ejemplares tiene(stock)?");
        for(int i = 0; i<lista.size();i++){
            if(libr.equals(lista.get(i))){
                Libro libr2 = lista.get(i);
                libr2.setUnidades(libr2.getUnidades()+stock);
                comp = true;
            }

        }
        if (comp == false){
            libr.setTítulo(LerDatos.lerString("Título:"));
            libr.setPrezo(LerDatos.lerFloat("Precio:"));
            libr.setAutor(LerDatos.lerString("Autor:"));
            libr.setUnidades(libr.getUnidades()+stock);
            lista.add(libr);
        }

        return lista;

    }

    public static void reducirStock(ArrayList<Libro> lista){
        int stock = LerDatos.lerInteger("Stock vendido");
        String code = LerDatos.lerString("Dime el ISBN del producto");
        for(int i = 0; i<lista.size();i++){
            Libro lib = lista.get(i);
            String code2 = lib.getISBN();
            if(code.equals(code2)){
                lib.setUnidades(lib.getUnidades()-stock);

            }
        }
    }

    public static void amosarLibro (ArrayList<Libro> lista){

        Collections.sort(lista);
        lista.iterator();
        System.out.println(lista);

    }


    public static void consultaDeterminada (ArrayList<Libro> lista){
        String code = LerDatos.lerString("ISBN del libro que busca: ");

        for(int i = 0; i<lista.size();i++){
            Libro libr = lista.get(i);
            String code2 = libr.getISBN();
            if(code.equals(code2)){
                System.out.println(lista.get(i));

            }
            else
                System.out.println("Libro no encontrado.");
        }
    }

    public static void eliminarLibro (ArrayList<Libro> lista){

        for(int i = 0; i<lista.size();i++){
            if(lista.get(i).getUnidades() == 0){
                lista.remove(i);
            }
        }
    }

}
