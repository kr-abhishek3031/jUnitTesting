package Aug23;

public class Calculator implements Subtraction{

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    public Addition add = new Addition(true);

    public boolean isactive() {
        return add.isActive();
    }


}
