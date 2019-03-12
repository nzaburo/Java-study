import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    int[] numbers = {3, 4, 5};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int n : numbers) {
      if (n == input) {
        System.out.println("あたり!");
      }
    }
  }
}