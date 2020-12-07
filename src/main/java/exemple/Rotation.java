/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author colin
 */
public class Rotation extends Effets {

    public Rotation(int rep, Bandeau bandeau, String mess) {
        super(rep, bandeau, mess);
    }

    public void afficher() {
        bandeau.setMessage(mess);
        for (int n = 0; n < this.rep; n++) {
            for (int i = 0; i <= 100; i++) {
                this.bandeau.setRotation(2 * Math.PI * i / 100);
                this.bandeau.sleep(100);
            }
        }

    }
}
