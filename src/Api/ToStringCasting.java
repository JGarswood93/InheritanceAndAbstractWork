package Api;

public class ToStringCasting {


        int i;

        public ToStringCasting(int i) {
            this.i = i;
        }

        public String toString() {
            if (i == 0) return null;
            else return "" + i;
        }

        public static void main(String[] args) {
            ToStringCasting t1 = new ToStringCasting(0);//puts the int to string default(null)
            ToStringCasting t2 = new ToStringCasting(2);
            System.out.println(t2);
            System.out.println("" + t1);
        }
    }



