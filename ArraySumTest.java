import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ArraySumTest {


   @Test
   public void testMin1() {
      int[] array = {1,2,3,4,5};
      int left = 1;
      int right = 3;
   
      int expected = 9;
      int actual = ArraySum.sum(array, left, right);
      assertEquals(expected, actual);
   }
}
