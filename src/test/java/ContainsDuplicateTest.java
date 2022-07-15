import junit.framework.TestCase;

import java.util.Arrays;

public class ContainsDuplicateTest extends TestCase {

    public void testExample1(){
        int[] nums = {1,2,3,1};
        Main.Solution.containsDuplicate(nums);
        boolean actualPrices = Main.Solution.containsDuplicate(nums);
        boolean expectedPrices = true;
        assertEquals(expectedPrices, actualPrices);
    }

    public void testExample2(){
        int[] nums = {1,2,3,4};
        Main.Solution.containsDuplicate(nums);
        boolean actualPrices = Main.Solution.containsDuplicate(nums);
        boolean expectedPrices = false;
        assertEquals(expectedPrices, actualPrices);
    }

    public void testExample3(){
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        Main.Solution.containsDuplicate(nums);
        boolean actualPrices = Main.Solution.containsDuplicate(nums);
        boolean expectedPrices = true;
        assertEquals(expectedPrices, actualPrices);
    }
}
