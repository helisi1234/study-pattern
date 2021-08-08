package designPrinciple.openClose;

public class JavaCourse implements ICourse{

    private int cId;
    private String cName;
    private double cPrice;

    public JavaCourse(int cId, String cName, double cPrice) {
        this.cId = cId;
        this.cName = cName;
        this.cPrice = cPrice;
    }

    public int getId() {
        return this.cId;
    }

    public String getName() {
        return this.cName;
    }

    public double getPrice() {
        return this.cPrice;
    }
}
