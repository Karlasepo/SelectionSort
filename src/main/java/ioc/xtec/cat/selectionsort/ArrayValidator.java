package ioc.xtec.cat.selectionsort;

/**
 * Classe per validar arrays abans de processar-los.
 *
 * <p>Aquesta classe assegura que un array sigui vàlid abans d'aplicar 
 * operacions com l'ordenació. Inclou comprovacions per assegurar que 
 * l'array no sigui nul ni buit.</p>
 *
 * @author Carlaa
 * @version 1.0
 */

public class ArrayValidator {

    /**
    * Valida que un array sigui vàlid per al seu processament.
    *
    * <p>Aquest mètode comprova que l'array no sigui nul ni buit. Si es detecten
    * errors, es llança una excepció amb un missatge descriptiu.</p>
    *
    * @param arr L'array d'enters que es vol validar.
    * @throws IllegalArgumentException Si l'array és nul o buit.
    */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
    
}
