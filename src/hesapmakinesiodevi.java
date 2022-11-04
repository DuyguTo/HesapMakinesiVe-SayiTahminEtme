import java.util.Scanner;

public class hesapmakinesiodevi {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ilk sayi");
        int sayi1 = klavye.nextInt();

        System.out.println("ikinci sayi");
        int sayi2 = klavye.nextInt();

        int toplam = sayi1 + sayi2;
        System.out.println("toplam:" + toplam);

        int cikarma = sayi1 - sayi2;
        System.out.println("cikarma:" + cikarma);

        int carpma = sayi1*sayi2;
        System.out.println("carpma:" + carpma);

        int bolme = sayi1/sayi2;
        System.out.println("bolme" + bolme);

        int mod = sayi1%sayi2;
        System.out.println("mod:" + mod);


    }
}

