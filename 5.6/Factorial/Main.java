import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static long factorialRecursive(long n){
        if(n == 0){
            return 1;
        }
        else{
            return n*factorialRecursive(n-1);
        }
    }

    public static long factorialIterative(long n){
        /*long product = 1;

        for(long i = 1; i <= n; i++){
            product *= i;
        }*/

        long product = n;

        for(Long i = n-1; i > 1; i--){
            product *= i;
        }

        return product;
    }
    public static void main(String[] args){
        long n = Long.parseLong(args[0]);

        System.out.println(factorialRecursive(n));
        System.out.println(factorialIterative(n));
    }
}