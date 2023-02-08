import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Journée {
    private Style styleMatin;
    private int nbSpectateursMatin;
    private Style styleSoir;
    private int nbSpectateursSoir;
    private ArrayList<Auteur> auteursMatin = new ArrayList<Auteur>();
    private List<Integer> scoresMatin = new ArrayList<Integer>();
    private ArrayList<Auteur> auteursSoir = new ArrayList<Auteur>();
    private List<Integer> scoresSoir = new ArrayList<Integer>();

    Journée(Style matin, Style soir){
        this.styleMatin = matin;
        this.styleSoir = soir;
    }

    Style getStyleMatin(){
        return this.styleMatin;
    }

    Style getStyleSoir(){
        return this.styleSoir;
    }

    int getSpectateursMatin(){
        return nbSpectateursMatin;
    }
 
    int getSpectateursSoir(){
        return this.nbSpectateursSoir;
    }

    void setNbSpectateursMatin(int nb){
        this.nbSpectateursMatin = nb;
    }

    void setNbSpectateursSoir(int nb){
        this.nbSpectateursSoir = nb;
    }

    static int alea(int mini, int maxi){
        return new Random().nextInt(maxi-mini+1) + mini;
    }

    void creeEpreuveMatin(){
        // Créer un style au hasard
        Style style = Style.values()[alea(1,3)];
        // Créer un nombre de spectateurs au hasard
        int nb = alea(150,2500);
        // Créer deux Auteurs au hasard
        int choix1 = alea(0,2);
        int choix2 = (choix1 + 1) % 3;
        Auteur auteur1 = Auteur.lesAuteurs().get(choix1);
        Auteur auteur2 = Auteur.lesAuteurs().get(choix2);
        auteursMatin.add(auteur1);
        auteursMatin.add(auteur2);
        int score1 = nb * auteur1.getQualitéStyle(style);
        int score2 = nb * auteur2.getQualitéStyle(style);
        scoresMatin.add(score1);
        scoresMatin.add(score2);
        System.out.println("Epreuve matin : ");
        System.out.println("Style : " + style);
        System.out.println("Auteur 1 :" + auteur1 + " Score : " + score1);
        System.out.println("Auteur 2 :" + auteur2 + " Score : " + score2);
    }

    void creeEpreuveSoir(){
        // Créer un style au hasard
        Style style = Style.values()[alea(1,3)];
        // Créer un nombre de spectateurs au hasard
        int nb = alea(325,7535);
        // Créer deux Auteurs au hasard
        int choix1 = alea(0,2);
        int choix2 = (choix1 + 1) % 3;
        Auteur auteur1 = Auteur.lesAuteurs().get(choix1);
        Auteur auteur2 = Auteur.lesAuteurs().get(choix2);
        auteursSoir.add(auteur1);
        auteursSoir.add(auteur2);
        int score1 = nb * auteur1.getQualitéStyle(style);
        int score2 = nb * auteur2.getQualitéStyle(style);
        scoresSoir.add(score1);
        scoresSoir.add(score2);
        System.out.println("Epreuve du soir : ");
        System.out.println("Style : " + style);
        System.out.println("Auteur 1 :" + auteur1 + " Score : " + score1);
        System.out.println("Auteur 2 :" + auteur2 + " Score : " + score2);
    }
}
