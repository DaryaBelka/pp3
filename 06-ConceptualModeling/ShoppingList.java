import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList{
   ArrayList<String> products = new ArrayList<>();

   void display(){
      System.out.println(products);
   }

   void NumProducts(){
      System.out.println(products.size());
   }

   void AddProduct(String product){
      products.add(product);
   }
   




   public static void main(String[] args) {
      ShoppingList c = new ShoppingList();
      Scanner a = new Scanner(System.in);
      String product = a.nextLine();
      c.AddProduct(product);
      c.display();
      c.NumProducts();
      c.AddProduct("kiwi");
      c.display();
      c.NumProducts();

   }

}
