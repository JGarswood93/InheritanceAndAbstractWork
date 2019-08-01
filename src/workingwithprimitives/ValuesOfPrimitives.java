package workingwithprimitives;

public class ValuesOfPrimitives {




        static int a;
        int b;

        public ValuesOfPrimitives() {
            int c;
            c = a;
            a++;
            ++a;
            --a;
            a--;
            b += c;
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);

        }

        public static void main(String args[]) {
            new ValuesOfPrimitives();

        }
    }

