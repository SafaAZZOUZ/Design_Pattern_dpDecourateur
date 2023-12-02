package org.example.Decourateur;

import org.example.Composants.Boisson;

public class caramel extends Decourateur{
    public caramel(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription()
    {
        return boisson.getDescription()+ " Au caramel ";
    }
    @Override
    public double count(){
        return 2.2 + boisson.count();
    }
}
