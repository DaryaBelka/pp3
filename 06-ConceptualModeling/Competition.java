import java.util.Arrays;

public class Competition {
   private int judge1;
   private int judge2;
   private int judge3;
   private int judge4;
   private int judge5;
   private int[] grades = new int[] { 1, 2, 3, 4, 5 };

   public Competition() {
   }

   public void setJudge1(int judge1) {
      for (int i = 0; i < grades.length; i++) {
         if (judge1 == grades[i]) {
            this.judge1 = judge1;
         }
      }
   }

   public void setJudge2(int judge2) {
      for (int i = 0; i < grades.length; i++) {
         if (judge2 == grades[i]) {
            this.judge2 = judge2;
         }
      }
   }

   public void setJudge3(int judge3) {
      for (int i = 0; i < grades.length; i++) {
         if (judge3 == grades[i]) {
            this.judge3 = judge3;
         }
      }
   }

   public void setJudge4(int judge4) {
      for (int i = 0; i < grades.length; i++) {
         if (judge4 == grades[i]) {
            this.judge4 = judge4;
         }
      }
   }

   public void setJudge5(int judge5) {
      for (int i = 0; i < grades.length; i++) {
         if (judge5 == grades[i]) {
            this.judge5 = judge5;
         }
      }
   }

   public double score() {
      int[] allJudges = new int[] {judge1, judge2, judge3, judge4, judge5 };
      int min = Arrays.stream(allJudges).min().getAsInt();
      int max = Arrays.stream(allJudges).max().getAsInt();
      int sum = judge1 + judge2 + judge3 + judge4 + judge5 - min - max;
      double average = sum / 3.0;
      System.out.println("Score: " + average);
      return average;
   }

   public static void main(String[] args) {
      Competition c = new Competition();
      c.setJudge1(5);
      c.setJudge2(3);
      c.setJudge3(1);
      c.setJudge4(2);
      c.setJudge5(4);
      c.score();

   }

}
