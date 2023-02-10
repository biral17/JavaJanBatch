import java.util.Scanner;

public class SumofEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int nums;
        System.out.print("Enter the num: ");
        int nums = sc.nextInt();
        int sum =0;
        while(nums < 0){
            System.out.print("Enter the num: ");
            nums = sc.nextInt();
            sum += nums;
        }
        System.out.println("The total sum of nums: " + sum);
    }
}
