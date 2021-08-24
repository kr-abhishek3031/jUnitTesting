package Aug23.mock;

public class Subtraction implements Implement{
    private boolean active;

    @Override
    public Number run(Number t1, Number t2) {
        double r = t1.doubleValue() - t2.doubleValue();
        return r;
    }

    @Override
    public boolean isActive() {
        return this.active;
    }
    public void setActive(){
        this.active = true;
    }
}
