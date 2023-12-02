package org.example.Composants;

public class Expresso extends Boisson {

    public Expresso(){
        description="Expresso";
    }

    @Override
    public double count() {
        return 12;
    }
}
