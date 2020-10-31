package pbo02.pkg10116374.latihan19.saldo;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan Proses perhitungan Saldo Tabungan
 *
 */
public class PBO0210116374Latihan19Saldo {
    public static void saldoTabungan( double bunga,double saldoAwal, int lama){
        double saldoAkhir, bungabulan;
        
        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        bungabulan = bunga/100;
        
        for (int i = 1; i <= lama; i++) {
            saldoAkhir = (saldoAwal * 0.15) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoAkhir));
            saldoAwal = saldoAkhir;
        }
    }

   public static void main(String[] args) {
        // TODO code application logic here
       double saldoAwal, bunga;
        int lama;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan saldo awal : ");
        saldoAwal = keyboard.nextDouble();
        
        System.out.print("Masukkan bunga/bulan(15%) : ");
        bunga = keyboard.nextInt();
        
        System.out.print("Masukkan lama bulan (6) : ");
        lama = keyboard.nextInt();
        
        System.out.println("");
        saldoTabungan(saldoAwal, bunga, lama);
    }
    
}
