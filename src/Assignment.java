import java.util.Scanner;

public class Assignment {
    public static void main(String[] args){
        ////////////////////////////////////////////// Question 1

//        System.out.print("Hello, World!");

        ////////////////////////////////////////////// Question 2

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter your age: ");
//        String age = sc.nextLine();
//        System.out.print("Name: "+name+"\nAge: "+age);

//        int age = 20;
//        String name = "Aruzhan";
//        System.out.print("Name: "+name+"\nAge: "+age);

        ////////////////////////////////////////////// Question 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int firstNum = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int secondNum = sc.nextInt();
//        System.out.println("Sum of: "+firstNum+" and "+secondNum+" is "+(firstNum+secondNum));

//        Scanner sc = new Scanner(System.in);
//        int firstNum = sc.nextInt();
//        int secondNum = sc.nextInt();
//        System.out.println((firstNum+secondNum));

        ////////////////////////////////////////////// Question 4

//        Scanner sc = new Scanner(System.in);
//        int checkNum = sc.nextInt();
//        if (checkNum > 0){
//            System.out.println("POSITIVE");
//        } else if (checkNum == 0){
//            System.out.println("ZERO");
//        } else if (checkNum < 0){
//            System.out.println("NEGATIVE");
//        } else {
//            System.out.println("Invalid value");
//        }

        ////////////////////////////////////////////// Question 5

//        int i;
//        for(i=1; i<=5; i++){
//            System.out.println(i);
//        }

        ////////////////////////////////////////////// Question 6

//        Scanner sc = new Scanner(System.in);
//        int checkNum = sc.nextInt();
//        if (checkNum % 2 == 0) {
//            System.out.println("EVEN");
//        } else {
//            System.out.println("ODD");
//        }

        ////////////////////////////////////////////// Question 7

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a>b){
//            System.out.println(a);
//        } else if (a<b){
//            System.out.println(b);
//        } else if (a == b) {
//            System.out.println(a);
//        } else {
//            System.out.println("Invalid value");
//        }

        ////////////////////////////////////////////// Question 8

//        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        switch(month){
//            case 12, 1, 2:
//                System.out.println("Winter");
//                break;
//            case 3, 4, 5:
//                System.out.println("Spring");
//                break;
//            case 6, 7, 8:
//                System.out.println("Summer");
//                break;
//            case 9, 10, 11:
//                System.out.println("Autumn");
//                break;
//            default:
//                System.out.println("Invalid value");
//        }

        ////////////////////////////////////////////// Question 9

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        while (num>=1){
//            System.out.println(num);
//            num--;
//        }

        ////////////////////////////////////////////// Question 10

//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age >= 18){
//            System.out.println("Adult");
//        } else {
//            System.out.println("Not adult");
//        }

        ////////////////////////////////////////////// Question 11

//        Scanner sc = new Scanner(System.in);
//        int score = sc.nextInt();
//        if (score >= 90){
//            System.out.println("A");
//        } else if (score >= 75){
//            System.out.println("B");
//        } else if (score >= 50){
//            System.out.println("C");
//        } else if (score >= 0){
//            System.out.println("F");
//        }

        ////////////////////////////////////////////// Question 12

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        int SUM = 0;
        for (i=N; i>0; i--){
            if (i % 2==0){
                SUM= SUM + i;
            }
        }
        System.out.println(SUM);
    }

    ////////////////////////////////////////////// Question 13

}
