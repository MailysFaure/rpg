package rpg_epsi;

public class jeu {

	public static void main(String[] args) {
		Joueur J1 = new Joueur();
		Joueur J2 = new Joueur();
		Joueur J3 = new Joueur();
	
		J1.init_joueur();
		J2.init_joueur();
		J3.init_joueur();
		
		for (int i = 0; i<1000; i++) {
			J1.attaquer(J2);
			if (i%3 == 0) {
				J3.soin(J2);
			}
		}
		for (int i = 0; i<1000; i++) {
			J1.soin(J2);
		}
		
	}
	
}
