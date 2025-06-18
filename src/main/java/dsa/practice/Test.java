package dsa.practice;

class Data {
    int i;
    String str;
}
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.func1();
    }
    private void func1() {

        Data data = new Data();
        data.i = 10;
        data.str = "A";

        Data[] arr = new Data[1];// Heap area
        arr[0] = data; //

        func2(arr); // arr[data]

        System.out.println(arr[0].i); //
        System.out.println(arr[0].str); //
    }

    private void func2(Data[] arr) {

        arr[0].i = 20;
        arr[0].str = "B";

        Data data = arr[0];
        data.i = 30;
        data.str = "C";

        data = new Data();
        data.i = 40;
        data.str = "D";

        arr[0] = data;

        arr = new Data[1];
        data = new Data();
        data.i = 50;
        data.str = "E";
        arr[0] = data;
    }
}