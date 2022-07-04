package entities;

import static java.lang.Math.sqrt;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){

        return 2 * (width + height);
    }

    public double diagonal(){

        return (sqrt(width * width + height * height));
    }

}
