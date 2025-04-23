package shape;

public class Triangle extends Shape{
    Triangle(int dim1, int dim2){
        super(dim1,dim2);
    }
    @Override
    public double area(){
        return (0.5 * dim1 * dim2);
    }
}
