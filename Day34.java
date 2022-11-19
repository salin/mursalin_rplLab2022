package day100;
import java.util.Scanner;
public class Day34 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  double a,phi,r,t,V;
  a=0.3;
  phi=3.14;
  Scanner input=new Scanner(System.in);
  System.out.print("Masukkan jari-jari = ");
  r=input.nextInt();
  System.out.print("Masukkan tinggi = ");
  t=input.nextInt();
  V=a*phi*r*r*t;
  System.out.print("Volume kerucut = "+V);
  input.close();
 }

}    

