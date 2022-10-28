
package modul4;

public class LatihanPraktikum3 {
    public static void main (String[] args){
        int min = 0;
        int[] data = new int []{-21,90,82,190,-83,74};
        System.out.println("Data parda array");
        for(int i=0; i< data.length; i++){
            System.out.println(data[i]+"\t");
            if (data[i]<min){
                min = data[i];
            }
            
        }
        System.out.println("\n data terkecil dari array adalah "+ min);
    
      
    }
    
}
