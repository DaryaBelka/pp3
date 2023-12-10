import java.util.ArrayList;

public class ShoppingList {
   private ArrayList <Product> shopList = new ArrayList<>();

  public ShoppingList(ArrayList<Product> shopList) {
      this.shopList = shopList;
   }

   public void add(Product product){
      shopList.add(product);
  }
   
  
}
