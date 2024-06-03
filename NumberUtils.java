
/**
 * Clase NumberUtils: contiene implementaciones de rutinas fundamentales
 * sobre números.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
import java.util.ArrayList;

public class NumberUtils
{
    
    /**
     * Comprueba si un número es primo.
     */
    public boolean esPrimo(int n) {
        if (n<=1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if  (n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Comprueba si un número es compuesto.
     */
    public boolean esCompuesto(int n) {
        
        return false;
    }

    /**
     * Calcula el máximo común divisor de dos números.
     */
    public int maximoComunDivisor(int n, int m) {
        int maxComDiv = 0;
        int cosciente = 0;
        if (n <= 1 && m <= 1){
            throw new IllegalArgumentException ("debe ser un numero positivo");
        }
        if (n == m)  {
             maxComDiv = n; 
        }
        if (n > m){
            cosciente = n / m;
            if (m / cosciente == 0)               
            {
                    maxComDiv = cosciente;
            }
        }
        return maxComDiv;
    }

    /**
     * Calcula el mínimo común múltiplo de dos números.
     */
    public int minimoComunMultiplo(int n, int m) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula los divisores de un número.
     */
    public ArrayList<Integer> divisores(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula los primeros n números primos
     */
    public int[] primos(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula el n-ésimo número de Fibonacci
     */
    public int nthFib(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula los dígitos de un número entero positivo.
     */
    public ArrayList<Integer> digitos(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
}
