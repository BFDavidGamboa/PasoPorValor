// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        //just a copy of the value is passed
        //But the memory of this variable stills the same
        System.out.println(x);

        changeValue(x);
        System.out.println("x = " + x);
    }

    //Static methods if main is static
    //Values are passed by values
    private static void changeValue(int arg) {
        arg = 20;
        System.out.println("arg = "+ arg);
    }



}

