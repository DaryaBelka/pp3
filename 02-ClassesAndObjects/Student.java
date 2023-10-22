public class Student {
   String name;
   int age;
   String studentID;
   int semesterNumber;
   String averageGrade;
   boolean studentIdCardValid;

   void sayHello() {
      System.out.println("Hello from " + name + "\n");
   }

   void displayName() {
      System.out.println(name + "\n");
   }

   void displayAge() {
      System.out.println(age + "\n");
   }

   void displayInfo() {
      System.out.println(name + "\n" + semesterNumber + "\n" + averageGrade + "\n" + studentID + "\n");
   }

   void displaysValid() {
      String valid = (studentIdCardValid == true) ? "Card is valid" : "Card is invalid";
      System.out.println(valid + "\n");
   }

}