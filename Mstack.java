package com.asignment2;

import java.util.Stack;
//1
public class Mstack {

    public Stack<Integer> sorting(Stack<Integer> original) {
    
        Stack<Integer> tStack = new Stack<>();

        while(!original.isEmpty()) {
          
            int x = original.pop();

 
            while(!Stack.isEmpty() && tStack.peek() > x) {
                
                original.push(tStack.pop());
            }

            tStack.push(x);
        }
        return tStack;
    }

    public static void main(String args[]) {

        Main s = new Main();
        Stack<Integer> Ostack = new Stack<>();
        Ostack.add(72);
        Ostack.add(10);
        Ostack.add(55);
        Ostack.add(31);
        Ostack.add(23);
        Ostack.add(234);
        System.out.println("Original Stack: " + Ostack);
        Stack<Integer> sortedStack= s.sorting(Ostack);
        System.out.println("Sorted Stack is:" + sortedStack);
    }
}