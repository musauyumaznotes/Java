package second;

import first.First;
//import first.*; first package'taki tüm sınıflar dahil edilir.

public class Second {
    public static void main(String[] args) {
        First b = new First("Kodluyoruz");
        System.out.println(b.str);
    }
}
