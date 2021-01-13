import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        //Epp Exercise Set 5.6 (22 and 23)
        int initialPairs = Integer.parseInt(args[0]);
        int monthsToBeFertile = Integer.parseInt(args[1]);
        int offSpringRate = Integer.parseInt(args[2]);

        int numberOfTerms = Integer.parseInt(args[3]);

        Queue<Integer> r = new LinkedList<Integer>();

        //only one pair of rabbits while they are not fertile yet
        for(int i = 0; i <= monthsToBeFertile; i++){
            r.add(initialPairs);
            System.out.println("r(" + i + "): " + initialPairs);
        }

        int previousTerm = 1;

        //compute the terms after this
        for(int i = monthsToBeFertile+1; i <= numberOfTerms; i++){
            int currentTerm = previousTerm + offSpringRate*(r.remove());

            r.add(currentTerm);
            System.out.println("r(" + i + "): " + currentTerm);

            previousTerm = currentTerm;
        }
    }
}