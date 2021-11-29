package com.Dinu.lab4;

import java.util.Stack;

public class Validator_parentheses {
    String expression;

    boolean Check(){
        Stack<String> parentheses= new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i)=='(') parentheses.push("(");
            if ((expression.charAt(i)==')')  &&  (!parentheses.empty()))
                    parentheses.pop();
                else
                    return false;

        }
        return parentheses.empty();
    }
}