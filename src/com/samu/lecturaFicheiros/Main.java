package com.samu.lecturaFicheiros;

public class Main {

import LibreriaSamuel.LerDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
    public static void main(String[] args) {
        ArrayList<Libro> lista = new ArrayList();

        int casos;
        do{
            casos =Integer.parseInt(JOptionPane.showInputDialog("Bienvenido, que desea hacer? \n1.Añadir libros. \n2.Vender libros. \n3.Enseñar los libros (ordenados por título). "
                    + "\n4.Actualizar y eliminar los libros sin existencias. \n5.Consultar un libro por ISBN. \n6.Salir \n Escoja una opción por su número:"));
            switch(casos){
                case 1:
                    Libro libr = new Libro();
                    try{
                        Libreria.Engadir(lista, libr);
                    }
                    catch(NullPointerException ex){
                        System.out.println("Error por existencia de null");
                    }
                    break;
                case 2:
                    try{
                        Libreria.reducirStock(lista);
                    }
                    catch(NullPointerException ex){
                        System.out.println("Error por existencia de null");
                    }

                    break;
                case 3:
                    try{
                        Libreria.amosarLibro(lista);
                    }
                    catch(NullPointerException ex){
                        System.out.println("Error por existencia de null");
                    }
                    break;
                case 4:
                    try{
                        Libreria.eliminarLibro(lista);
                    }
                    catch(NullPointerException ex){
                        System.out.println("Error por existencia de null");
                    }
                    break;
                case 5:
                    try{
                        Libreria.consultaDeterminada(lista);
                    }
                    catch(NullPointerException ex){
                        System.out.println("Error por existencia de null");
                    }
                    break;
                case 6:
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Esta no es una opción.");
                    break;
            }
        }while(casos!=6);

    }
    }

