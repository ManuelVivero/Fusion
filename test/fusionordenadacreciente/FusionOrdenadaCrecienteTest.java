
package fusionordenadacreciente;

import org.junit.Test;
import static org.junit.Assert.*;


public class FusionOrdenadaCrecienteTest {
    
    public FusionOrdenadaCrecienteTest() {
    }

    @Test
    public void testEstaOrdenadoCreciente() {
        System.out.println("estaOrdenadoCreciente");
        int[] vector = {1,2,3,4};
        boolean result = FusionOrdenadaCreciente.estaOrdenadoCreciente(vector);
        assertTrue( result);

    }
        @Test
    public void testEstaOrdenadoCreciente2() {
        System.out.println("NoestaOrdenadoCreciente");
        int[] vector = {1,2,4,3};
        boolean result = FusionOrdenadaCreciente.estaOrdenadoCreciente(vector);
        assertFalse( result);

    }


    @Test (expected = NullPointerException.class)
    public void testFusionOrdenadaCreciente() {
        System.out.println("fusionOrdenadaCreciente");
        int[] array1 = null;
        int[] array2 = {1,2,3,4};
        int[] expResult = null;
        FusionOrdenadaCreciente.fusionOrdenadaCreciente(array1, array2);

    }
        @Test (expected = IllegalArgumentException.class)
    public void testFusionOrdenadaCreciente1() {
        System.out.println("fusionOrdenadaCreciente");
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,3,2,4};
        int[] expResult = null;
        FusionOrdenadaCreciente.fusionOrdenadaCreciente(array1, array2);

    }
    
        @Test
    public void testFusionOrdenadaCreciente2() {
        System.out.println("fusionOrdenadaCreciente");
        int[] array1 = {};
        int[] array2 = {};
        int[] expResult = {};
        int[] result = FusionOrdenadaCreciente.fusionOrdenadaCreciente(array1, array2);
        assertArrayEquals(expResult, result);

    }
        @Test
    public void testFusionOrdenadaCreciente3() {
        System.out.println("fusionOrdenadaCreciente");
        int[] array1 = {};
        int[] array2 = {1,2,3,4};
        int[] expResult = {1,2,3,4};
        int[] result = FusionOrdenadaCreciente.fusionOrdenadaCreciente(array1, array2);
        assertArrayEquals(expResult, result);

    }
    
        @Test
    public void testFusionOrdenadaCreciente4() {
        System.out.println("fusionOrdenadaCreciente");
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,4,6};
        int[] expResult = {1,1,2,3,4,4,6};
        int[] result = FusionOrdenadaCreciente.fusionOrdenadaCreciente(array1, array2);
        assertArrayEquals(expResult, result);

    }
    
    
}
