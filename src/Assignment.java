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

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int i;
//        int SUM = 0;
//        for (i=N; i>0; i--){
//            if (i % 2==0){
//                SUM= SUM + i;
//            }
//        }
//        System.out.println(SUM);

        ////////////////////////////////////////////// Question 13

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int fac = N;
//        if (N>0) {
//            for (int i = N; i > 0; i--) {
//                if (i > 1) {
//                    fac = (fac * (i - 1));
//                }
//            }
//            System.out.println(fac);
//        } else if (N == 0){
//            System.out.println(1);
//        } else {
//            System.out.println("Invalid value");
//        }

        ////////////////////////////////////////////// Question 14

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int i;
//        for(i=0; i<=N; i++){
//            if (i%2 != 0){
//                System.out.println(i);
//            }
//        }

        ////////////////////////////////////////////// Question 15

//        Scanner sc = new Scanner(System.in);
//        int firstNum = sc.nextInt();
//        int secondNum = sc.nextInt();
//        int thirdNum = sc.nextInt();
//        if (firstNum>secondNum){
//            if (firstNum>thirdNum){
//                System.out.println(firstNum);
//            } else {
//                System.out.println(thirdNum);
//            }
//        } else if (secondNum>thirdNum){
//            System.out.println(secondNum);
//        } else {
//            System.out.println(thirdNum);
//        }

        ////////////////////////////////////////////// Question 16 No Idea

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        if (N>0){
//
//        }

        ////////////////////////////////////////////// Question 17

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i=0; i<=6; i++){
//
//        }

        ////////////////////////////////////////////// Question 18

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i=1; i<=N; i++){
//            if ((i%3==0)&&(i%5==0)){
//                System.out.println("FizzBuzz");
//            } else if (i%5==0){
//                System.out.println("Buzz");
//            } else if (i%3==0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        ////////////////////////////////////////////// Question 19

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int count = 0;
//        for(int i=1; i<=N; i++){
//            if (i%3==0){
//                count = count + 1;
//            }
//        }
//        System.out.println(count);

        ////////////////////////////////////////////// Question 20

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int count;
//        for(int i=1; i<(N+1); i++){
//            if (i!=1) {
//                System.out.println(" ");
//            }
//            for(count=0; count<i; count++){
//                System.out.print("*");
//            }
//        }

        ////////////////////////////////////////////// Question 21

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i=1; i<=N; i++){
//            if (i%4!=0){
//                System.out.println(i);
//            }
//        }

        ////////////////////////////////////////////// Question 22

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int found = 0;
//        for (int i=1; i<=N; i++){
//            if(i%3==0&&i%7==0){
//                System.out.println(i);
//                found=1;
//                break;
//            }else {
//                if (found==1){
//                    System.out.println("-1");
//                }
//            }
//        }
//        if (found == 0){
//            System.out.println("-1");
//        }

        ////////////////////////////////////////////// Question 23

        ////////////////////////////////////////////// Question 24

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for(int i=0; i<=N; i++){
//            int num = sc.nextInt();
//            do {
//                if (num>0){
//
//                }
//            }while(true);
//        }

        ////////////////////////////////////////////// Question 25

        ////////////////////////////////////////////// Question 26

        ////////////////////////////////////////////// Question 27

//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if (year%4==0 && (year%100!=0 || year%400==0)){
//            System.out.println("LEAP");
//        } else {
//            System.out.println("NOT LEAP");
//        }

        ////////////////////////////////////////////// Question 28

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for(int i=1; i<=N; i++){
//            System.out.println("Line "+i+": Hello");
//        }

        ////////////////////////////////////////////// Question 29

        ////////////////////////////////////////////// Question 30

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int num;
//        int sum = 0;
//        for(int i=0; i<N; i++){
//            num = sc.nextInt();
//            sum= sum + num;
//        }
//        System.out.println(sum);

        ////////////////////////////////////////////// Question 31

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int found=0;
//        for(int i=1; i<=N; i++){
//           if(i%N==0){
//               if(i!=1&&i!=N){
//                   found=1;
//               }
//           }
//        }
//        if (found==1){
//            System.out.println("PRIME");
//        } else {
//            System.out.println("NOT PRIME");
//        }

        ////////////////////////////////////////////// Question 32
    }
}
