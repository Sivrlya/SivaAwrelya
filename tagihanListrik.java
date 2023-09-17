import java.util.Scanner;

public class tagihanListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pemakaian listrik (Dalam kwh): ");
        double pemakaian = input.nextDouble();

        double tarif = 0;

        if(pemakaian <= 50){
            tarif = 100;
        }else if(pemakaian <= 150){
            tarif = 150;
        }else if(pemakaian <=250){
            tarif = 250;
        }else if(pemakaian <=300 ){
            tarif = 300;
        }
        double biayaPemakaian = pemakaian*tarif;
        double biayaTambahan = biayaPemakaian * 20 /100;
        double total = biayaPemakaian + 20/100;

        System.out.println("Total tagihan yang harus dibayar : Rp." +total);
}
}
