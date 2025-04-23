package shape;

public abstract class Shape {
    protected int dim1;
    protected int dim2;

//    Constructor
    Shape(int dim1, int dim2){
        if (dim1 < 0 || dim2 < 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative");
        }
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    Shape(int dim1){
        if (dim1 < 0) {
            throw new IllegalArgumentException("Dimension cannot be negative");
        }
        this.dim1 = dim1;
    }

    public abstract double area();


}
