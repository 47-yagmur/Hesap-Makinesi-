package hesapmakinesi3;
import java.util.Scanner;

public class HesapMakinesi3 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayiyi gir: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("Ikinci sayiyi gir: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("Islem sec:");
        System.out.println("1- Toplama");
        System.out.println("2- Cikarma");
        System.out.println("3- Carpma");
        System.out.println("4- Bolme");

        int secim = scanner.nextInt();

        switch (secim) {

            case 1:
                System.out.println("Sonuc: " + (sayi1 + sayi2));
                break;

            case 2:
                System.out.println("Sonuc: " + (sayi1 - sayi2));
                break;

            case 3:
                System.out.println("Sonuc: " + (sayi1 * sayi2));
                break;

            case 4:
                if (sayi2 != 0) {
                    System.out.println("Sonuc: " + (sayi1 / sayi2));
                } else {
                    System.out.println("Sifira bolunemez!");
                }
                break;

            default:
                System.out.println("Hatali secim.");
        }

    }
}
    
    
