
package gajipelanggan;
import java.util.Scanner;
public class Gajipelanggan {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       double gajiasas = 1100;
       double bonus;
       int pelanggan;
       
       System.out.print("Msukkan bilangan pelanggan:  ");
       pelanggan = input.nextInt();
       
       if( pelanggan>=40){
           bonus = 10000;
       }
       else if(pelanggan>=30 && pelanggan <=39 ){
           bonus = 8000;
       }
       else if(pelanggan>=20 && pelanggan <=29){
           bonus = 6000;
       }
       
       else if(pelanggan>=10 && pelanggan <=19){
           bonus = 4000;
           
       }
       
       else{
           bonus=2000;
       }
       
       double gaji = gajiasas + bonus;
       
       
       
       
       System.out.println("Bilangan pelanggan"+pelanggan);
       System.out.println("Jumlah gaji ialah:"+ gaji);
       
    }
    
}
