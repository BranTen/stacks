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
public class SearchableStack2 extends Stack
{
private Stack tempStack;
public SearchableStack2() {
tempStack = new Stack(); }
public boolean find(int value) {
int temp;
boolean found = false;
while (!isEmpty() && !found) {
temp = pop();
if (temp == value)
found = true;
tempStack.push(value);
}
while (!tempStack.isEmpty())
push(tempStack.pop());
return found;
}
}