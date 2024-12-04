import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        char c = 'z';
        int valeur = 25;
        String s = "Chaine de caractères";
        double d = 32.25;
        StringBuilder sb = new StringBuilder();
        ArrayList maListe = new ArrayList();

        maListe.add(c);
        maListe.add(valeur);
        maListe.add(s);
        maListe.add(d);
        maListe.add(sb);

        System.out.println(maListe);

        for (int i = 0; i < 5; i++) {
            System.out.println(maListe.get(i).getClass());
        }

    }
}