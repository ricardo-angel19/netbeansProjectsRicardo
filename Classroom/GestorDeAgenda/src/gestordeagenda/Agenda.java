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
public class Agenda implements Serializable{
    private static final int MAX= 100;
    private ItemAgenda[] elArray;
    private int num;
    
    public Agenda(){
        elArray = new ItemAgenda[MAX];
        num=0;
    }
        public void insertar(ItemAgenda ia){
       elArray[num]=ia;
       num++;
        }
        public String toString(){
            String res = "";
            for (int i = 0; i < 10; i++){
                res += elArray[i] + "\n";
                res += "====================";
            }
            return res;
            
        }
}
