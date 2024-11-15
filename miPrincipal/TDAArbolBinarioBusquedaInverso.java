// NO MODIFICAR

// TDAArbolBinarioBusquedaInverso.java
// Interfaz del tipo de dato abstracto árbol binario de búsqueda inverso
package miPrincipal;

public interface TDAArbolBinarioBusquedaInverso<T> extends TDAArbolBinario<T> {
    public  void    addElement( T elemento );                           // Agrega un elemento al árbol binario de búsqueda inverso
    public  T       removeElement( T elemento );                        // Elimina un elemento del árbol binario de búsqueda inverso
    public boolean  equals( TDAArbolBinarioBusquedaInverso<T> otro );   // Compara si dos árboles binarios de búsqueda son iguales
    public  int     contarNodosInternos();                              // Regresa el total de nodos que no son hojas
}
