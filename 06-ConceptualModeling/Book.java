import java.util.Arrays;

public class Book {
   private String title;
   private String author;
   private int publicationYear;
   private String genre;
   private String[] AllGenre = new String[] { "crime", "drama", "fantasy", "science fiction" };
   private double price;

   // Constructor
   public Book() {
   }

   public String getTitle() {
      return title;
   }

   public String getAuthor() {
      return author;
   }

   public int getPublicationYear() {
      return publicationYear;
   }

   public String getGenre() {
      return genre;
   }

   public String[] getAllGenre() {
      return AllGenre;
   }

   public void setGenre(String genre) {
      for (String i : AllGenre) {
         if (genre == i) {
            this.genre = genre;
         }
      }
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   @Override
   public String toString() {
      return "title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + ", genre=" + genre
            + ", AllGenre=" + Arrays.toString(AllGenre) + ", price=" + price;
   }

   public static void main(String[] args) {
      Book b = new Book();
      b.title = "Rano";
      b.author = "Arlasz";
      b.publicationYear = 2015;
      b.genre = "drama";
      b.price = 20.5;
      System.out.println(b.toString());
      b.setGenre("fantasy");
      b.setPrice(15.5);
      System.out.println(b.toString());
   }
}