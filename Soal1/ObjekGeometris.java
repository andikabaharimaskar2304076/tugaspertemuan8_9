/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author Acer Nitro 5
 */
public class ObjekGeometris {
    private String warna = "hitam";
    private boolean terisi;

    ObjekGeometris() {
        warna = "hitam";
        terisi = false;
    }
    
    ObjekGeometris(String warna, boolean terisi){
        this.warna = warna;
        this.terisi = terisi;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public boolean getIsTerisi(){
        return terisi;
    }
    
    public void setTerisi(boolean terisi){
        this.terisi = terisi;
    }
    
}
