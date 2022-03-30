package Java9;

public class CustomClass implements InterfaceWithPrivateMethod{
    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args){
        InterfaceWithPrivateMethod instance = new CustomClass();
        instance.method1();
        instance.method2();
        InterfaceWithPrivateMethod.method3();
    }
}
