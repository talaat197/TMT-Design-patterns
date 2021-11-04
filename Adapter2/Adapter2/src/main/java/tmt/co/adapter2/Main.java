/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tmt.co.adapter2;

/**
 *
 * @author talaat
 */
public class Main {
    public static void main(String[] args)
    {
        AndroidPhone android = new Oppo();
        AndroidCharger androidCharger = new AndroidCharger();
        
        androidCharger.Charge(android);
        
        IPhone iphone = new XPro();
        IPhoneCharger iphoneCharger = new IPhoneCharger();
        
        iphoneCharger.charge(iphone);
        
        AndroidToIphoneAdapter adapter = new AndroidToIphoneAdapter(android);
        
        iphoneCharger.charge(adapter);
    }
}
