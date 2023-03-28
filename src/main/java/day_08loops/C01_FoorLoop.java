package day_08loops;

public class C01_FoorLoop {

    //Kullanicidan baslangic , bitis ve artis miktarini alarak
    // aradaki tum sayilari aralarina virgul koyarak yazdirin
    public static void main(String[] args) {

        int baslangic = 10;
        int bitis = 50;
        int artisMikatri = 5;
        for (int i = baslangic; i <=bitis; i+=artisMikatri) {

            if (i <bitis) {
                System.out.print(i+",");

            }else {
                System.out.println(i);
            }

        }
    }
}
