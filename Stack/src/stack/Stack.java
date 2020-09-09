/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Brandon
 */
public class Stack {
protected int top;
protected int[] elements;

public Stack() {
elements = new int[10];
top = -1;
}

public boolean isEmpty() {
return top == -1; }

public void push(int item) {
top = top + 1;
elements[top] = item; }

public int pop() {
int sav_item = elements[top];
top = top - 1;
return elements[top--]; }
}

