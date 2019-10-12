import java.util.Scanner;

public class FizzBuzz{

  public static String fizzbuzz(int num){
    String str = "";
    for (int i = 1; i <= num; i++){
      if (i % 3 == 0 && i % 5 == 0){
         str+= "Fizzbuzz \n";
      }
      else if (i % 5 == 0){
        str+= "Buzz \n";
      }
      else if (i % 3 == 0){
        str+= "Fizz \n";     
      }
      else {
        str+= i;
        str+= "\n";
      }
    }
    return str;
  }


}

class FizzDriver{

  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    System.out.println(FizzBuzz.fizzbuzz(num));
    
  }

}
