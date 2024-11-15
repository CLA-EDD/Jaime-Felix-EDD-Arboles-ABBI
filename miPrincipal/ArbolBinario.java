// NO MODIFICAR

// ArbolBinario.java
// Implementación de métodos comunes a los árboles binarios
package miPrincipal;

import java.util.Iterator;

public class ArbolBinario<T> implements TDAArbolBinario<T>{
    // Atributos
    protected NodoArbolBinario<T> raiz;     // Raíz del árbol binario
    protected int cuenta;                   // Contador de elementos en el árbol binario
    
    // Constructores
    public ArbolBinario( T raiz, ArbolBinario<T> izquierdo, ArbolBinario<T> derecho )
    {
        // Validar que la raíz sea diferente de null
        if ( raiz == null )
        {
            this.raiz = null;
            this.cuenta = 0;
        }
        else
        {
            this.raiz = new NodoArbolBinario<T>( raiz );
            this.cuenta = 1;

            // Preguntar si el subárbol izquierdo es diferente de null
            if ( izquierdo != null )
            {
                this.raiz.setIzquierdo( izquierdo.getRaiz() );
                cuenta += izquierdo.size();
            }

            // Preguntar si el sub´rbol derecho es diferente de null
            if ( derecho != null )
            {
                this.raiz.setDerecho( derecho.getRaiz() );
                cuenta += derecho.size();
            }
        }
    }

    public ArbolBinario( T raiz )
    {
        this( raiz, null, null );
    }

    public ArbolBinario()
    {
        this( null, null, null );
    }

    // Métodos set/get
    public void setRaiz( NodoArbolBinario<T> raiz )
    {
        this.raiz = raiz;
    }

    public NodoArbolBinario<T> getRaiz()
    {
        return raiz;
    }

    public void removeLeftSubTree()
    {
        // Si existe el subarbol izquierdo, disminuir cuenta según los hijos
        if ( raiz.getIzquierdo() != null )
            cuenta -= (1 + raiz.getIzquierdo().numeroDeHijos());

        raiz.setIzquierdo( null );
    }

    public void removeRightSubTree()
    {
        // Si existe el subarbol derecho, disminuir cuenta según los hijos
        if ( raiz.getDerecho() != null )
            cuenta -= (1 + raiz.getDerecho().numeroDeHijos());

        raiz.setDerecho( null );
    }

    public void removeAllElements()
    {
        raiz = null;
        cuenta = 0;
    }

    public boolean contains( T elemento )
    {
        // Validar si el árbol está vacío
        if ( isEmpty() )
            return false;
        
        boolean encontrado = false;

        // Iterator para recorrer la lista
        Iterator<T> iterador = iteratorInOrden();

        while ( iterador.hasNext() )
        {
            T elem = iterador.next();
            if ( elemento.equals( elem ) )
            {
                encontrado = true;
                break;
            }
        }

        return encontrado;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }
    
    public int size()
    {
        return cuenta;
    }

    public Iterator<T> iteratorPreOrden()
    {
        TDAListaDesordenada<T> lista = new ListaDesordenada<T>();
        preOrden( raiz, lista );

        return lista.iterator();
    }

    private void preOrden(NodoArbolBinario<T> raiz, TDAListaDesordenada<T> lista)
    {
        if ( raiz != null )
        {
            lista.addToRear(raiz.getElemento());
            preOrden( raiz.getIzquierdo(), lista );
            preOrden( raiz.getDerecho(), lista );
        }
    }

    public Iterator<T> iteratorInOrden()
    {
        TDAListaDesordenada<T> lista = new ListaDesordenada<T>();
        inOrden( raiz, lista );

        return lista.iterator();
    }

    private void inOrden(NodoArbolBinario<T> raiz, TDAListaDesordenada<T> lista)
    {
        if ( raiz != null )
        {
            inOrden( raiz.getIzquierdo(), lista );
            lista.addToRear(raiz.getElemento());
            inOrden( raiz.getDerecho(), lista );
        }
    }

    public Iterator<T> iteratorPostOrden()
    {
        TDAListaDesordenada<T> lista = new ListaDesordenada<T>();
        postOrden( raiz, lista );

        return lista.iterator();
    }

    private void postOrden(NodoArbolBinario<T> raiz, TDAListaDesordenada<T> lista)
    {
        if ( raiz != null )
        {
            postOrden( raiz.getIzquierdo(), lista );
            postOrden( raiz.getDerecho(), lista );
            lista.addToRear(raiz.getElemento());
        }
    }

    public String toString()
    {
        String resultado = "";

        Iterator<T> iterador = iteratorInOrden();

        while ( iterador.hasNext() )
        {
            T elemento = iterador.next();
            resultado = resultado + elemento + "\n";
        }

        return resultado;
    }
}








