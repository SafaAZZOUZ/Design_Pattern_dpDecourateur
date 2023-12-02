package org.example.Decourateur;

import org.example.Composants.Boisson;

public class chocolat extends Decourateur{
    public chocolat(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription()
    {
        return boisson.getDescription()+ " Au chocolat ";
    }
    @Override
    public double count(){
        return 1.2+ boisson.count();
    }
}
