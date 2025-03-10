
import java.util.*;

public class homework {
//----------------------------------------------------------------------LECTURE 3 HOMEWORK---------------------------------------------


// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     int  addition = a + b ;
//     System.out.println(addition);

//     int substraction = a - b ;
//     System.out.println(substraction);

//     int multiplication = a * b;
//     System.out.println(multiplication);

//     int division = a / b ;
//     System.out.println(division);

//     int modulo = a%b ;
//     System.out.println(modulo);

// }



// ---------------------------------------------------------------------------------------------------------------------


public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    int month = sc.nextInt();

    switch (month) {

        case 1:
        System.out.println("January");
        break;

        case 2:
        System.out.println("February");
        break;

        case 3:
        System.out.println("March");
        break;

        case 4:
        System.out.println("April");
        break;

        case 5:
        System.out.println("May");
        break;

        case 6:
        System.out.println("June");
        break;

        case 7:
        System.out.println("July");
        break;

        case 8:
        System.out.println("August");
        break;

        case 9:
        System.out.println("September");
        break;

        case 10:
        System.out.println("October");
        break;

        case 11:
        System.out.println("November");
        break;

        case 12:
        System.out.println("December");
        break;

        default :
        System.out.println("Invalid Month");
    }
}
}
