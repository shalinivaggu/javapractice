import java.util.*;
public class percentage {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("input subject_1 marks: ");
        int sub_1 = sc.nextInt();

        System.out.print("input subject_2 marks: ");
        int sub_2 = sc.nextInt();

        System.out.print("input subject_3 marks: ");
        int sub_3 = sc.nextInt();

        int total_marks = sub_1 + sub_2 + sub_3 ;

        float percentage = total_marks / 3.0f ;

        System.out.println("total marks: " + total_marks);
        System.out.println("percentage : " + percentage + "%");

    }
}
