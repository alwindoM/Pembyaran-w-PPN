import java.util.Scanner;

package ppn;

class PPN
{
    public static void main(String[]args) 
    {
        //Membuat input untuk user
        Scanner masuk = new Scanner(System.in);
        
        //Meminta Iput total bayaran
        System.out.print("Masukan total pembayaran\t\t :");
        double bayaran = masuk.nextDouble();
        
        //Mengihtung PPN 10%
        double ppn = bayaran * 0.10;
        
        //Menghitung setelah PPN
        double total = bayaran + ppn;
        
        //Meminta input total pembelian dari user
        System.out.println("Total pembayaranmu adalah\t\t :"+bayaran);
        System.out.println("Total bayaran setelah 10% PPN adalah\t :"+total);
        
        //Menutup scanner
        masuk.close();
    }
}
