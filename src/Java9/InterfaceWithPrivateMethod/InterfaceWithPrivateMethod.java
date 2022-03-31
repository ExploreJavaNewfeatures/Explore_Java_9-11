package Java9.InterfaceWithPrivateMethod;

public interface InterfaceWithPrivateMethod {
    void method1();

    default void method2() {
        method4();  //private method inside default method
        method5();  //static method inside other non-static method
        System.out.println("default method");
    }

    static void method3() {
        method5(); //static method inside other static method
        System.out.println("static method");
    }

    private void method4() {
        System.out.println("private method");
    }

    private static void method5() {
        System.out.println("private static method");
    }
}
