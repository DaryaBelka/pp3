public class ComputerFile {
   String fileName;
   int size;
   String extention;
   String location;
   String modDate;
   String content;
   boolean open;

   public ComputerFile() {
   }

   void open() {
      this.open = true;
   }

   void close() {
      this.open = false;
   }

   void edit(String text) {
      if (this.open) {
         this.content = text;
      }

   }

   void rename(String fileName) {
      this.fileName = fileName;
   }

   String displayContent() {
      return this.content;
   }

   public static void main(String[] args) {
      ComputerFile c = new ComputerFile();
      c.fileName = "Ekonomia - notatki";
      c.content = "R\u00f3wnowaga makroekonomiczna\nWyst\u0119puje w\u00f3wczas, gdy globalny popyt r\u00f3wna si\u0119 globalnej poda\u017cy, tzn. gdy suma planowanych globalnych wydatk\u00f3w jest r\u00f3wna dok\u0142adnie warto\u015bci wytworzonej produkcji. ";
      System.out.println(c.displayContent());
   }
}
