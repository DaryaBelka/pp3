public class StudentTest {
   public static void main(String[] args) {

      Student s = new Student();
      s.name = "Peter";
      s.age = 21;
      s.studentID = "1233142";
      s.averageGrade = "4.5";

      Student a = new Student();
      a.name = "Anna";
      a.age = 19;
      a.studentID = "1231414";
      a.semesterNumber = 2;
      a.averageGrade = "5.0";

      Student c = new Student();
      c.name = "Klaudia";
      c.age = 20;
      a.studentID = "1231414";
      a.semesterNumber = 3;
      a.averageGrade = "3.0";

      System.out.println(s.name + " " + s.age);
      s.sayHello();
      s.displayName();
      s.displayAge();
      s.displayInfo();
      s.displaysValid();

      System.out.println(a.name + " " + a.age);
      a.sayHello();
      a.displayName();
      a.displayAge();
      a.displayInfo();
      a.displaysValid();

      System.out.println(c.name + " " + c.age);
      c.sayHello();
      c.displayName();
      c.displayAge();
      c.displayInfo();
      c.displaysValid();

   }
}