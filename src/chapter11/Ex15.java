package chapter11;

import java.util.Stack;

/**
 * Thinking in Java
 * TOOD
 * Created by gweibin on 2017/5/13.
 */
public class Ex15 {
    public static void main(String[] args) {
        Stack<Character> sc = new Stack<>();
        sc.push('U');
        sc.push('n');
        sc.push('c');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('e');
        sc.push('r');
        sc.push('t');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('a');
        System.out.print(sc.pop());
        sc.push('i');
        System.out.print(sc.pop());
        sc.push('n');
        sc.push('t');
        sc.push('y');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push(' ');
        System.out.print(sc.pop());
        sc.push('r');
        sc.push('u');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('l');
        sc.push('e');
        sc.push('s');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
    }
}
