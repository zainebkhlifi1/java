package Exception;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class SuperHotel {
    static int x[];


    public void reserver() {

        x[0] = 1;
    }

    public static void main(String args[]) {
        try {

            SuperHotel s = new SuperHotel();
            s.reserver();
        }
        catch (NullPointerException Null){
            System.out.println("hhhhhhh");
        }
    }
}
