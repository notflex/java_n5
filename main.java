import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк:");
        int countString=Integer.parseInt(reader.readLine()) ;
        String min = null;
        String max = null;

        for (int i = 0; i < countString; i++){
            System.out.println("Введите строку номер " + (i+1));
            String currentString = reader.readLine();
            if (max == null || max.length() < currentString.length()){
                max = currentString;
            }
            if (min==null || currentString.length()<min.length()){
                min=currentString;
            }
        }
        System.out.println("Самая короткая строка = " + min + " Ее длина: " + min.length());
        System.out.println("Самая длинная строка = " + max + " Ее длина: " + max.length());
    }
}