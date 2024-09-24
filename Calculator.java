
public class Cal {
    // public Cal(){}

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Cal MyCal = new Cal();
        System.out.println("Sum of the values:" + (MyCal.add(5, 7)));
        System.out.println("Sum of the values:" + (MyCal.sub(5, 7)));
        System.out.println("Sum of the values:" + (MyCal.mul(5, 7)));
        System.out.println("Sum of the values:" + (MyCal.div(5, 7)));

    }
}
