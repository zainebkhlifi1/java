package Exception;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author salma
 */
public class AddTable {
    public static void main(String[] args) {
        try {
            int[] array = new int[3];
            for (int i = 0; i < 4; ++i) {
                array[i] = i;
            }
            System.out.println(array);
        } catch (ArrayIndexOutOfBoundsException AI) {
            System.out.println("erreur de pointeur ");
        }
    }
}


