package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static TDAArbolBinarioBusquedaInverso<Integer> a1, a2, a3;

    @BeforeAll public static void setUp() {
        a1 = new ArbolBinarioBusquedaInverso<Integer>( new Integer[] {1,2,3,4,5} );
        a2 = new ArbolBinarioBusquedaInverso<Integer>( new Integer[] {1,2,3} );
        a3 = new ArbolBinarioBusquedaInverso<Integer>( new Integer[] {3,2,1} );
    }

    @Test public void testNodosInternos() {
        assertTrue(a1.contarNodosInternos() == 4);
    }

    @Test public void testEquals() {
        assertTrue(!a2.equals( a3 ));
    }

    @Test public void testAddElement() {
        a1.addElement(6);
        assertTrue(a1.toString().equals("6\n5\n4\n3\n2\n1\n"));
    }

    @Test public void testRemoveElement() {
        a3.removeElement( 2 );
        assertTrue(a3.toString().equals("3\n1\n"));
    }
}