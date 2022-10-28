
package modul4;

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[]args){
        int cari,b=0;
        boolean shipo = false;
        int [] data = new int[]{74,98,72,74,72,90,81,72};
        Scanner scan = new Scanner(System.in);
        System.out.println("Data aray:");
        System.out.println("74  98  72  74  72  90  81  72");
        System.out.print("Masukkan data yang ingin dicari: ");
        cari = scan.nextInt();
        for (int i=0; i<data.length; i++){
            if(cari==data[i]){
                shipo= true;
                b++;
            }
        }
        if (b>1){
            System.out.println("");
            System.out.println("");
            System.out.println("Data yang dicari ditemukan sebanyak "+b+" kali");            
        }if (b==0){
            System.out.println("");
            System.out.println("");
            System.out.println("Data tidak ditemukan");
        }
        
        
        
        
        
        
        
    }
    
}
