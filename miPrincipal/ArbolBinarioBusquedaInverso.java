package miPrincipal;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArbolBinarioBusquedaInverso<T> extends ArbolBinario<T> implements TDAArbolBinarioBusquedaInverso<T> {
    
    // Constructor
    public ArbolBinarioBusquedaInverso(T[] arreglo)
    {
    }

    // Método para agregar un elemento al árbol binario de búsqueda
    // Los elementos mayores o iguales a la raíz van a la izquierda
    // Los elementos menores a la raíz van a la derecha
    // Siempre se agregan como nodos hoja (sin hijos)
    public void addElement( T elemento )
    {
    } 

    // Elimina un elemento del árbol binario de búsqueda
    // Y promueve a uno de los descendientes como reemplazo
    // dejando la condición de que los valores a la izquierda
    // son mayores o iguales y los valores a la derecha son menores
    public T removeElement( T elemento )
    {
    }

    // nodoPromovido encuentra el nodo que debe sustituir al nodo eliminado
    // Si no tiene hijos, se sustituye con nulo
    // Si solo tiene un hijo, sustituir con ese hijo
    // Si tiene dos hijos, sustituir con el valor más pequeño del hijo izquierdo
    private NodoArbolBinario<T> nodoPromovido( NodoArbolBinario<T> nodo )
    {
    }

    public boolean equals(TDAArbolBinarioBusquedaInverso<T> otro )
    {
    }

    public int contarNodosInternos()
    {
    }

}
