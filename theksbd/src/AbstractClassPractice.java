abstract class AbstractClassTest {
    abstract public void foo();

    abstract public void bar();
}

public class AbstractClassPractice extends AbstractClassTest {
    @Override
    public void foo() {
        System.out.println("Foo");
    }

    @Override
    public void bar() {
        System.out.println("Bar");
    }

    public static void main(String[] args) {
        AbstractClassPractice abstractClassPractice = new AbstractClassPractice();
        abstractClassPractice.foo();
        abstractClassPractice.bar();
    }
}
