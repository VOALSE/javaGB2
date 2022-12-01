import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class program1 {
    public static void main(String[] args) {
        String pathFile = "C:\\Users\\AVoytov\\Desktop\\Java\\javaHomeWork\\homework2\\dano.json";
        String line = "empty";
        try {
            File File = new File(pathFile);
            if (File.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                BufferedReader bufReader = new BufferedReader(new FileReader(File));
                System.out.println("Файл не создан");
                line = bufReader.readLine();
                bufReader.close();
            }
        } catch (Exception e) {

        } finally {
            String arr[] = line.split(":| ");
            int i = 0;
            for (i = 0; i < arr.length; i++) {
                arr[i] = arr[i].replace("\"", "");
                arr[i] = arr[i].replace(":", "");
                arr[i] = arr[i].replace(",", "");
                arr[i] = arr[i].replace("{", "");
                arr[i] = arr[i].replace("}", "");
            }
            for (i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr[i] += " = ";
                }
                else if (i<arr.length -1) {
                    arr[i] = "'" + arr[i] + "'" + " and ";
                }
                else {
                    arr[i] = "'" + arr[i] + "'";
                }
            }
            System.out.println(String.join("", arr));
        }
    }
}
