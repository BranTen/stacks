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
public class SearchableStack extends Stack
{
private Stack tempStack;
public SearchableStack() {
tempStack = new Stack(); }
public boolean find(int value) {
int temp;
boolean found = false;
int i = 0;
while (i < top && !found)
{
if (elements[i] == value)
found = true;
else
i = i + 1;
}
while (!tempStack.isEmpty())
push(tempStack.pop());
return found;
}
}
