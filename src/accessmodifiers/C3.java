package accessmodifiers;

public class C3 extends C1{
    public void aMethod() {

        // accessible
/*        System.out.println(publicField);
        // CANNOT access
        System.out.println(privateField);
        // accessible
        System.out.println(defaultField);
        // accessible
        System.out.println(protectedField);

        publicMethod();

        privateMethod();

        defaultMethod();

*/        protectedMethod();
    }
}
