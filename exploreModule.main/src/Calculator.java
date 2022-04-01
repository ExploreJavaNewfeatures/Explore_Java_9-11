public class Calculator implements AddNum{
    @Override
    public Double Plus(Double a, Double b){
        return a+b;
    }
    @Override
    public Double Minus(Double a, Double b){
        return a-b;
    }
    @Override
    public Double Multiply(Double a, Double b){
        return a*b;
    }
    @Override
    public Double Divide(Double a, Double b){
        return a%b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.Plus(1.5,3.0));
    }
}
