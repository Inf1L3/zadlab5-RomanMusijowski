package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Stack {
    int i=0;
    public int size = 0;

    public Stack(int size) {
        this.size = size;
    }

    int[] stack = new int[size];

    Scanner scanner = new Scanner(System.in);

    public void push(){
        int[] stack = new int[size];
        int elem = scanner.nextInt();
        if(i<size){
            stack[i]=elem;
            i++;
            System.out.println("Element dodany ");
        } else {
            System.out.println("Stos pelny ");
        }
    }

    public void pop(){
        if(i==0){
            System.out.println("Stos pusty ");
        } else {
            System.out.println(stack[i]);
            i--;
        }
    }

    public void showStack(){
        int k=i;
        if(i==0){
            System.out.println("Stos pusty ");
        } else {
            System.out.println("Stos ma "+(k+1)+" element ");
            for (k = i; k>=0; k--){
                System.out.println(stack[k]);
            }
        }
    }

    public void showSize(){
        System.out.println(size);
    }
}
