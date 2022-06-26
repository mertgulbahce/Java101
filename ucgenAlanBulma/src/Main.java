import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birinciKenar, ikinciKenar, ucuncuKenar;
        double alan, cevre, u;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Kenarin Uzunlugunu Giriniz: ");
        birinciKenar = scanner.nextInt();

        System.out.print("Ikinci Kenarin Uzunlugunu Giriniz: ");
        ikinciKenar = scanner.nextInt();

        System.out.print("Ucuncu Kenarin Uzunlugunu Giriniz: ");
        ucuncuKenar = scanner.nextInt();

        cevre = birinciKenar + ikinciKenar + ucuncuKenar;
        u = cevre / 2;
        alan = Math.sqrt(u * (u - birinciKenar) * (u - ikinciKenar) * (u - ucuncuKenar));

        System.out.println("Ucgenin Cevre Uzunlugu: " + cevre);
        System.out.println("Ucgenin Alani: " + alan);
    }
}
