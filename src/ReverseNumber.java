import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");

        //1234
        int num = sc.nextInt();
         int reverse = 0;
         while(num != 0){
             //get the last digit
             int digit = num % 10; //digit = 4
             reverse = reverse*10 + digit; // 0 = 0*10 + 4  ----  4

             //to remove the last digit from the num
             num /= 10; // num = 123
         }

        System.out.println("Reversed of "+ num + " is : "+ reverse);
    }

}
