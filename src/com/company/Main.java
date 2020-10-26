package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        List<Mahasiswa> list_mhs = new ArrayList<>();
        int n;
        System.out.print("Masukan jumlah data: ");
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(scan.next());
            mhs.setNama(scan.next());
            mhs.setIpk(scan.nextDouble());
            list_mhs.add(mhs);
        }

        Comparator<Mahasiswa> comparator = (o1, o2) -> {
            if (o1.getIpk() > o2.getIpk()) {
                return -1;
            }
            if (o1.getIpk() == o2.getIpk() &&  o1.getNim().compareTo(o2.getNim()) < 0) {
                return -1;
            }
            return 1;
        };

        list_mhs.sort(comparator);

        System.out.println();
        System.out.println("Hasil setelah disorting:");
        for (Mahasiswa mhsall:list_mhs) {
            System.out.println(mhsall.getNama());
        }
    }
}
