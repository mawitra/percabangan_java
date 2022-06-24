/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.io.IOException;

/**
 *
 * @author Acer
 */
public class SwitchName {
    
    public static void main (String args[]) { 
        char firstInitial = 'c';
        System.out.println("Masukkan huruf awal nama anda:"); 
        try {
            firstInitial = (char)System.in.read();
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        }

        switch (firstInitial) { 
            case 'a':
                System.out.println("Nama anda pasti Asep!"); 
            case 'b':
                System.out.println("Nama anda pasti Brodin!"); 
            case 'c':
                System.out.println("Nama anda pasti Cecep!"); 
            default:
                System.out.println("Nama anda tidak terkenal!");
        }
    }
}
