
package otoparkkayituygulamasi;

import java.util.Scanner;


public class OtoParkKayitUygulamasi {

  
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
BagliListe liste =new BagliListe();
int seçim =-1;
  while(seçim!=0)   
  {
      System.out.println("1- otoparka arac girisi");
        System.out.println("2- otoparktan arac cikisi");
          System.out.println("3- araclari listele");
         System.out.println("4- toplam gelir (TL)");
        System.out.println("-0 cik");
  
      System.out.println("seciminiz: ");
      seçim=scan.nextInt();
      
       switch (seçim){
                case 1:liste.ekle();break;
                case 2:liste.sil();break;
                case 3:liste.yazdir();break;
                case 4:System.out.println("toplam ucret : " +liste.toplamUcret);break;
                case 0:System.out.println("cikis yaptiniz");;break;
                default:System.out.println("hatalı secim 0-4 arasi bir numara secin lutfen");break;
                
            }
            
    }
    
    }}
