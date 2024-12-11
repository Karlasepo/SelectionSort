package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

/**
 * Classe principal per executar l'algorisme de Selection Sort.
 *
 * <p>Permet als usuaris introduir un array d'enters, validar-lo, buscar un valor en l'array,
 * ordenar-lo utilitzant l'algorisme de Selection Sort, i mostrar el resultat.</p>
 *
 * @author Carla
 * @version 1.0
 */

public class Main {

    /**
    * Punt d'entrada principal del programa.
    *
    * <p>Llegeix un array introduït per l'usuari, valida la seva estructura, busca un valor específic
    * dins de l'array, l'ordena i mostra el resultat. També maneja possibles errors amb arrays invàlids.</p>
    *
    * @param args Arguments de la línia de comandes (no utilitzats).
    */
    public static void main(String[] args) {
        System.out.println("Carla Segura Pozo");
        System.out.println("Opinió: He aprés molt fent el mòdul 8 de DAW encara que hagi estat dur!!!");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();

        try {
            validator.validateArray(array);

            System.out.print("Array original:");
            printArray(array);

            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt();

            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            sorter.sort(array);

            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    /**
    * Mostra els elements d'un array d'enters a la consola.
    *
    * <p>Recorre l'array i imprimeix cadascun dels seus elements, separats per un espai.</p>
    *
    * @param arr L'array d'enters que es vol mostrar.
    */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
