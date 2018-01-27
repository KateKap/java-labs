package lab7;

import java.io.*;

public class Lab7 {
    public static void main(String[] args) throws IOException {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in, "CP1251"));
        OutputStreamWriter outputReader = new OutputStreamWriter(System.out, "CP1251");
        PrintWriter pw = new PrintWriter(outputReader, true);



            try {
                pw.println("Enter file name for reading: ");
                String fileForReading = inputReader.readLine();
                BufferedReader inputReader2 = new BufferedReader(new FileReader(fileForReading));
                String original_text = inputReader2.readLine();

                pw.println("Enter a text for replacing: ");
                String replace_text = inputReader.readLine();
                String new_text = "*";


                String result_text = original_text.replace(replace_text, new_text);

                pw.println("Enter a file name for writing: ");
                String fileForWriting = inputReader.readLine();
                BufferedWriter outputWriter2 = new BufferedWriter(new FileWriter(fileForWriting));


                outputWriter2.write(result_text + "\n");
                outputWriter2.flush();


                //FileInputStream fromFile = new FileInputStream(fileForReading);

            /*pw.println("Enter a text for replacing: ");
            String replace_text = inputReader.readLine();
            String new_text = "*";
            FileOutputStream inFile = new FileOutputStream(fileForWriting);


            String result_text = original_text.replace(replace_text, new_text);
            pw.println(result_text);
            inFile.close();
            fromFile.close();*/
            } catch (FileNotFoundException e) {
                System.out.println("Impossible to open a file");
            } catch (IOException e) {
                System.out.println("Input/Output error: " + e);
            }
        }



}
