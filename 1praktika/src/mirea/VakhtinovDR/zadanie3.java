package mirea.VakhtinovDR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args){
        int[] numarray1;
        int[] numarray2;

        int arraylenght1;
        int arraylenght2;
        ArrayList<Integer> numarray3 = new ArrayList<>();

        System.out.println("input lenght of massive 1");
        Scanner scan = new Scanner(System.in);
        arraylenght1 = scan.nextInt();
        numarray1 = new int [arraylenght1];
        Random random = new Random();
        for (int i=0; i<numarray1.length; i++){
            numarray1[i] = random.nextInt(-100,100);
        }
        System.out.println(Arrays.toString(numarray1));
        System.out.println("input lenght of massive 2");
        arraylenght2 = scan.nextInt();
        numarray2 = new int [arraylenght2];
        for (int i=0; i<numarray2.length; i++){
            numarray2[i] = random.nextInt(-100,100);

        }
        System.out.println(Arrays.toString(numarray2));
        for(int i=0; i<numarray1.length;i++){
            for(int x=0; x<numarray2.length;x++){
                if(numarray1[i]==numarray2[x]){
                    numarray3.add(numarray2[x]);
                }
            }
        }

        System.out.println("Odinakovie chisla oboix massivov: ");
        System.out.println((numarray3));
    }
}
