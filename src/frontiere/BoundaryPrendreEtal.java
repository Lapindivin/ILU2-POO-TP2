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
		//TODO a completer
		if (!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			
		}else {
			if (!controlPrendreEtal.resteEtals()) {
				
			} else {
				if (numeroEtal!=-1) {
					
				}

			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
