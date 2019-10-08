/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1.pkg5;
import java.util.Scanner;
/**
 *
 * @author sverdecadilla
 */
public class Boletin15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas millas quieres pasar a metros?");
        float millas = sc.nextFloat();
        System.out.println("Son "+millas*1852+" metros");        
    
}