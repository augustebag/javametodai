/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balandzio28;

import java.util.Scanner;

/**
 *
 * @author auguste
 */
public class Metodai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 sk:");
        int sk1 = sc.nextInt();
        System.out.println("2 sk:");
        int sk2 = sc.nextInt();
        System.out.println("3 sk:");
        int sk3 = sc.nextInt();
        System.out.println("4 sk:");
        int sk4 = sc.nextInt();
 
        int suma1 = skaiciuSuma(sk1, sk2);
        System.out.println(suma1);
        int suma2 = skaiciuSuma(sk3, sk4);
        System.out.println(suma2);
 
    }
 
    public static int skaiciuSuma(int s1, int s2) {
        if (s1 > s2) {
            int tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
        int suma = 0;
        for (int i = s1; i <= s2; i++) {
            suma += i;
        }
        return suma;
        
        // Programa leidzia vartotojui pasirinkti:
//
// 1. Akmuo
// 2. Popierius
// 3. Zirkles
// 0. Pabaiga
//
// Jei ne pabaiga:
// Kompiuteris atsitiktinai pasirenka
// palyginam ir parasom kas laimejo
//
// ir vel spausdinam meniu
// jei vartotojas pasirinko ne 0..3 - pavadinikit vartotjoa mulkiu ir vel meniu
//
// ****
// Programa paklausia kiek kartu reikia suzaist
//
// Kompiuteris zaidzia su savim
//
// Pabaigoj atsapausdinti statistika:
//
// comp1 laimejo: XXXX
// comp2 laimejo: XXXX
// lygiosios: XXXX
//
// comp1:
// pasirino akmeni: XX
// pasirinko popieriu: XX
// pasirinko zirkles: XX
//
// comp2:
// pasirino akmeni: XX
// pasirinko popieriu: XX
// pasirinko zirkles: XX
// ---------------------------

/*
package sample;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {

while (true) {
Scanner sc = new Scanner(System.in);
System.out.println("rinkis! 1 sulinys, 2 popierius, 3 zirkles, 0 exit");
int player = sc.nextInt();
if(player == 0){
break;
}
whoWon(player);
}
}

public static void whoWon(int player){
int kompoEjimas = (int) (Math.random() * 3 + 1);
switch(player) {
case 0:
break;
case 1:
tellWhoWon(player, kompoEjimas);
break;
case 2:
tellWhoWon(player, kompoEjimas);
break;
case 3:
tellWhoWon(player, kompoEjimas);
break;
default:
System.out.println("Alius sake kad tu mulkis");
}
}

public static void tellWhoWon(int sk1, int sk2){
if(sk1 == 1){
System.out.print(" zaidejas pasirinko sulini ");
}
if(sk1 == 2){
System.out.print(" zaidejas pasirinko popieriu ");
}
if(sk1 == 3){
System.out.print(" zaidejas pasirinko zirkles ");
}
if(sk2 == 1){
System.out.print(" kompas pasirinko sulini");
}
if(sk2 == 2){
System.out.print(" kompas pasirinko popieriu");
}
if(sk2 == 3){
System.out.print(" kompas pasirinko zirkles");
}
if(sk1 == sk2){
System.out.println(". zaidimas baigesi lygiosiomis.");
}
if(sk1 == 1 && sk2 == 3 || sk1 == 2 && sk2 == 1 || sk1 == 3 && sk2 == 2 ){
System.out.println(". zaidima laimejo zaidejas.");
}
if(sk1 == 1 && sk2 == 2 || sk1 == 2 && sk2 == 3 || sk1 == 3 && sk2 == 1 ){
System.out.println(". zaidima laimejo kompas.");
}
}
}
*/

/*
FIBONACI

public static void fib(long s1, long s2, long max) {
System.out.println(s1);
long next = s1 + s2;
if (next > max) {
System.out.println(s2);
} else { 
fib(s2, next, max);
}
}
*/
        
    }
}