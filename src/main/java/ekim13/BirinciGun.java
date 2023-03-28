package ekim13;
import java.util.Scanner;

public class BirinciGun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine();
        char ilkHarf = tamIsim.charAt(0);
        System.out.println(ilkHarf);
        char soyIsminIlkHarfi = tamIsim.split("")[1].charAt(0);

        System.out.println(soyIsminIlkHarfi);









    }

}
