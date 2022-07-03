/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author Doan
 */
public class VaccineList extends ArrayList<Vaccines>{

    public VaccineList() {
        super();
    }
    public boolean addVaccine(Vaccines vc){
        return this.add(vc);
    }
    public Vaccines searchVaccines(String vID){
        for (Vaccines vc : this) {
            if(vc.vID==vID)return vc;
        }return null;
    }
     void printWithSpaces(String message, int lengOfBlock){
        int lengOfMessage = message.length();
        System.out.print(message);
        for(int i=0; i<lengOfBlock-lengOfMessage; i++)
            System.out.print(' ');
    }
    public void displayAll(){
        System.out.println("===========   Vaccine List   ===========");
        printWithSpaces("Vaccine ID", 30);
        printWithSpaces("Vaccine Name", 30);
        System.out.println();
        for(int i=0; i<80; i++)
            System.out.print('-');
        System.out.println();
        for (Vaccines vc : this) {
            printWithSpaces(vc.vID, 30);
            printWithSpaces(vc.vName, 30);
            System.out.println();
        }
    }
    public boolean removeVaccine(String vID){
        Vaccines vc=this.searchVaccines(vID);
        return this.remove(vc);
    }
}
