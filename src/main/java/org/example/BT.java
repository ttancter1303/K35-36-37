package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mang ");
        int n = sc.nextInt();
        int[] arrayInteger = new int[n];
        for (int i=0;i<arrayInteger.length;i++){
            System.out.println("Nhap phan tu thu "+(i+1)+" : ");
            arrayInteger[i] = sc.nextInt();
        }
        for (int i : arrayInteger) {
            System.out.println(i);
        }
        System.out.println("max : "+ Arrays.stream(arrayInteger).max());
        System.out.println("min : "+ Arrays.stream(arrayInteger).min());
        System.out.println("Tim so nguyen to : ");
        for (int i : arrayInteger) {
            if(timSoNguyenTo(i)){
                System.out.println(i+" la so nguyen to ");
            }
        }
        for (int i=1;i<arrayInteger.length;i++){
            int temp = arrayInteger[i];
            int j =i-1;
            while (j>=0&& arrayInteger[j]>temp){
                arrayInteger[j+1] = arrayInteger[j];
                j -=1;
            }
            arrayInteger[j+1] = temp;
        }
        System.out.println("sap xep mang theo thu tu tang dan");
        for (int i=0;i<arrayInteger.length;i++){
            System.out.println(arrayInteger[i]);
        }
    }
    public static boolean timSoNguyenTo(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
