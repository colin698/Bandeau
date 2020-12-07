/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author colin
 */
public class CreerScenario {

    private Bandeau bandeau;
    ArrayList<Effets> TousmesEffets = new ArrayList<Effets>();

    public CreerScenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void ajouterEffet(Effets mesEffets) {
        this.TousmesEffets.add(mesEffets);

    }

    public void afficherScenario() {
        for (Effets e : TousmesEffets) {
            e.afficher();
            bandeau.sleep(1000);
        }
        bandeau.close();
    }

}

