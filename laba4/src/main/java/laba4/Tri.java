package laba4;

public class Tri extends Figure {
    private int value;
    Tri(int value){
        this.value = value;
    }
    @Override
    public int Perimeter(){
        super.setName("треугольник");
        super.setStoron(3);
        int per=value*3;
        return per;
    }
    @Override
    public double Area(){
        double area = value*value*(Math.sqrt(3)/4);
        area=Math.round(area * 1000.0) / 1000.0;
        return area;
    }
}
