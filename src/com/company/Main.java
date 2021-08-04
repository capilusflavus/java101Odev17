package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = scanner.nextInt();
        int toplam=0;
        int a=0;
        for (int i =1; i<=sayi ; i++) {
            if (i%3==0 && i%4==0){
                a=a+1;
                toplam =toplam+i;

            }
        }
        
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması"+toplam/a);

    }
}
