package com.company;

public class Animals {

    private String Nama;
    private String JenisMakanan;
    private String Gigi;

    Animals(String namaInput, String jenisMakananInput, String gigiInput) {
        Nama = namaInput;
        JenisMakanan = jenisMakananInput;
        Gigi = gigiInput;
    }

    public String identify_myself() {
        return "Hi I'm Parent of All Animal, My Name is Binatang";
    }

    public String getNama() {
        return Nama;
    }

    public String getJenisMakanan() {
        return JenisMakanan;
    }

    public String getGigi() {
        return Gigi;
    }
}

class Herbivor extends Animals {
    Herbivor (String namaInput, String jenisInput, String gigiInput) {
        super(namaInput, jenisInput, gigiInput);
        if (!jenisInput.equals("Tumbuhan") || !gigiInput.equals("Tumpul")) {
            return;
        }
    }

    public String identify_myself() {
        return "Hi I'm Herbivore" + " , My Name is " + getNama() + ", My Food is '" + getJenisMakanan() +"', I have '" + getGigi() + "' teeth";
    }
}

class Carnivor extends Animals {
    Carnivor (String namaInput, String jenisInput, String gigiInput) {
        super(namaInput, jenisInput, gigiInput);
        if (!jenisInput.equals("Daging") || !gigiInput.equals("Tajam")) {
            return;
        }
    }
    public String identify_myself() {
        return "Hi I'm Carnivor" + " , My Name is " + getNama() + ", My Food is '" + getJenisMakanan() +"', I have '" + getGigi() + "' teeth";
    }
}

class Omnivor extends Animals {
    Omnivor (String namaInput, String jenisInput, String gigiInput) {
        super(namaInput, jenisInput, gigiInput);
    }
    public String identify_myself() {
        return "Hi I'm Omnivor" + " , My Name is " + getNama() + ", My Food is '" + getJenisMakanan() +"', I have '" + getGigi() + "' teeth";
    }
}