package abstraction.abstractclass;

public class Demo {
    public static void main(String[] args) {
        MyConcreteClass obj = new MyConcreteClass();
        obj.abstractMethod();

        Boy boy = new Boy();
        boy.eat();

        Girl girl = new Girl();
        girl.breathe();
    }
}
