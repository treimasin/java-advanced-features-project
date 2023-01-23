package accessmodifiers;

public class C2 {

    public void aMethod () {
        C1 c1 = new C1();

        // can access
/*        System.out.println(c1.publicField);
        // can access
        System.out.println(c1.defaultField);
        // CAN'T access
        System.out.println(c1.privateField);
        // can access
        System.out.println(c1.protectedField);

        // can invoke
        c1.publicMethod();
        // can invoke
        c1.defaultMethod();
        // CAN'T invoke
        c1.privateMethod();
        // can invoke
*/        c1.protectedMethod();
    }
}
