import java.util.List;

public class Testing {
   

   public static void main(String[] args) {
   
   }


   public static <T> boolean searchB(List<T> list, T target) {
      for (T element : list) {
         if (element.equals(target)) {
            return true;
         }
      }
      return false;
   }
}
