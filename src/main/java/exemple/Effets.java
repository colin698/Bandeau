/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author colin
 */
public abstract class Effets {

    public Bandeau bandeau;
    protected int rep;
    protected String mess;

    public Effets(int rep, Bandeau bandeau, String mess) {
        this.rep = rep;
        this.bandeau = bandeau;
        this.mess = mess;

    }

    public abstract void afficher();

}
