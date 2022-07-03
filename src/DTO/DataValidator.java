/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Doan
 */
public class DataValidator {
     boolean continueYesOrNo(String message){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print(message);
            String stringInput = scanner.nextLine();
            if("Y".equals(stringInput))
                return true;
            if("N".equals(stringInput))
                return false;
            System.err.println("Wrong input! Try again, please!");
        }
    }
      public boolean isStudentid(String id){
        String pattern ="^[A-Z]{2}[0-9]{6}$";
        return id.matches(pattern);
    }
       public String inputString(){
        Scanner sc=new Scanner(System.in);
        String a;
        while(true){
            try{
                sc = new Scanner(System.in);
                a=sc.nextLine().trim();
                if(a!=""){
                    break;
                }
            }catch(Exception e){
                System.out.println("Input again: ");
            }
        }
        return a;
    }
       public  int inputFrom(int min,int max){
        int a=0;
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                sc = new Scanner(System.in);
                a=Integer.parseInt(sc.nextLine());
                if(a>=min&&a<=max){
                    break;
                }else{
                    System.out.println("Input number from "+min+"to "+ max);
                }
            }catch(Exception e){
                System.out.println("Invalid number, please input again: ");
            }
        }
        return a;
    }
       public boolean isVaccineID(String vID){
           String pattern ="^[Covid-V][0-0]{3}$";
        return vID.matches(pattern);
       }
        public long toDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        Scanner sc=new Scanner(System.in);
        while(true){
        try{
            sc = new Scanner(System.in);
            date=sdf.parse(sc.nextLine().trim());
            break;
        }catch(Exception e){
            System.out.println("Input again: ");
        }
         }
        StringTokenizer stk= new StringTokenizer(sdf.format(date), "-");
        sc = new Scanner(System.in);
        int y=Integer.parseInt(stk.nextToken());
        sc = new Scanner(System.in);
        int m=Integer.parseInt(stk.nextToken());
        sc = new Scanner(System.in);
        int d=Integer.parseInt(stk.nextToken());
        Calendar cal= Calendar.getInstance();
        cal.set(y,m-1,d);
        long t=cal.getTime().getTime();
        return t;
    }
         public boolean checkDate1(long dateInput){
        Date now = new Date();
        Date d=new Date(dateInput+(24*60*60*1000*28));
        if(d.compareTo(now)==-1)return true;
        return false;
    }
         
}
