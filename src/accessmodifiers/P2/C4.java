package accessmodifiers.P2;

import accessmodifiers.C1;

public class C4 extends C1 {
    public void aMethod() {

/*        System.out.println(publicField);  // CAN
        System.out.println(privateField);  // CAN'T
        System.out.println(defaultField);  // CAN'T
        System.out.println(protectedField);  // CAN

        publicMethod(); // CAN
        privateMethod();  // CAN'T
        defaultMethod();  // CAN'T
*/        protectedMethod();  // CAN


    }
}
