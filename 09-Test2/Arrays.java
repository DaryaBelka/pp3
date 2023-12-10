public class Arrays {
   static boolean arr(int[] arr1, int[] arr2) {
      int count1 = 0;
      for (int n : arr1) {
         if (n >= 10 && n <= 100) {
            count1++;
         }
      }
      int count2 = 0;
      for (int n : arr2) {
         if (n >= 10 && n <= 100) {
            count2++;
         }
      }
      if (count1 == count2) {
         return true;
      } else {
         return false;
      }

   }

   public static void main(String[] args) {

      int[] a1 = { 18, 4, 5, 37, 49, 177 };
      int[] a2 = { 9, 6, 7, 12, 48, 4, 6, 90, 6, 7, 8, 4 };
      System.out.println(Arrays.arr(a1, a2));
   }
}