/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parktikum3.konversi_suhu;

/**
 *
 * @author 62859
 */
public class DemoKonversiSuhu {
   public static void main(String[] args) {
        
        KonversiSuhu2 ks = new KonversiSuhu2();
        ks.setSuhuCelcius(30);

        System.out.println(" dalam Fahrenheit: " + ks.celciusToFahrenheit());
        System.out.println(" dalam Reamur: " + ks.celciusToReamur());
        int fahrenheitInput = 25;
        System.out.println(" dalam Reamur: " + ks.fahrenheitToReamur(fahrenheitInput));
    }
    
    
}
