package lecture3;

import java.util.Scanner;

//https://www.youtube.com/watch?v=oTybGS6YTAo&list=PLUcsbZa0qzu18zPz3EatehQJ5K1jP4IO2&index=3
public class conditional_statement {

    public static void main(String[] args) {

        //1.If statement
//        int age=4;
//
//        if(age>=18){
//            System.out.println("you can vote");
//        }
//        else {
//            System.out.println("you cannot vote sorry :(");
//        }



        //2. If , else -if ,else statement

//        int day=5;
//
//        if(day==1){
//            System.out.println("Go to Home");
//        }
//        else if(day==2){
//            System.out.println("Go to village");
//        }
//
//        else if(day==3){
//            System.out.println("Go to party");
//        }
//
//        else{
//            System.out.println("Go to Office");
//        }




        //3.Nested if-else statement
        //Question : you are given three numbers , find the maximum number among them

//        int a=4;
//        int b=5;
//        int c=6;
//        if (a > b) {
//            System.out.println("a is bigger than b");
//            if (a > c) {
//                System.out.println("a is bigger than c");
//                System.out.println("a is largest: " + a);
//            } else {
//                System.out.println("c is bigger than a");
//                System.out.println("c is largest: " + c);
//            }
//        } else {
//            System.out.println("b is bigger than a");
//            if (b > c) {
//                System.out.println("b is bigger than c");
//                System.out.println("b is largest: " + b);
//            } else {
//                System.out.println("c is bigger than b");
//                System.out.println("c is largest: " + c);
//            }
//        }


        //using ternary operator
//        int x=10;
//        int y=20;
//        int max=0;
//        max=x>y?x:y;
//        System.out.println("value of max "+ max);




        //learning switch statement

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the day");
//        int day=sc.nextInt();
//
//        switch(day) {
//            case 1:
//                System.out.println("Today is Sunday");
//                break;
//            case 2:
//                System.out.println("Today is Monday");
//                break;
//            case 3:
//                System.out.println("Today is Tuesday");
//                break;
//            case 4:
//                System.out.println("Today is Wednesday");
//                break;
//            case 5:
//                System.out.println("Today is Thursday");
//                break;
//            case 6:
//                System.out.println("Today is Friday");
//                break;
//            case 7:
//                System.out.println("Today is Saturday");
//                break;
//            default:
//                System.out.println("Invalid day! Please enter 1 to 7.");
//        }
//
//        sc.close();


        //learning logical operator in if-else statement

        int time=21;

        if(time>=10 && time<=20){
            System.out.println("office is open");
        }
        else{
            System.out.println("office is closed");
        }

    }
}
