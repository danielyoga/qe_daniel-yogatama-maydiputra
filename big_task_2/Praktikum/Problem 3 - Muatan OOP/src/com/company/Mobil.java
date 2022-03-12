package com.company;

import java.util.ArrayList;

public class Mobil {
    private int kapasitas;
    private ArrayList<Hewan> Muatan = new ArrayList<Hewan>();

    Mobil (int inputKapasitas) {
        kapasitas = inputKapasitas;
    }

    public int MuatanSekarang() {
        int total = 0;
        for (int i = 0; i < Muatan.size()-1; i++) {
            total+= Muatan.get(i).getBeratBadan();
        }
        return total;
    }

    public void tambahMuatan(Hewan HewanTambahan) {
        if ( HewanTambahan.getBeratBadan() + MuatanSekarang() < kapasitas ) {
            Muatan.add(HewanTambahan);
            System.out.println("Hewan berhasil ditambahkan");
        } else {
            System.out.println("Hewannya keberatan");
        }
    }

}
