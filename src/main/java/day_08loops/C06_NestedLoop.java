package day_08loops;

import java.util.Arrays;

public class C06_NestedLoop {
    public static void main(String[] args) {

        int x [] = new int[7];
        System.out.println(Arrays.toString(x));
        x[0] = 20;
        x[1] = 18;
        x[2] = 12;
        x[3] = 16;
        x[4] = 12;
        x[5] = 14;
        x[6] = 13;

        System.out.println(Arrays.toString(x));
        System.out.println();
        System.out.println(x[5]);
        System.out.println();

        Arrays.sort(x);
        System.out.println(Arrays.toString(x));



        int ilk = x[0];
        int son =x[x.length-1];
        System.out.println(ilk+son);

        int sum = 0;

        for (int i = 0; i <x.length ; i++) {

            sum=sum+x[i];


        }
        System.out.println(sum);
        //2.YOL:
        int top = 0;
        int i=0;
        while (i<x.length){

            top=top+x[i];
            i++;
        }
        System.out.println(top);

        //3.YOL:
        int k= 0;
        int s = 0;
        do {
            s=s+x[k];
            k++;
        }while (k<x.length);
        System.out.println(s);

       //4.YOL:
        int t = 0;
        for (int w:x){

            t= t+w;
        }
        System.out.println(t);


        String y[] =new String[5];
        y[0] = "Ali";
        y[1] = "Tom";
        y[2] = "Veli";
        y[3] = "Kemal";
        y[4] = "Cem";
        int karakterSayilariToplami = 0;
        for (String w:y) {
            karakterSayilariToplami=karakterSayilariToplami+w.length();
            System.out.println(karakterSayilariToplami);
        }
        char ch[] = {'A','c','D','k','M'};

        for(char w:ch){
            if(w>='A'&&w<='Z'){
                System.out.print(w);

            }

        }






                }




    }











