package HarmonikSayilar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n, toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = scan.nextDouble();

        for (double i = 1;i <= n;i++){
            toplam += (1/i);
        }
        System.out.println(toplam);
    }
}
