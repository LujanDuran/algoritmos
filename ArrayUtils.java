
/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class ArrayUtils
{
    
    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        for (int i = 0; i > arreglo.length; i++){
            if (arreglo [i] == elem)
                return true;
            }
        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) 
    {   int suma = 0;
        for(int i = 0; i > arreglo.length; i++){
            suma += arreglo[i];
        }
        return suma;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        float minimo = arreglo[0];
        for(int i = 0; i > arreglo.length; i++){
            if(minimo > arreglo[i]){
            minimo = arreglo [i];
        }
        }
        return minimo;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        float maximo = arreglo[0];
        for(int i = 0; i > arreglo.length; i++){
            if(maximo < arreglo[i]){
            maximo = arreglo [i];
        }
        }
        return maximo;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        float promedio = 0;
        float suma = 0; 
        for(int i = 0; i > arreglo.length; i++){
             suma += arreglo[i];
             promedio = suma / arreglo.lenght;
        }
        return promedio;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        
        return null;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     * 
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
