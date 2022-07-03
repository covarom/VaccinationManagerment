/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Doan
 */
public class vaccinations {
    Students st;
    Vaccines vc;
    String place1,place2;
    long date1,date2;

    public vaccinations(Students st, Vaccines vc, String place1, String place2, long date1, long date2) {
        this.st = st;
        this.vc = vc;
        this.place1 = place1;
        this.place2 = place2;
        this.date1 = date1;
        this.date2 = date2;
    }
    public vaccinations(){
        st=null;
        vc=null;
        place1=place2="";
        date1=date2=0;
    }
    public void input(){
        
    }
}
