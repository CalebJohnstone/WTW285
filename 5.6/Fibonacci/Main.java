import java.util.*;

import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        //start at f0 and f1
        int f0 = Integer.parseInt(args[0]);
        int f1 = Integer.parseInt(args[1]);

        BigInteger a = BigInteger.valueOf(f0);
        BigInteger b = BigInteger.valueOf(f1);

        //up to F(n)
        int n = Integer.parseInt(args[2]);
        int index = 1;

        System.out.println("F(0): " + f0);
    
        while(index <= n){
            System.out.println("F(" + index++ + "): " + b);

            BigInteger temp = a;
            a = b;
            b = b.add(temp);
        }
    }
}