import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Task 1
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n/2==0) {
//            System.out.println("Eded cutdur");
//        }else {
//            System.out.println("Eded tekdir");
//        }

        //Task 2
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int x = 0;
//        for (int i = 0; i <= n; i++) {
//            x+=i;
//        }
//        System.out.println(x);

        //Task 3
//        int[] arr = {1,2,3,4};
//        int max=arr[0];
//        int min=arr[0];
//
//
//        for (int i = 0; i <arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (arr[i]< min){
//                min= arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

        //Task 5

//        Scanner scanner = new Scanner(System.in);
//        int fac = 1;
//        int x = scanner.nextInt();
//        for (int i = 1; i <=x ; i++) {
//            fac*=i;
//        }
//        System.out.println(fac);


        //Task 6
//        String word ="Salam";
//        String reverseword = "";
//        for (int i = word.length()-1; i >=0; i--) {
//            reverseword+=word[i];
//        }
//        System.out.println(reverseword);

        //Task 8

//        int[] arr = {5,7,8};
//        int sum =0;
//        for (int i = 0; i <arr.length ; i++) {
//            sum+=arr[i];
//        }
//        int average = sum/arr.length;
//        System.out.println(average);

        //Task 9
        for (int i = 1; i <50; i++) {
            if(i/3==0 && i/5==0){
                System.out.println("FizzBuzz");
            }
            if (i/3==0){
                System.out.println("Fizz");
            }
            if (i/5==0){
                System.out.println("Buzz");
            }

        }

    }
    //Task4
//    public static boolean Sade() {
//        int n = 6;
//        if (n < 2) return false;
//        if (n == 2) return false;
//        if (n % 2 == 0) return true;
//
//        for (int i = 3; i*i<=n ; i+=2) {
//            if (n%i==0) return  false;
//        }
//        return true;
//    }
}