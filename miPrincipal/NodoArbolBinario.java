// NO MODIFICAR

// NodoArbolBinario.java
// Clase para implementar los nodos de un árbol binario
package miPrincipal;

public class NodoArbolBinario<T> {
    // Atributos
    private T elemento;
    private NodoArbolBinario<T> izquierdo;
    private NodoArbolBinario<T> derecho;

    // Constructores
    public NodoArbolBinario( T elemento )
    {
        this.elemento = elemento;
        izquierdo = null;
        derecho = null;
    }

    public NodoArbolBinario()
    {
        this( null );
    }

    // Métodos set/get
    public void setElemento( T elemento )
    {
        this.elemento = elemento;
    }

    public void setIzquierdo( NodoArbolBinario<T> izquierdo )
    {
        this.izquierdo = izquierdo;
    }

    public void setDerecho( NodoArbolBinario<T> derecho )
    {
        this.derecho = derecho;
    }

    public T getElemento()
    {
        return elemento;
    }

    public NodoArbolBinario<T> getIzquierdo()
    {
        return izquierdo;
    }

    public NodoArbolBinario<T> getDerecho()
    {
        return derecho;
    }

    // Método para contar el número de hijos que tiene el nodo
    public int numeroDeHijos()
    {
        int hijos = 0;

        // Preguntar si el nodo tiene hijo izquierdo
        if ( izquierdo != null )
            hijos += 1 + izquierdo.numeroDeHijos();

        // Preguntar si el nodo tiene hijo derecho
        if ( derecho != null )
            hijos += 1 + derecho.numeroDeHijos();

        return hijos;
    }
}
