package JavaFundamentals.JavaInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaInputOutput1 {
    public static void main(String args[])
    {
        //java i/o stream
        //reading a file 
        // file reader read it character by character 
        try {
            FileReader fr=new FileReader("C:\\Users\\HP\\.cache\\Desktop\\DSA-A2Z\\JavaInputOutput\\input.txt");
            int ch;// to store each character
            try {
                while((ch=fr.read())!=-1)
                {
                    System.out.print((char)ch);
                }
            } catch (IOException e) {
               
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }

        //buffered reader 
        // it read line by line hence they are faster compared to file reader 
        try {
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\HP\\.cache\\Desktop\\DSA-A2Z\\JavaInputOutput\\input.txt"));
            String line; // to store each line
            try {
                while((line=br.readLine())!=null)
                {
                    System.out.println(line);
                }
            } catch (IOException e) {
               
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
        
        
    }
}
