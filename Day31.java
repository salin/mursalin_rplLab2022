package Ngoding100day;

public class Day31 {
public static void main(String[] args) {
        boolean hasil;

        hasil = (false && true) || (true || false);
        System.out.println("Hasil: " + hasil);

        hasil = !false && (false || true);
        System.out.println("Hasil: " + hasil);

        hasil = ((true && true) || (true || false)) && !true;
        System.out.println("Hasil: " + hasil);
    }
}    

