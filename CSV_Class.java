import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
public class CSV_Class {

    public static void main(String[] args) {  
        String line = "";  
        String splitBy = ",";

        try {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("test.csv"));  
            while ((line = br.readLine()) != null) {   //returns a Boolean value  
                String[] row = line.split(splitBy);    // use comma as separator
                int length = row.length;
                
                if(length > 0 && row[1] instanceof java.lang.String) {
                    
                    for(int i = 0; i < length - 1; ++i) {
                        System.out.print(row[i] + ", ");
                    }

                    System.out.println(row[length - 1]);
                    
                }
            }  
        }   
        catch (IOException e) {     
            e.printStackTrace();  
        }  

    }

}  