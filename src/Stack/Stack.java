package Stack;

import java.util.Arrays;

public class Stack {
    int size;
    int[] array;
    int top;

    public static void main(String[] args) {
        Stack s1 = new Stack(7);
        s1.push(4);
        s1.push(5);
        s1.push(8);
        s1.push(21);
        System.out.println(Arrays.toString(s1.array));
        s1.pop();
        s1.pop();
        System.out.println(Arrays.toString(s1.array));
    }

    public Stack(int size){
        this.size = size;
        top = -1;
        array = new int[this.size];
    }

    void push(int value){
        if(top < size){
            array[++top] = value;
        }
        else
            System.out.println("Stack Full !");
    }

    int pop(){
        if(top > -1){
            array[top] = 0;
            return array[top--];
        }
        else {
            System.out.println("Stack Empty !");
            return -1;
        }
    }


}
