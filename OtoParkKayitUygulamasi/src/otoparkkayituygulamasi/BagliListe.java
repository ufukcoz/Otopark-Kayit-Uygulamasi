
package otoparkkayituygulamasi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BagliListe {
   Scanner scan=new Scanner(System.in);
   Node head=null;
   Node tail=null;
   
    String plaka;
    String giriş;
    String cıkış;
    long dakika;
    double ücret;   
    Node temp=head;
    Node temp2=temp;
    double toplamUcret=0;
    
    void ücretHesapla(Node temp3,String çıkış2) throws ParseException{
        giriş=temp3.giriş;
         SimpleDateFormat s=new SimpleDateFormat("HH:mm");
         Date d1,d2;
         d1=s.parse(giriş);
         d2=s.parse(çıkış2);
         dakika=d2.getTime()-d1.getTime();
         dakika=dakika/60000;
         ücret=dakika/4;
         System.out.println("dakika: "+dakika);
         System.out.println("UCRET : "+ ücret);
         toplamUcret+=ücret;
    
         
    }
    
    void ekle(){
        System.out.print(" plaka :");plaka=scan.next();
        System.out.print(" giris (ss:dd) ");giriş=scan.next();
        Node arac=new Node(plaka,giriş);
         if (head==null){
            head=arac;
            tail=arac;
            head.next=tail;
            tail.prev=head;
            tail.next=head;
            head.prev=tail;
             System.out.println("arac otoparka girdi");
        }else{
            arac.next=head;
            head.prev=arac;
            head=arac;
            tail.next=head;
            head.prev=tail;
             System.out.println("arac otoparka girdi");
        }
    }
    void sil(){
      if (head==null){
          System.out.println("otopark bos");
      }  else{
           System.out.print(" plaka :");plaka=scan.next();
        System.out.print(" cikis (ss:dd) ");cıkış=scan.next();
        if (head==tail&&head.plaka.equals(plaka)){
               try {
                   ücretHesapla(head,cıkış);
               } catch (ParseException ex) {
               }
            head=null;
            tail=null;
            System.out.println("arac cikis yapti");
        }
        else if(head!=tail&&head.plaka.equals(plaka)){
            try {
                   ücretHesapla(head,cıkış);
               } catch (ParseException ex) {
               }
            head=head.next;
            head.prev=tail;
            tail.next=head;
            System.out.println("arac cikis yapti");
            
        }
        else{
            temp=head;
            while(temp!=tail){
                if(temp.plaka.equals(plaka)){
                     try {
                   ücretHesapla(temp,cıkış);
               } catch (ParseException ex) {
               }
                     temp2.next=temp.next;
                     temp.next.prev=temp2;
                     System.out.println("arac cikis yapti ");
                     
                }
                temp2=temp;
                temp=temp.next;
            }
            if(temp.plaka.equals(plaka)){
                     try {
                   ücretHesapla(temp,cıkış);
               } catch (ParseException ex) {
               }
                    tail=temp2;
                    tail.next=head;
                    head.prev=tail;
                     System.out.println("arac cikis yapti ");
                     
                }
        }
      }
      
    }
    void yazdir(){
         if(head==null){
            System.out.println("otoparkta arac yok");
        }
        else{
             
            System.out.println("plaka\t\tgiris saat");
            temp=head;
            while(temp!=tail){
                System.out.println(temp.plaka+"\t\t"+temp.giriş);
                temp=temp.next;
            }
            System.out.println(temp.plaka+"\t\t"+temp.giriş+"\n");
        }
    }
    }
        
    

