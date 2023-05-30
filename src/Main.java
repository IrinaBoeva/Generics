
public class Main {
    public static void main(String[] args) {

        MagicBox<String> stringMagicBox = new MagicBox<String>(5);

        stringMagicBox.add("27");
        stringMagicBox.add("worlds");
        stringMagicBox.add("book");
        stringMagicBox.add("cats");
        stringMagicBox.add("mood");

        String pick = stringMagicBox.pick();
        System.out.println(pick);
    }
}