package org.example;

import org.example.Composants.Boisson;
import org.example.Composants.Expresso;
import org.example.Composants.Sumatra;
import org.example.Decourateur.caramel;
import org.example.Decourateur.chocolat;
import org.example.Decourateur.lait;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.count());
        System.out.println("-------------------");
        boisson=new Expresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.count());
        System.out.println("-------------------");
        boisson =new chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.count());
        System.out.println("-------------------");
        boisson =new lait(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.count());
        System.out.println("-------------------");
        boisson=new caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.count());
        System.out.println("-------------------");

        Boisson b;
        b = new chocolat(new caramel(new chocolat(new lait(new Sumatra()))));
        System.out.println(b.getDescription());
        System.out.println(b.count());

        }

    }

