package shape;
public class Sphere extends Shape {
    Sphere(int dim1){
        super(dim1);
    }
    @Override
    public double area(){
        return (4 * Math.PI * this.dim1 * this.dim1);
    }
}
