import java.util.Random;

class RandomNumber{
   public static void main(String[] args){
      Random num = new Random();
      int number = num.nextInt(10);
      System.out.println(num.nextInt(10));
      System.out.println(num.nextInt(10));
      System.out.println(num.nextInt(10));
      System.out.println(num.nextInt(10));
      System.out.println(num.nextInt(10));
   } 
}