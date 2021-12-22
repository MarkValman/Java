import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {

        ArrayList<String> havka = new ArrayList<String>();

        havka.add("hachapury");
        havka.add("lemon");
        havka.add("burger");

        havka.set(1, "sushi");
        havka.remove(2);
        // havka.clear();

        for(int i=0; i<havka.size(); i++) {
            System.out.println(havka.get(i));
        }

    }
}