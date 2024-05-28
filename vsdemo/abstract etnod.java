abstract class A {
    abstract void test1();

    abstract void test2();

}

class B extends A {
    public void test1() {
        System.out.println("test1 method");

    }

    public void test2() {
        System.out.println("test2 method");
    }
}

class Mainclass {
    public static void main(String[] args) {
        B b1 = new B();
        b1.test1();
        b1.test2();
    }
}
