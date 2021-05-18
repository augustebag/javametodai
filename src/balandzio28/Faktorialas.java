/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balandzio28;

/**
 *
 * @author auguste
 */
public class Faktorialas {
    
    public static long fakt(long sk) {
        if (sk < 0) {
            return -1;
        } 
        if (sk == 0) {
            return 1;
        }
        return sk * fakt(sk - 1);
    }
    
    public static void main(String[] args) {
        
        int sk = 7;
        int f = 1;
        
        for (int i = sk; i > 1; i--) {
            System.out.println(i + "x");
            f *= i;
        }
        System.out.print("l=");
        System.out.println(f);
        
        System.out.println(fakt(sk));
    }
}

