/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tmt.co.adapter2;

/**
 *
 * @author talaat
 */
public class AndroidToIphoneAdapter implements IPhone{
    private AndroidPhone android;
    public AndroidToIphoneAdapter(AndroidPhone android)
    {
        this.android = android;
    }
    
    @Override
    public void charge() {
        System.out.println("Android is charging with IPhone charger");
        android.charge();
    }
    
}
