public class Multi {
    public static void main(String arg[]) {

        // arr is 2 dimentional array which contains 3 one dimentional
        // array ,each 1 dimentional array contains 4 elements,
        // each elements is of type integer

        // allowed in c & c++
        // int Arr[3][4]={{10,20,30,40},{50,60,70,80},{90,100,110,120}};

        // allowed in java
        int Arr[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };

        System.out.println(Arr.length); // 3
        System.out.println(Arr[0].length); // 4

    }
}
