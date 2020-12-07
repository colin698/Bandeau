/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author colin
 */
public class Clignoter extends Effets {

    public Clignoter(int rep, Bandeau bandeau, String mess) {
        super(rep, bandeau, mess);
    }

    public void afficher() {
        bandeau.setMessage(mess);
        for (int n = 0; n < this.rep; n++) {
            for (int i = 0; i < 60; i++) {
                if (i % 2 == 0) {
                    this.bandeau.setForeground(Color.white);
                    this.bandeau.sleep(100);
                }
                if ((i % 2) != 0) {
                    this.bandeau.setForeground(Color.black);
                    this.bandeau.sleep(100);

                }
            }
        }
    }
}
