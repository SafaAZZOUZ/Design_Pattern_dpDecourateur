package org.example.Decourateur;

import org.example.Composants.Boisson;

public abstract class Decourateur extends Boisson {
    protected Boisson boisson;

    public Decourateur(Boisson boisson){
        this.boisson=boisson;
    }
    public abstract String getDescription();

}
