import java.util.Random;
import java.util.Scanner;

public class SayiTahminEtmeOyunuOdevi {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object
        int tutulanSayi = rd.nextInt(0, 10);

        int tahmin ;
        do {

            System.out.println("Lutfen bir sayi giriniz");
            tahmin = klavye.nextInt();


            if (tahmin < tutulanSayi) {
                System.out.println("Girdiginiz sayi kucuk");
            } else if (tahmin > tutulanSayi) {
                System.out.println("Girdiginiz sayi buyuk");
            }
        }
            while(tahmin!=tutulanSayi);

            System.out.println("tebrikler,dogru sayi girdiniz.");

        }
}
