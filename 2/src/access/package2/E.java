package access.package2;

import access.package1.A;

public class E extends A {

    public void methodE() {

//        System.out.println("varPub: " + varPub);
//        System.out.println("varPro: " + varPro);

        // Even if it's another instance of E
        E e = new E();
//        System.out.println("varPub: " + e.varPub);
//        System.out.println("varPro: " + e.varPro);

        A a = new A();
//        System.out.println("varPub: " + a.varPub);
//        System.out.println("varPro: " + a.varPro);
    }

}
