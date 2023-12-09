import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    ArrayList<String> products = new ArrayList<>();

    public void display(){
        System.out.println(products);
    }

    public void display_number(){
        System.out.println(products.size());
    }

    public void add_product(String product){
        products.add(product);
    }



    public static void main(String[] args) {
    ShoppingList a = new ShoppingList();
    Scanner keyboard = new Scanner(System.in);
    a.display();    
    a.display_number();
    String product = keyboard.nextLine();
    a.add_product(product);
        a.display();
    String product1 = keyboard.nextLine();
    a.add_product(product1);
        a.display();
    String product2 = keyboard.nextLine();
    a.add_product(product2);
    a.display();
    a.display_number();
    a.display();
    a.display_number();
    }
}
