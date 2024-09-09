import java.util.*;

public class Switch {
    public static void main(String[] args) {
        int x;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Day Number 1 to 7 =");
        x=sc.nextInt();/*
        "Monday", "Tuesday", "Wednesday", "Thursday",
    "Friday", "Saturday", "Sunday"*/
        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please Enter 1 to 7 Only");
                break;
        }
    }
}
