package balandzio28;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author auguste
 */
public class ND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ivesk menesio numeri:  ");
        int sk = sc.nextInt();
        
        switch (sk) {
            case 1, 2, 3:
                System.out.println("Pavasaris");
                break;
            case 4, 5, 6:
                System.out.println("Vasara");
                break;
            case 7, 8, 9:
                System.out.println("Ruduo");
                break;
            case 10, 11, 12:
                System.out.println("Ziema");
                break;
            default:
                System.out.println("Tokio sezono nera!");
        }
    }
}
