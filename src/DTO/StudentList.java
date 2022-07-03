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
public class StudentList extends ArrayList<Students>{

    public StudentList() {
        super();
    }
    public boolean addStudent(Students st){
        return this.add(st);
    }
     void printWithSpaces(String message, int lengOfBlock){
        int lengOfMessage = message.length();
        System.out.print(message);
        for(int i=0; i<lengOfBlock-lengOfMessage; i++)
            System.out.print(' ');
    }
    public void displayAll(){
        System.out.println("===========   Students List   ===========");
        printWithSpaces("Student ID", 30);
        printWithSpaces("Student Name", 30);
        System.out.println();
        for(int i=0; i<80; i++)
            System.out.print('-');
        System.out.println();
        for (Students st : this) {
            printWithSpaces(st.sID, 30);
            printWithSpaces(st.sName, 30);
            System.out.println();
        }
    }
    public Students searchStudent(String sID){
        for (Students st : this) {
            if(st.sID==sID)return st;
        }return null;
    }
    public boolean removeStudent(String sID){
        Students st=searchStudent(sID);
        return this.remove(st);
    }
}
