import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        //Epp 5.6 Q39 and Q40 are the same logic => same problem when abstracted
        //so combinations of taking stairs to get n stairs in total <=> combining blocks to make length equal n

        //to run: java Main <extra block lengths> n
        //have blocks of length 1 and 2 and 0+ extra blocks, eg: [4 7 8]
        //n: up to which term to calculate

        int[] blockSizes = new int[2+args.length-1];
        blockSizes[0] = 1;
        blockSizes[1] = 2;

        //read in the extra block sizes
        for(int i = 0; i < args.length-1; i++){
            blockSizes[2+i] = Integer.parseInt(args[i]);
        }

        //sort this array --> so strictly increasing
        Arrays.sort(blockSizes);

        System.out.println("t(1) = 1");
        System.out.println("t(2) = 2");

        List<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);

        int Tn = 2;

        //for each extra block length
        for(int i = 2; i < blockSizes.length; i++){
            //calculate each term value after the previous block size and before the current block size
            for(int j = blockSizes[i-1]; j < blockSizes[i]; j++){
                //calculate the current term by adding the terms using available blockSizes (the ones less than the current block size)
                Tn = 0;

                for(int k = 0; k < i; k++){
                    Tn += c.get(j-blockSizes[k]);
                }

                c.add(Tn);
                System.out.println("t(" + (j+1) + ") = " + ((j < blockSizes[i]-1) ? Tn : Tn+1));
            }

            //increase T(current block size) to account for the fact that the new block adds an extra combination
            c.set(c.size()-1, c.get(c.size()-1)+1);
        }

        //add terms after the largest block size up to term number n
        int n = Integer.parseInt(args[args.length-1]);

        //from term after largest block size to n
        for(int i = blockSizes[blockSizes.length-1]; i < n; i++){
            //calculate the value for each term using ALL of the block sizes --> now all can be used
            Tn = 0;

            for(int j = 0; j < blockSizes.length; j++){
                /*System.out.println("j = " + j);
                System.out.println("blockSizes[" + j + "] = " + blockSizes[j]);*/
                Tn += c.get(c.size()-blockSizes[j]);
            }

            c.add(Tn);
            c.remove(0);

            System.out.println("t(" + (i+1) + ") = " + Tn);
        }
    }
}