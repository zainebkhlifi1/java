package Exception;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author salma
 */


public class AppelMethod {

    public void method1() {
        this.method2();
    }

    public void method2() {
        this.method1();
    }

    public static void main(String[] args) {
        try {

            AppelMethod appel = new AppelMethod();
            appel.method1();
        } catch (StackOverflowError SO) {
            System.out.println("StackOverflowError");
        }


    }
}
