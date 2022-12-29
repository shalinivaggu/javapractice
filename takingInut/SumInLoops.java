import java.util.*;
public class SumInLoops {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("input number of test cases ");
        int t = sc.nextInt();

        for(int i = 1; i<= t ; i++)
        {
            int num_1 = sc.nextInt();
            int num_2 = sc.nextInt();
            System.out.println(num_1 +  num_2 );
        }

    }
}
