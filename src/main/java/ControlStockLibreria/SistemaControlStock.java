package ControlStockLibreria;


import java.util.Scanner;

public class SistemaControlStock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n      -- Sistema de control de stock de libros --\n  ");

        System.out.println("introduzca el ISBN del libro: ");
        String isbn = sc.nextLine();
        System.out.println("Introduzca el nombre del libro: ");
        String nombreLibro = sc.nextLine();

        System.out.println("Que accion desea realizar?");
        System.out.println("1. Agregar stock");
        System.out.println("2. Quitar stock");
        System.out.println("3. Consultar stock");
        System.out.println("4. Salir");

        int opcion = sc.nextInt();
        Libro libro = new Libro(nombreLibro);
        while (opcion != 4){
            switch (opcion){
                case 1:
                    System.out.println("Introduzca la cantidad de stock a agregar: ");
                    long cantidadLong = sc.nextLong();
                    if (cantidadLong > Integer.MAX_VALUE){
                        System.out.println("El stock del libro " + nombreLibro + " excede la capacidad de este sistema.");
                        break;
                    }
                    try{
                        libro.addToStock(cantidadLong);
                    } catch (ExcepcionStockDesbordado e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Introduzca la cantidad de stock a quitar: ");
                    cantidadLong = sc.nextLong();
                    if (cantidadLong<Integer.MIN_VALUE){
                        System.out.println("El stock del libro " + nombreLibro + " excede la capacidad de este sistema.");
                        break;
                    }
                    try{
                        libro.removeFromStock(cantidadLong);
                    } catch (ExcepcionStockDesbordado e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("El stock actual del libro " + nombreLibro + " es: " + libro.getStock());
                    break;
                default:
                    System.out.println("Opcion invalida, por favor, intentelo de nuevo.");
            }
            System.out.println("\nQue accion desea realizar?");
            System.out.println("1. Agregar stock");
            System.out.println("2. Quitar stock");
            System.out.println("3. Consultar stock");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
        }



    }
}
