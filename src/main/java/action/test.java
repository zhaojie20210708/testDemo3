package action;

public class test {
    public static void main(String[] args) {
        int foo = 100;
        int j = 0;
        for (int i = 0; i < foo; i++) {
            j = i + j;
            test(i);
        }
    }

    public static void test(int i){
        System.out.println("-----------YouMeek.com-----------i值=" + i + "," + "当前类=test.test()");
    }
}
