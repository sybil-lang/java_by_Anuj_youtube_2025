package lecture4;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        //print hello world  5 times
//        for(int i=0;i<=5;i++){
//            System.out.println("Hello world");
//        }

        //print the table of n
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number: ");
//
//        int n=sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " * " + i + " = " + (n * i));
//        }



        //sum of n natural number  for eg: 1+2+3+4+5=15
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum=sum+i;
//        }
//        System.out.println("Sum is "+sum);


        // studying while loop
//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            i++;
//        }

//        Scanner sc = new Scanner(System.in);
//        boolean hasLearnt = false;
//        while(!hasLearnt) {
//            System.out.println("Went to school, tried to learn");
//            System.out.println("Have you understood?");
//            hasLearnt = sc.nextBoolean();
//        }
//
//        System.out.println("yayy i am out of while loop");



        //do-while loop
//
//        int i=8;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while(i<=5);
//        System.out.println("out of the do-while loop");


        //break and continue statement
//         for (int i = 0; i <= 20; i += 2) {
//             System.out.println(i);
//             if(i >= 10) break;
//         }

//         for (int i = 0; i <= 20; i += 1) {
//             if(i == 2 || i == 8) continue;
//             if(i >= 15) break;
//             System.out.println("gave toffee to "+i);
//         }

//        int i=0;
//         while(i<=5){
//             System.out.println(i);
//             i++;
//             if(i==3)break;
//         }


        //Question : print 1,2,3,4,5 10 times

//         for (int count = 0; count < 10; count++) {
//             for (int i = 1; i < 6; i++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println("printed "+count);
//         }


        //pattern problem

        /*
        0
        0 1
        0 1 2
        0 1 2 3

        */
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


//        sc.close();



    }
}
