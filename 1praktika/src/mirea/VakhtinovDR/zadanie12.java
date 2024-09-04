package mirea.VakhtinovDR;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args){
        int[] numarray;
        int arraylenght;
        int numtofind;
        System.out.println("inpu lenght of massive");
        Scanner scan = new Scanner(System.in);
        arraylenght = scan.nextInt();
        numarray = new int [arraylenght];
        Random random = new Random();
        for (int i=0; i<numarray.length; i++){
            numarray[i] = random.nextInt(-100,100);

        }
        System.out.println(Arrays.toString(numarray));
        Arrays.sort(numarray);
        System.out.println(Arrays.toString(numarray));
        System.out.println("vvedite chislo dlya poiska");
        numtofind = scan.nextInt();
        methodpoiska(numtofind, numarray);


    }
    public static void methodpoiska(int numtofind, int[] numarray){
        int i = 0;


        int low = 0;
        int high = numarray.length;
        int middle;
        while (low<=high){
            middle = (low+high) / 2;
            int num=numarray[middle];
            if(num==numtofind){
                System.out.println("znachenie naydeno pod indexom" + middle);
                return;

            } else if (num>numtofind){
                high = middle-1;

            } else {
                low = middle +1;

            }
            System.out.println("iteration number:"+ i++);

        }
        System.out.println("this number is not in a massive");
    }
}
