import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("give a num1:");
        int num1 = sc.nextInt();

        System.out.print("give a num2:");
        int num2 = sc.nextInt();

        int x;

        x = num1;
        num1 = num2;
        num2 = x;

        System.out.println(num1+","+num2);


    }
}
