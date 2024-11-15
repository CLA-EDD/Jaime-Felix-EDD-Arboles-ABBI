// NO MODIFICAR

// TDAArbolBinario.java
// Interfaz pública del Tipo de Dato Abstracto Árbol Binario
package miPrincipal;

import java.util.Iterator;

public interface TDAArbolBinario<T> {
    public  void removeLeftSubTree();                       // Elimina el subárbol izquierdo
    public  void removeRightSubTree();                      // Elimina el subárbol derecho
    public  void removeAllElements();                       // Elimina todos los elementos del árbol
    public  boolean contains(T elemento );                  // ¿El árbol contiene un elemento especifico?
    public  boolean isEmpty();                              // ¿El árbol está vacío?
    public  int size();                                     // El total de elementos dentro del árbol
    public  Iterator<T> iteratorPreOrden();                 // Para recorrer los elementos del árbol en PreOrden
    public  Iterator<T> iteratorInOrden();                  // Para recorrer los elementos del árbol en InOrden
    public  Iterator<T> iteratorPostOrden();                // Para recorrer los elementos del árbol en PostOrden
    public  String toString();                              // Convertir el TDAArbolBinario a una representación de cadena
}
