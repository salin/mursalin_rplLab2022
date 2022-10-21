package Ngoding100day;
import java.util.Scanner;
public class Day5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilai;
        String nama;
        //input 
        System.out.print("Nama :");
        nama = scan.nextLine();
        System.out.print("Nilai :");
        nilai = scan.nextInt();
        
        //kondisi
        if (nilai >= 70) {
            System.out.println("Selamat anda lulus");
        }else{
            System.out.println("Maaf anda tinggal kelas");
        }
    }
    
}
