package com.mycompany.bibliotecapoo;

import java.util.Scanner;


public class Principal {
    
    //Complejidad temporal: O(1) Tiempo constante
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca miBiblioteca = new Biblioteca();

        boolean continuar = true;

        do {
            System.out.println("Menu: ");
            System.out.println("1) Ingresar libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leído");
            System.out.println("5) Mostrar libros no leídos");
            System.out.println("6)Salir");
            System.out.println("Ingrese una opcion: ");

            int opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Titulo del libro: ");//O(1)
                    String titulo = sc.nextLine();//O(1)
                    System.out.println("Autor: ");//O(1)
                    String autor = sc.nextLine();//O(1)
                    System.out.println("Genero literario: ");//O(1)
                    String genero = sc.nextLine();//O(1)
                    System.out.println("Año de publicación: ");//O(1)
                    int anioPubli = sc.nextInt();//O(1)

                    boolean leido = false;//O(1)

                    Libro libroUsuario = new Libro(titulo, autor, anioPubli, genero, leido);
                    miBiblioteca.registrarLibro(libroUsuario);
                    break;
                case 2:
                    miBiblioteca.mostrarLibros();

                    break;
                case 3:
                    System.out.println("Ingrese su palabra de busqueda");
                    String busqueda = sc.nextLine();
                    miBiblioteca.buscarLibro(busqueda);
                    break;
                case 4:
                    System.out.println("Ingrese el titulo del libro que desea marcar como leido");
                    String tituloMarcado = sc.nextLine();

                    Libro libroAMarcar = miBiblioteca.buscarLibro(tituloMarcado);

                    if (libroAMarcar != null) {
                        libroAMarcar.marcarLeido();
                        System.out.println("El libro " + tituloMarcado + " se ha marcado correctamente como leido.");
                    } else {
                        System.out.println("No se encontro el libro " + tituloMarcado + ".");
                    }
                    break;
                case 5:
                    miBiblioteca.mostrarLibrosNoLeidos();
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Gracias por usar nuestro programa, que tenga un buen dia.");

                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (continuar);
        sc.close();
    }

}
