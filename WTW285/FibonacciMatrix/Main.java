import java.util.*;

import java.awt.geom.Point2D;

import java.math.*;
import java.io.*;

public class Main {
    public static void incSwap(BigInteger[] row, int a, int b){
        BigInteger temp = row[a];
        row[a] = row[a].add(row[b]);
        row[b] = temp;
    }

    public static void main(String[] args){
        //Epp 5.7: Question 53

        /* Explicit Formula:

        [1 0]^n = [F(n+1) F(n)]     for each natural number n
        [0 1]     [F(n) F(n-1)]

        Then you use the explicit formula for the Fibonacci sequence: 1/sqrt(5)*( ((1+sqrt(5))/2)^n - ((1-sqrt(5))/2)^n ) and substitute n+1, n and n-1 for n

        In this code:
        
        The recurrence relation for the original Fibonacci sequence is used: F(n) := F(n-1) + F(n-2)

        */

        //calculate to the n-th power
        int n = Integer.parseInt(args[0]);

        if(n > 0){
            //matrix to hold the values in
            BigInteger[][] matrix = {{BigInteger.valueOf(1), BigInteger.valueOf(1)},
                               {BigInteger.valueOf(1), BigInteger.valueOf(0)}};

            for(int i = 1; i < n; i++){
                for(int j = 0; j < 2; j++){
                    incSwap(matrix[j], 0, 1);
                }
            }      
            
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 2; j++){
                    System.out.print(matrix[i][j] + " ");
                }                

                System.out.println();
            }
        }
        else{
            System.out.println("n must be a positive integer");
        }
    }
}