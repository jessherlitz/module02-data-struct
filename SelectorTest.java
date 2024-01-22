import org.junit.Assert;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;


public class SelectorTest {

   @Test
   public void testMin1() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(4);
   
      int expected = 2;
      int actual = Selector.min(a, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testMin2() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(5);
      a.add(9);
      a.add(1);
      a.add(7);
      a.add(3);
   
      int expected = 1;
      int actual = Selector.min(a, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testMin3() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(7);
      a.add(6);
      a.add(5);
      a.add(4);
   
      int expected = 4;
      int actual = Selector.min(a, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testMin4() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(3);
      a.add(4);
   
      int expected = 2;
      int actual = Selector.min(a, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testMax1() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(4);
   
      int expected = 8;
      int actual = Selector.max(a, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testMax2() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(5);
      a.add(9);
      a.add(1);
      a.add(7);
      a.add(3);
   
      int expected = 9;
      int actual = Selector.max(a, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testMax3() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(7);
      a.add(6);
      a.add(5);
      a.add(4);
   
      int expected = 8;
      int actual = Selector.max(a, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testMax4() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(3);
      a.add(4);
   
      int expected = 8;
      int actual = Selector.max(a, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testKMin1() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(4);
   
      int expected = 2;
      int k = 1;
      int actual = Selector.kmin(a, k, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testKMin2() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(5);
      a.add(9);
      a.add(1);
      a.add(7);
      a.add(3);
   
      int expected = 5;
      int k = 3;
      int actual = Selector.kmin(a, k, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testKMin3() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(7);
      a.add(6);
      a.add(5);
      a.add(4);
   
      int expected = 8;
      int k = 5;
      int actual = Selector.kmin(a, k, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testKMin4() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(3);
      a.add(4);
   
      int expected = 4;
      int k = 3;
      int actual = Selector.kmin(a, k, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testKMax1() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(4);
   
      int expected = 8;
      int k = 1;
      int actual = Selector.kmax(a, k, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testKMax2() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(5);
      a.add(9);
      a.add(1);
      a.add(7);
      a.add(3);
   
      int expected = 5;
      int k = 3;
      int actual = Selector.kmax(a, k, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testKMax3() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(7);
      a.add(6);
      a.add(5);
      a.add(4);
   
      int expected = 4;
      int k = 5;
      int actual = Selector.kmax(a, k, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testKMax4() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(3);
      a.add(4);
   
      int expected = 4;
      int k = 3;
      int actual = Selector.kmax(a, k, comp);
      assertEquals(expected, actual);
   }

  

   @Test
   public void testRange1() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(4);
   
      int low = 1;
      int high = 5;
      List<Integer> expected = new ArrayList<Integer>();
      expected.add(2);
      expected.add(3);
      expected.add(4);
      Collection<Integer> actual = Selector.range(a, low, high, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testRange2() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(5);
      a.add(9);
      a.add(1);
      a.add(7);
      a.add(3);
   
   
      int low = 3;
      int high = 5;
      List<Integer> expected = new ArrayList<Integer>();
      expected.add(5);
      expected.add(3);
      Collection<Integer> actual = Selector.range(a, low, high, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testRange3() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(7);
      a.add(6);
      a.add(5);
      a.add(4);
   
      int low = 4;
      int high = 8;
      List<Integer> expected = new ArrayList<Integer>();
      expected.add(8);
      expected.add(7);
      expected.add(6);
      expected.add(5);
      expected.add(4);
      Collection<Integer> actual = Selector.range(a, low, high, comp);
      assertEquals(expected, actual);
   }
  
   @Test
   public void testRange4() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(3);
      a.add(4);

      int low = 3;
      int high = 7;
      List<Integer> expected = new ArrayList<Integer>();
      expected.add(7);
      expected.add(3);
      expected.add(3);
      expected.add(4);
      Collection<Integer> actual = Selector.range(a, low, high, comp);
      assertEquals(expected, actual);
   }
  
   @Test
   public void testFloor() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(4);
   
      int key = 6;
      int expected = 4;
      int actual = Selector.floor(a, key, comp);
      assertEquals(expected, actual);
   }
   
   @Test
   public void testFloor2() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(5);
      a.add(9);
      a.add(1);
      a.add(7);
      a.add(3);
   
      int key = 1;
      int expected = 1;
      int actual = Selector.floor(a, key, comp);
      assertEquals(expected, actual);
   } 

   @Test
   public void testFloor3() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(7);
      a.add(6);
      a.add(5);
      a.add(4);
   
      int key = 9;
      int expected = 8;
      int actual = Selector.floor(a, key, comp);
      assertEquals(expected, actual);
   }
   
   @Test
   public void testFloor4() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(3);
      a.add(4);
   
      int key = 5;
      int expected = 4;
      int actual = Selector.floor(a, key, comp);
      assertEquals(expected, actual);
   } 
  
   @Test
   public void testCeil() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(4);
   
      int key = 1;
      int expected = 2;
      int actual = Selector.ceiling(a, key, comp);
      assertEquals(expected, actual);
   }

   @Test
   public void testCeil2() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(5);
      a.add(9);
      a.add(1);
      a.add(7);
      a.add(3);
   
      int key = 7;
      int expected = 7;
      int actual = Selector.ceiling(a, key, comp);
      assertEquals(expected, actual);
   } 

   @Test
   public void testCeil3() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(7);
      a.add(6);
      a.add(5);
      a.add(4);
   
      int key = 0;
      int expected = 4;
      int actual = Selector.ceiling(a, key, comp);
      assertEquals(expected, actual);
   }
   
   @Test
   public void testCeil4() {
      List<Integer> a = new ArrayList<Integer>();
      Comparator<Integer> comp = Comparator.naturalOrder();
      a.add(8);
      a.add(2);
      a.add(8);
      a.add(7);
      a.add(3);
      a.add(3);
      a.add(4);
   
      int key = 5;
      int expected = 7;
      int actual = Selector.ceiling(a, key, comp);
      assertEquals(expected, actual);
   } 
}
