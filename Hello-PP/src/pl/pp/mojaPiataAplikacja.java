package pl.pp;

public class mojaPiataAplikacja {
    public static void main(String[] args) {
        myMethod('*', 4, 3);
        myMethod('A', 12, 2);
    }

    public static void myMethod(char character, int numOfChars, int numOfLines) {

        for (int i = 0; i < numOfLines; i++) {
            for (int j = 0; j < numOfChars; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}