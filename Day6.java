package Ngoding100day;
import java.util.Scanner;
public class Day6 {
    public static void main(String[] args) {
        String nama,alamat;
        int umur;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama   : ");
        nama = sc.nextLine();
        System.out.print("Alamat : ");
        alamat = sc.nextLine();
        System.out.print("Umur   : ");
        umur = sc.nextInt();
        
        System.out.println("Nama    : "+nama);
        System.out.println("Alamat  : "+alamat);
        System.out.println("Umur    : "+umur+"tahun");
        
    }
    
}
