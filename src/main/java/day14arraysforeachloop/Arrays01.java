package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
//        String str[] = new String[3];
//        str[0] = "Java";
//        str[1] = "did";
//        str[2] = "surprise you";
//        System.out.println(Arrays.toString(str));
//
//        String a[] = new String[2];
//
//        a[0] = "Omer";
//        a[1] = "faruk";
//        System.out.println(Arrays.toString(a));
//
//        String aile[] = {"Erogan","Esma","Omer","Saffet"};
//
//        for (String w :aile) {
//
//            if (w.equals("Esma")) {
//                System.out.print(w+ " ");
//
//                break;
//
//            }
//
//        }
        System.out.println();

        String aile1[] = {"Erogan","Esma","Omer","Saffet"};
        for(String w:aile1){

            if (w.equals("Omer")||w.equals("Saffet")) {
                continue;


            }
            System.out.println(w+ " ");

        }
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksin");
        int oSayi = input.nextInt();
        String oIsim[] = new String[oSayi];
        System.out.println("Girisi sonlandirmak icin Q harfine basiniz");

        for (int i = 1; i <oSayi ; i++) {
            System.out.println("Lutfen"+ i + ".ogrencinin ilk ismini giriniz");
            String stdO = input.next();
            if (stdO.equalsIgnoreCase("q")){
                break;

            }
            oIsim[i-1] = stdO;

        }
        System.out.println(Arrays.toString(oIsim));



    }
}













