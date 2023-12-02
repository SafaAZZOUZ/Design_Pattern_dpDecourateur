package org.example.Composants;

import org.example.Composants.Boisson;

public class Sumatra extends Boisson {

    public  Sumatra(){
        description="Sumatra";
    }

    @Override
    public double count() {
        return 6;
    }
}
