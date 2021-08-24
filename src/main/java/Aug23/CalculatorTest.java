package Aug23;

public class CalculatorTest {

    public boolean checkIfOperationIsActive(){
        Calculator c = new Calculator();

        Addition a = c.add;
        CheckActiveOperation cao = new StubCheckActiveOperation();
        return cao.isActive();
    }

    public static void main(String[] args) {
        CalculatorTest c = new CalculatorTest();
        c.checkIfOperationIsActive();
    }
}
