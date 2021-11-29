package com.Dinu.lab7;

public class Main {
    public static void main(String[] args) {

        Figure Circle = new Figure() {
            final double rad = 16;
            public String getName(){
                return "Circle";
            }

            public double getPerimeter(){
                return 2 * (Math.PI) * rad;
            }

            public double getArea() {
                return (Math.PI) * rad * rad;
            }
        };

        Square square = new Square (9);
        Rectangle rectangle = new Rectangle (5,2);
        Triangle triangle = new Triangle (6,5,6);

        Figure[] list = new Figure[4];
        list[0] = square;
        list[1] = rectangle;
        list[2] = triangle;
        list[3]=Circle;


        System.out.println("Task 2" +"\n");
        System.out.println(list[0].getName() + "| " + "Area = "+ list[0].getArea() + " Perimeter = "+ list[0].getPerimeter() + "\n" +
                list[1].getName()+ "| " + "Area = " + list[1].getArea() + " Perimeter =  "+ list[1].getPerimeter() + "\n" +
                list[2].getName()+ "| " + "Area = " + list[2].getArea() + " Perimeter =  "+ list[2].getPerimeter() + "\n");

        System.out.println("Task 2" +"\n");
        FigureController Controller = new FigureController();
        System.out.println("Biggest area is of "+ Controller.biggestArea(list).getName() + " with " + Controller.biggestArea(list).getArea() + "\n" +
                "Biggest perimeter is of "+ Controller.biggestPerimeter(list).getName()+" with " + Controller.biggestPerimeter(list).getPerimeter() + "\n" + "\n");


        System.out.println("Task 3" +"\n");
        System.out.println(list[3].getName()+ "|" + "Area = " + list[3].getArea()+" Perimeter =  "+ list[3].getPerimeter() + "\n");

        System.out.println("Task 3" +"\n");
        System.out.println("Biggest AREA: "+ Controller.biggestArea(list).getName() + " with AREA: " + Controller.biggestArea(list).getArea() + "\n" +
                "Biggest PERIMETER: "+ Controller.biggestPerimeter(list).getName()+" with PERIMETER: " + Controller.biggestPerimeter(list).getPerimeter());
    }
}