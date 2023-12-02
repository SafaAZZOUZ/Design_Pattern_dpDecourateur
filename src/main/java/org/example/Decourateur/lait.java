package org.example.Decourateur;

import org.example.Composants.Boisson;

public class lait extends Decourateur{
    public lait(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription()
    {
        return boisson.getDescription()+ " Au lait ";
    }
    @Override
    public double count(){
        return 0.2+ boisson.count();
    }
}
