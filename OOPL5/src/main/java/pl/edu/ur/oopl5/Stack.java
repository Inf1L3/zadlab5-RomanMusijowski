package pl.edu.ur.oopl5;
/*
@autor Roman
 */
import java.util.Scanner;

public class Stack {
    Scanner scanner = new Scanner(System.in);
    int size = 0;
    int[] stack ;
    int top=-1;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top=-1;
    }

    public void push(int elem){
        int i = ++top;
        if(i<size){
            stack[i]=elem;
            System.out.println("Element dodany ");
        } else {
            System.out.println("Stos pelny ");
        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stos pusty ");
            return 0;
        } else {
            return stack[top--];
        }
    }

    public void showStack(){
        int k=0;
        if(top==-1){
            System.out.println("Stos pusty ");
        } else {
            System.out.println("Stos ma "+(top+1)+" element ");
            for (k = top; k>=0; k--){
                System.out.println(stack[k]);
            }
        }
    }

    public void showSize(){
        System.out.println(size);
    }
}
