/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author Acer Nitro 5
 */
public class Segitiga extends ObjekGeometris{
    private int sisi1;
    private int sisi2;
    private int sisi3;
    
    Segitiga(){
        super();
        sisi1 = 1;
        sisi2 = 1;
        sisi3 = 1;
    }

    Segitiga(int sisi1, int sisi2, int sisi3) {
        super();
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    
    public int getSisi1(){
        return sisi1;
    }
    
    public int getSisi2(){
        return sisi2;
    }
    
    public int getSisi3(){
        return sisi3;
    }
    
    public double getPerimeter(){
        return sisi1 + sisi2 + sisi3;
    }
    
    public double getArea(){
         double sisi = getPerimeter() / 2;
         return Math.sqrt(sisi * (sisi - sisi1) * (sisi - sisi2) * (sisi - sisi3));
    }
    
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
    
}
