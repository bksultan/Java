package Mo;

class Main {
    int a;
    int b = 9;

    public int sum() {
        return a+b;
    }
    private int add() {
        return a+b;
    }
    int result() {
        return new Main().add();
    }
}

class Examp3{
    public static void main(String []aa) {
        Main e = new Main();
        System.out.println(e.sum() + e.result());
    }
}