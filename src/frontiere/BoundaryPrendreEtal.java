package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if (!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("je suis desolé " + nomVendeur + " il faut etre du village .");
			
		}else {
			System.out.println("je vais me renseigner si il reste un etal");
			if (!controlPrendreEtal.resteEtals()) {
				System.out.println("desole tout est occuper");
			} else {
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		System.out.println("il reste un etal pour vous ");
		String produit ;
		produit = Clavier.entrerChaine("quel est votre produit ?");
		int nbproduit = 0;
		nbproduit = Clavier.entrerEntier("Quelle est le nb de produit ? ");
		int numeroEtal=0;
		numeroEtal=controlPrendreEtal.prendreEtal(nomVendeur, produit, nbproduit);
		
		
		if (numeroEtal!=-1) {
			System.out.println("le vendeur " + nomVendeur + " s'est installe a l'etal numero " + numeroEtal);
		}
	}
}
