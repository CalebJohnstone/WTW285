import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        //Epp 5.6 Q: 17, 18
        int n = Integer.parseInt(args[0]);

        //original Towers of Hanoi sequence (Q11)
        int m = 1;
        
        //sequence a --> restriction: move to adjancent pole
        int a = 1;//edit sequence

        //sequence b --> move from pole A to pole B
        int b = 1;

        //calculate the values for the terms up to n
        for(int i = 1; i <= n; i++){
            System.out.print("m(" + i + ") = " + m);
            System.out.print(", a(" + i + ") = " + a);
            System.out.println(", b(" + i + ") = " + b);

            //m(k) := 2*m(k-1)+1 <-- recurrence relation |||| explicit formula: 2^k - 1 (general form of Mersenne Prime candidates)
            m = 2*m+1;

            //b(k) := b(k-1)+a(k-1)+1 <-- recurrence relation --> alternative: b(k) := 3*b(k-1)+1
            b += a+1;

            //a(k) := 3*a(k-1)+2 <-- recurrence relation
            //a = 3*a+2;
            a += (int) Math.pow(2, i+1);
            //a += 3*(i+1)+1;
            //a *= 2;
        }
    }
}