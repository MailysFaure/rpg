package rpg_epsi;

public class Joueur {
	 lvl lvl1 = new lvl();
	 Pdv Pdv1 = new Pdv();
	private int lvl;
	private int pv;



	public void init_joueur () {
		lvl1.init_lvl();
		Pdv1.init_pdv();
		System.out.println("init_lvl" + lvl1);
	}

	public void attaquer(Joueur joueur) {
		 int degats = lvl;
		 int damage = joueur.pv-degats;
		 if (joueur.pv > 0 && this.pv > 0) {
			 joueur.pv-=degats;
			 }
		 if (damage == 0) {
			 this.lvl++;
			 damage +=1000;
		 }
		 
		 System.out.println("etat lvl" + this.lvl);
		 System.out.println("etat vie" + joueur.pv);
	}


	public void soin(Joueur joueur) {
		 int soins = lvl;
		 int cap = 1000;
		 if ( 0 <joueur.pv && joueur.pv <cap && this.pv >0 ) {
				 joueur.pv += soins;
			 	System.out.println(joueur + " a maintenant "+ joueur.pv + "pv");
		 }
		 if(joueur.pv >cap-soins && joueur.pv <cap && this.pv >0) {		
			System.out.println("etat pv avant minisoin"+joueur.pv);
			int minisoin = cap-joueur.pv; 
			joueur.pv += minisoin;
			System.out.println("Le jouer a reçu minisoin "+minisoin +", "+"il a maintenant "+joueur.pv);

		 }  
	 }

	}
