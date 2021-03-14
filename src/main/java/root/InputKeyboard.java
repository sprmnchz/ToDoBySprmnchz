package root;

import java.util.Scanner;

public class InputKeyboard {

    public static String keyboardScanner() {
        String BufferInputKeyboard;
        Scanner scannerKeyboard = new Scanner(System.in);
        BufferInputKeyboard = scannerKeyboard.nextLine();
        return BufferInputKeyboard;
    }

}
