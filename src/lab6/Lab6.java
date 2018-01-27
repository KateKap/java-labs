package lab6;

import java.io.*;

public class Lab6 {

    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in, "CP1251"));
        OutputStreamWriter outputReader = new OutputStreamWriter(System.out, "CP1251");
        PrintWriter pw = new PrintWriter(outputReader, true);


        pw.println("Enter a text: ");
        String original_text = inputReader.readLine();
        pw.println("Enter a text for replacing: ");
        String replace_text = inputReader.readLine();
        pw.println("Enter a new replace text");
        String new_text = inputReader.readLine();
        String result_text = original_text.replace(replace_text, new_text);
        pw.println(result_text);
    }
}
