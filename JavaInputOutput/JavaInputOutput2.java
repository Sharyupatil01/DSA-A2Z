package JavaInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaInputOutput2 {
    public static void main(String args[])
    {
        //writing in  an output file 
        // file writer write character by character
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\HP\\.cache\\Desktop\\DSA-A2Z\\JavaInputOutput\\input.txt"));
            bw.write("hello , this is written using buffered writer");
            bw.newLine();
            bw.write("This is second line");
            bw.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
