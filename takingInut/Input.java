public class Input {
    public static void main(String[] args) {

        System.out.println("input name ,roll number,field of interest: ");
        Scanner sc = new Scanner(System.in);

        String f_name = sc.next();
        String l_name = sc.next();

        int roll_no = sc.nextInt();
        String field = sc.next();

        System.out.println("name:"+f_name+l_name);
        System.out.println("roll number: "+ roll_no);
        System.out.println("field of interest : "+ field);

    }
}
