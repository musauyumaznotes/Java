import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void Start(){
        System.out.println("Macera Oyununa Hoşgeldiniz !");
        System.out.print("Lütfen bir isim giriniz : ");
        //String playerName = input.nextLine();

        Player player = new Player("PlayerName");
        System.out.println("Sayın "+player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz !! Burada yaşananların hepsi gerçek !");
        System.out.println("Lütfen oyuna başlamak için bir karakter seçiniz");
        player.selectChar();
        player.selectLoc();
    }
}
