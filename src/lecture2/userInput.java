package lecture2;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println(" your age is " +age);
        sc.close(); //for garbage collection
    }

}
