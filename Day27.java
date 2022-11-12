package Ngoding100day;
import java.util.Scanner;
public class Day27 {
    public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
    
    int jumlah_deret,i;
     
    System.out.print("Masukkan Jumlah Deret : ");
    jumlah_deret = input.nextInt();

    for (i=0; i <= jumlah_deret; i++) {
      System.out.print(1+i + " ");
    }
        System.out.println("");
  }
}
