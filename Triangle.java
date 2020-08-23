package Lab;

public class Triangle extends Shape{
    private int base,height;

    public Triangle(String color,  int base,int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString(){
        return  "Triangle[height ="+height+ "base"+base+"]";
    }
    @Override
    public double getArea(){
        return  0.5*base*height;
    }
}
