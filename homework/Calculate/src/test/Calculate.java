package test;

public class Calculate {
	public static int add(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("��������Ϊ0");
        }
        return a / b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }
}

