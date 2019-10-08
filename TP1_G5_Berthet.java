import java.util.Scanner;

public class TP1_G5_Berthet { //la fonction ressort l'entier et le reel entré précédemment 
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int unEntier = scanner.nextInt();
		float unReel = scanner.nextFloat();
		System.out.println("J’ai recupere un entier: " + unEntier);
		System.out.println("J’ai aussi recupere un reel: " + unReel);
		
		
		System.out.println("\"Bonjour, quel est votre prénom ?\" ");
		scanner.nextLine();
		String prenom;
		prenom = scanner.nextLine();
		System.out.println("\"Bonjour, "+ prenom +"\"");
		division();
		}
// 5-Exercices

public static void somme() {
	System.out.println("Veuillez saisir le premier entier");
	Scanner scanner = new Scanner(System.in);
	int premierEntier = scanner.nextInt();
	System.out.println("Veuillez saisir le deuxieme entier");
	int deuxiemeEntier = scanner.nextInt();
	int somme = premierEntier + deuxiemeEntier;
	System.out.println("La somme de " + premierEntier+ " avec "+ deuxiemeEntier+ " est egal a "+ somme);
	scanner.close();
}	
	
public static void division() {
	System.out.println("Veuillez saisir le numérateur");
	Scanner scanner = new Scanner(System.in);
	int numerateur=scanner.nextInt();
	System.out.println("Veuillez saisir le denominateur");
	int denominateur=scanner.nextInt();
	int division = numerateur/denominateur;
	scanner.close();
	System.out.println("La division " + numerateur+ " sur "+ denominateur+ " est egal a "+ division);
}
//5.3
//1) 3 variables: la hauteur, largeur et profondeur
//2) Nombre réels, donc int
//3) Avec la fonction scanner
//4) hauteur*largeur*profondeur
//5) l'afficher a l'écran
//Questions: le problème principal du programme est le nombre de scanner ouvert, il est nécessaire de les refermer. 

public static void volume() {
	System.out.println("Veuillez saisir la hauteur, la profondeur et la largeur du pavé (l'ordre ne change pas le calcul");
	Scanner scanner = new Scanner(System.in);
	int hauteur=scanner.nextInt();
	int largeur=scanner.nextInt();
	int profondeur=scanner.nextInt();
	int volume= largeur*hauteur*profondeur;
	scanner.close();
	System.out.println("Le volume du cube est " + volume  );
}
 }
