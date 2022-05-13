import java.util.Scanner;

public class SearchingChallenge {
    public static int SearchingChallenge(String str) {
        String[] degerler = str.split("");
        double toplam = 0;
        int sayac = 0;
        for (int i = 0; i < degerler.length; i++) {
            if (Character.isDigit(str.charAt(i))) {
                char karakter = str.charAt(i);
                toplam += Integer.parseInt(Character.toString(karakter));
            } else {
                sayac++;
            }
        }
        int sonuc = (int) Math.round(toplam / sayac);

        return sonuc;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }

}


