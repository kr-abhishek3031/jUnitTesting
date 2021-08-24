package Aug23.mock;

public class Addition implements Implement{

    private boolean active;

    public void setActive(){
        this.active = true;
    }
    @Override
    public Number run(Number t1, Number t2) {
        double i = t1.doubleValue() + t2.doubleValue();
        return i;
    }

    @Override
    public boolean isActive() {
        return this.active;
    }

    public static void main(String[] args) {
        Addition a = new Addition();
        Number x = a.run(12, 12);
        System.out.println(x.doubleValue());

    }
}
