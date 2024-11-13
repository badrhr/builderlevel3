package org.xproce;

import org.xproce.problem.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    Main(){
        //Book b =  new Book(1, "", "");
        Book.builder(1, "hguyg").title("").build();
    }
    public static void main(String[] args) {
        new Main();
    }
}