package Oops.Encapsulation;

class AccessModifiers
{
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class AM extends AccessModifiers
{
    void printData()
    {
        System.out.println(a);
        System.out.println(getB());
        System.out.println(c);
        System.out.println(d);
    }
}

public class Encaps {
    public static void main(String[] args) {
        AM obj = new AM();
        obj.printData();
    }
}
