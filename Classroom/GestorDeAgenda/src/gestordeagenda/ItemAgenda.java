/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeagenda;
import java.io.*;

/**
 *
 * @author Richard
 */
public class ItemAgenda implements Serializable{
    
    private String nom, tel;
    private int postal;
    
    public ItemAgenda(String n, String t, int p){
        this.nom=n;
        this.tel=t;
        this.postal=p;
    } public String toString(){
        return nom+ ": "+ tel +"("+ postal + ")";
    }
}
