package laba4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BubbleSortTest {
    public static int[] mass;
    public static int[] mass0;
    public static int[] mass1;
    @BeforeClass
    public static void BeforeClass() {
        generateMass generateMass = new generateMass();
        mass0= generateMass.generate();
        mass1 = new int[6];
        for(int i=0;i<mass1.length;i++)
            mass1[i]=mass0[i];
        BubbleSort bubbleSort = new BubbleSort(mass0);
        mass = bubbleSort.showInfo();
    }
    @Test
    public  void bubblesort() {
        for(int i=0;i<(mass.length)-1;i++) {
            assertTrue(mass[i] < mass[i+1]);
        }
    }
    @AfterClass
    public static void AfterClass() {
        assertFalse(mass1==mass);
    }
}
