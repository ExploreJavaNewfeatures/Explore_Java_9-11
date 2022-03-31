package Java9.InterfaceWithPrivateMethod;

public class InterfacePrivateMethodImplement implements InterfaceWithPrivateMethod {
    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args){
        InterfaceWithPrivateMethod instance = new InterfacePrivateMethodImplement();
        instance.method1();
        instance.method2();
        InterfaceWithPrivateMethod.method3();
    }
}
