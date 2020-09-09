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
public class StackDriver {
        public static void main(String[] args) {

    SearchableStack s = new SearchableStack();
    SearchableStack2 ps = new SearchableStack2();
            
    
    System.out.println(s.isEmpty());
    s.push(5);
        System.out.println(s.isEmpty());
s.pop();
        System.out.println(s.isEmpty());

            System.out.println(ps.isEmpty());
    ps.push(5);
        System.out.println(ps.isEmpty());
ps.pop();
        System.out.println(ps.isEmpty());


        }
}
