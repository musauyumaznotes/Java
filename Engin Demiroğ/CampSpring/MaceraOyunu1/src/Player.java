import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);


    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        GameCharacter[] characters = new GameCharacter[]{new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("----------------------------------");
        for (GameCharacter character : characters) {
            System.out.println("ID : " + character.getId() + "\t Karakter : " + character.getName() + "\t Hasar : " + character.getDamage() + "\t Sağlık : " + character.getHealth() + "\t Para : " + character.getMoney());
        }
        System.out.println("Lütfen bir karakter giriniz !");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter : "+this.charName + ", Hasar : "+this.getDamage() + ", Sağlık : "+this.getHealth() + ", Para : " +this.money);
    }
    public void selectLoc(){
        Location location;
        System.out.println("Bölgeler");
        System.out.println("1 - Güvenli Ev");
        System.out.println("2 - Mağaza");
        System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz :");
        int selectLoc = input.nextInt();
        switch (selectLoc){
            case 1:
                location = new SafeHouse(this);
                break;
            case 2:
                location = new ToolStore(this);
                break;
            default:
                location = new SafeHouse(this);
        }
        location.onLocation();
    }
    public void initPlayer(GameCharacter gameCharacter) {
        this.setMoney(gameCharacter.getMoney());
        this.setHealth(gameCharacter.getHealth());
        this.setDamage(gameCharacter.getDamage());
        this.setCharName(gameCharacter.getName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
