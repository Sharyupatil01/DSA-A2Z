package JavaFundamentals.JavaInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;

public class JavaInputOutput3 {
    public static void main(String args[])
    {
        // try with resources 
        //real world industry level example
        // reading a csv file and processing a its data
        
        try(BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\HP\\.cache\\Desktop\\DSA-A2Z\\JavaInputOutput\\employee.csv")))
        {
            String line;
            while((line=br.readLine())!=null)
            {
                String data[]=line.split(",");
                System.out.println("Name: "+data[0]+" Age: "+data[1]+" Department: "+data[2]);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
