package laba4;

public abstract class Figure {
    private String name; // ��� ������
    private int Storon ;
    public abstract int Perimeter(); // ����������� �������
    public abstract double Area();
    public String GetName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getStoron() {
        return Storon;
    }

    public void setStoron(int storon) {
        Storon = storon;
    }
}