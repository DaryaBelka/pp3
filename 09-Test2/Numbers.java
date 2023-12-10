// public class Numbers{
//     private int[] numbers;

//     public Numbers(int[] numbers) {
//         this.numbers = numbers;
//     }

//     public boolean different(int[] numbers){
//         for (int i = 0; i < numbers.length-1; i++) {
// //Начинаем смотреть на каждое число в массиве (кроме последнего).
//             for (int j = i+1; j < numbers.length; j++) { 
// //После выбора одного числа, сравниваем его со всеми остальными числами, начиная с того, которое идет после выбранного.
//                 if(numbers[i]==numbers[j]){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int[] arr1={1,2,3,4,5};
//         Numbers n1=new Numbers(arr1);
//         System.out.println(n1.different(arr1));

//         int[] arr2 = {3,4,2,1,6};
//         System.out.println(n1.different(arr2));

//         int[] arr3= {9,7,4,3,7};
//         System.out.println(n1.different(arr3));

//     }
// }

class Numbers {
   private int i1;
   private int i2;
   private int i3;
   private int i4;
   private int i5;

   public Numbers(int i1, int i2, int i3, int i4, int i5) {
      this.i1 = i1;
      this.i2 = i2;
      this.i3 = i3;
      this.i4 = i4;
      this.i5 = i5;
   }

   public boolean different() {
      if (i1 == i2 || i1 == i3 || i1 == i4 || i1 == i5 || i2 == i3 || i2 == i4 || i2 == i5 || i3 == i4 || i3 == i5
            || i4 == i5) {
         return false;
      } else {
         return true;
      }
   }
   public static void main(String[] args) {
      Numbers c = new Numbers(2, 4, 5, 7, 1);
      System.out.println(c.different());
   }

}