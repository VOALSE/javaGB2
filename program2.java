import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;

public class program2 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(program2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        
        int [] array = {25, 3, 10, 7, 1};
        boolean sort = false;
        int temp;
        StringBuilder builder = new StringBuilder(); 

            while(!sort) {
                sort = true;
                
                String text = builder.toString();
                for (int i : array) { 
                    builder.append(i + ", ");
                }
                logger.info(text);

                for (int i = 0; i < array.length-1; i++) {
                    if(array[i] > array[i+1]){ 
                        sort = false; 
                        
                        temp = array[i]; 
                        array[i] = array[i+1]; 
                        array[i+1] = temp;

                    }  
                } 
                
            }
        System.out.println(Arrays.toString(array)); 

        
        
    }
}


