import java.util.Scanner;

public class ScanningValues {

    //opertors,
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        /*System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        if(a ==b){
            System.out.println("a is equal to b");
        }else{
            System.out.println("a is not equal to b");
        }*/

        /*System.out.print("Enter the value of c : ");
        int c = sc.nextInt();

        if(c>=50){
            System.out.println("first condition");
            System.out.println("first condition");
        }
        else if((c>=40 ) && (c<=49)){
            System.out.println("second condition");

        }else if((c>=30) && (c <= 39)){
            System.out.println("third condition");

        }else{
            System.out.println("no condition");
        }*/

        //switch cases
        System.out.println("Enter the value of 1 for English");
        System.out.println("Enter the value of 2 for French");
        System.out.println("Enter the value of 3 for Hindi");

        System.out.print("select the value: ");
        int input = sc.nextInt();

        switch(input){
            case 1:
                System.out.println("English is selected");
                break;
            case 2:
                System.out.println("French is selected");
                break;
            case 3:
                System.out.println("Hindi is selected");
                break;
            default:
                System.out.println("wrong input! pls try again");
        }

    }
}
