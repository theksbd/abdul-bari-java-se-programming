interface InterfaceTest {
    void foo();

    void bar();
}

public class InterfacePractice implements InterfaceTest {
    @Override
    public void foo() {
        System.out.println("Foo");
    }

    @Override
    public void bar() {
        System.out.println("Bar");
    }

    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfacePractice();
        interfaceTest.foo();
        interfaceTest.bar();
    }
}
