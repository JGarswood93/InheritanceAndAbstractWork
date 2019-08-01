package interfacestuff;

interface House {


    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Bungalow extends House {
    public default String getAddress() {
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House {
}

class TestClass {
    public static void main(String[] args) {
        House ci = new MyHouse();
        System.out.println(ci.getAddress());
    }
    /**
     * constructor in main calls MyHouse class which has bungalow and house interface
     *
     * gets the address from most recent implementation i.e. getAddress method
     *
     * hence printing - return "101 Smart Str"; when it runs to the end
     */
}

