
package otoparkkayituygulamasi;


public class Node {
    String plaka;
    String giriş;
    String cıkış;
    long dakika;
    double ücret;
    Node prev;
    Node next;

    public Node(String plaka, String giriş) {
        this.plaka = plaka;
        this.giriş = giriş;
        prev=null;
        next=null;
    }

    
    
}
