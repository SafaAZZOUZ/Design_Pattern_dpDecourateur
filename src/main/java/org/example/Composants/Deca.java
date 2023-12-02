package org.example.Composants;

import org.example.Composants.Boisson;

public class Deca extends Boisson {

    public Deca(){
        description="Deca";
    }

    @Override
    public double count() {
        return 8;
    }
}
