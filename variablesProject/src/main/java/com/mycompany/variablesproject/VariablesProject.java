package com.mycompany.variablesproject;

/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 * type name = value;
 */

public class VariablesProject {

    public static void main(String[] args) {
        int radiusValue = 7;
        double piValue = 3.14;
        double totalArea = radiusValue * piValue;
        String legendary = "Legendary";
        String unlegendary = "Unlegendary";
        boolean isLegendary = true;
        
        if(isLegendary){
            System.out.println(isLegendary + " It was " + legendary + "!");
        } else {
            System.out.println(unlegendary);
        }
        
        System.out.println(piValue + "*" + radiusValue + "^2 = " + totalArea);
    }
}
