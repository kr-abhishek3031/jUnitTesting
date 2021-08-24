package Aug23;

public class Addition implements CheckActiveOperation {
    private boolean active;

    public Addition(boolean active) {
        this.active = active;
    }

    public int add(int a, int b){
        return a+b;
    }


    @Override
    public boolean isActive() {
        return this.active;
    }
}
