public class Rectangle {

    public double width;

    public double height;


    public double area(){
        return height * width;

    }


    public double perimeter(){
        return 2 * (height + width);


    }


    public double diagonal(){
        return Math.sqrt(width * width + height * height);



    }


}
