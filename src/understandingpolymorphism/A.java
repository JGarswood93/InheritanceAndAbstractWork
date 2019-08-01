package understandingpolymorphism;

public class A implements I {
    public String toString() {
        return "in a";
    }
    static class B extends A {
        public String toString() {
            return "in b";
        }
        static class Test {
            public static void main(String[] args) {
                B b = new B();
                A a = b;
                I i = a;

                System.out.println(i);
                System.out.println((B)a);
                System.out.println(b);
            }
        }
    }
}
