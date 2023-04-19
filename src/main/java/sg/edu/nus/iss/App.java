package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "]: " + args[i]);
            }
        } else {
            System.out.println("You have not passed in any arguments");
        }

        String dirPath = args[0];
        String fileName = args[1];
        String dirPathFileName = dirPath + File.separator + fileName;

        File newDirectory = new File(dirPath);

        if (!newDirectory.exists()) {
            newDirectory.mkdir();
        } else {
            System.out.println("Directory already exists");
        }

        File newFile = new File(dirPathFileName);

        if (!newFile.exists()) {
            newFile.createNewFile();
        } else {
            System.out.println("File already exists");
        }

        // String content = "The quick brown fox jumps over the lazy dog.";
        // String content2 = "1234567890";

        // FileWriter toWrite = new FileWriter(dirPathFileName, true);
        // toWrite.write(content);
        // toWrite.write("\n");
        // toWrite.write(content2);
        // toWrite.write("\n");
        // toWrite.flush();
        // toWrite.close();

        // String content3 = "9876543210";

        // FileWriter toWrite2;
        // toWrite2 = new FileWriter(dirPathFileName, true);
        // BufferedWriter bufferWrite = new BufferedWriter(toWrite2);
        // bufferWrite.append(content3);
        // bufferWrite.append("\n");
        // bufferWrite.flush();
        // bufferWrite.close();
        // toWrite2.close();

        // String content4 = "111111111\n";

        // FileOutputStream os = new FileOutputStream(dirPathFileName, true);

        // byte[] contentInBytes = content4.getBytes();

        // os.write(contentInBytes);
        // os.flush();
        // os.close();

        // DataOutputStream os2 = new DataOutputStream(os);


        File file2 = new File(dirPath + File.separator + fileName);
        FileReader toRead = new FileReader(file2);
        // int dataRead = toRead.read();
        // while (dataRead != -1) {
        //     System.out.print((char) dataRead);
        //     dataRead = toRead.read();
        // }
          


        // BufferedReader bufferRead = new BufferedReader(toRead);
        // String line = "";
        // line = bufferRead.readLine();

        // while (line != null) {
        //     System.out.println(line);
        //     line = bufferRead.readLine();
        // }

        // bufferRead.close();
        // toRead.close();     

        FileInputStream is = new FileInputStream(file2);
        DataInputStream is2 = new DataInputStream(is);

        int dataRead2 = is2.read();
        while (dataRead2 != -1) {
            System.out.print((char) dataRead2);
            dataRead2 = is2.read();
        }

        is2.close();
        is.close();
        
    }
}
