package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println( "ARBOL BINARIO DE BUSQUEDA INVERSO" );
        System.out.println( "=================================" );
        System.out.println();

        // Solicitar el número de elementos del arbol
        System.out.print( "Proporcione el numero de elementos del arbol:" );
        int totalElementos = entrada.nextInt();

        // Crear arreglo para almacenar el número de elementos del árbol
        Integer[] elementos = new Integer[ totalElementos ];

        // Ciclo para solicitar los elementos del arbol
        for ( int i = 0; i < totalElementos; i++ )
        {
        }

        // Crear los arboles binarios de busqueda inversos
        TDAArbolBinarioBusquedaInverso<Integer> abbi01;
        TDAArbolBinarioBusquedaInverso<Integer> abbi02;
        TDAArbolBinarioBusquedaInverso<Integer> abbi03;

        // Comparar abbi01 y abbi02
        if ( abbi01.equals( abbi02 ) )
        {}
        else
        {}

        // Comparar abbi01 y abbi03
        if ( abbi01.equals( abbi03 ) )
        {}
        else
        {}

        // Mostrar el total de nodos internos de abbi01

        // Eliminar la raíz

        // Mostrar abbi01 en recorrido inorden

        entrada.close();
    }
}