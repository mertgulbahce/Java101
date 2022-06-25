import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double urunTutari, toplamTutar, kdvTutar, kdvOran;
        boolean kdvDurumu;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Urun Tutarini Giriniz: ");
        urunTutari = scanner.nextDouble();

        kdvDurumu = (0 < urunTutari) && (1000 > urunTutari);
        kdvOran = kdvDurumu ? 0.18 : 0.08;

        kdvTutar = urunTutari * kdvOran;
        toplamTutar = urunTutari + kdvTutar;

        System.out.println("KDV'siz urun tutari: " + urunTutari);
        System.out.println("KDV Orani: " + kdvOran);
        System.out.println("KDV Tutari: " + kdvTutar);
        System.out.println("Toplam Odenecek Tutar: " + toplamTutar);

    }
}
