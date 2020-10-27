package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //1
        Clothing clothing = new Clothing();
        clothing.setType(JOptionPane.showInputDialog("Type the type of clothing: "));
        clothing.setMaterial(JOptionPane.showInputDialog("Type the material of clothing: "));
        clothing.setRecomandation(Boolean.valueOf(JOptionPane.showInputDialog("Do you recommend it ?(true/false):  ")));
        clothing.setAmount(Integer.parseInt(JOptionPane.showInputDialog("Type the amount of the clothes: ")));
        clothing.setPrice(Float.valueOf(JOptionPane.showInputDialog("Type the price for one")));
        JOptionPane.showMessageDialog(null,"Type: "+ clothing.getType() +
                "\nMaterial: " + clothing.getMaterial() +
                "\nRecomandation: " + clothing.getRecomandation() +
                "\nAmount: " + clothing.getAmount() +
                "\nPrice: " + clothing.getPrice());
        //2
        int x = Integer.parseInt(JOptionPane.showInputDialog("Type number of clothes: "));
        Clothing [] clothes = new Clothing[x];

        for (int i = 0; i < x ; i++) {
            clothes[i] = new Clothing();
            JOptionPane.showMessageDialog(null,"Clothing #"+(i+1));
            clothes[i].setType(JOptionPane.showInputDialog("Type the type of clothing: "));
            clothes[i].setMaterial(JOptionPane.showInputDialog("Type the material of clothing: "));
            clothes[i].setRecomandation(Boolean.valueOf(JOptionPane.showInputDialog("Do you recommend it ?(true/false):  ")));
            clothes[i].setAmount(Integer.valueOf(JOptionPane.showInputDialog("Type the amount of the clothes: ")));
            clothes[i].setPrice(Float.valueOf(JOptionPane.showInputDialog("Type the price for one")));
        }

        JOptionPane.showMessageDialog(null,"The clothes are:");
        for (int i = 0; i < x ; i++) {
            JOptionPane.showMessageDialog(null,clothes[i].toString());

        }
    }
}
