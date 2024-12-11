package ioc.xtec.cat.selectionsort;

/**
 * Classe que implementa l'algorisme de Selection Sort.
 *
 * <p>Proporciona funcionalitats per ordenar un array d'enters utilitzant 
 * l'algorisme de Selection Sort. També inclou un mètode per comprovar 
 * si un valor específic es troba en un array.</p>
 *
 * @author Carla
 * @version 1.0
 */

public class SelectionSort {

    /**
    * Ordena un array d'enters utilitzant l'algorisme de Selection Sort.
    *
    * <p>Reorganitza l'array en ordre ascendent canviant els elements 
    * de posició repetidament fins que tots estiguin ordenats.</p>
    *
    * @param arr L'array d'enters que es vol ordenar.
    * @throws IllegalArgumentException Si l'array és nul.
    */
   public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

   /**
    * Comprova si un valor específic es troba en un array.
    *
    * <p>Recorre l'array d'enters per verificar si conté el valor donat. 
    * Retorna cert si el valor es troba i fals en cas contrari.</p>
    *
    * @param arr L'array d'enters que es vol verificar.
    * @param value El valor que es busca a l'array.
    * @return Cert si el valor es troba a l'array, fals en cas contrari.
    * @throws IllegalArgumentException Si l'array és nul.
    */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
}
