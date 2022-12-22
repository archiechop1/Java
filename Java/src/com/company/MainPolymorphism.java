package com.company;

public class MainPolymorphism {
    public static void main(String[] args) {
        FigurePolymorphism[] arrayfigure =
                new FigurePolymorphism[]{new Triangle(), new Ellipse(), new Square()};

        for(int i=0; i< arrayfigure.length; i++){
            arrayfigure[i].draw();
        }
    }

}
