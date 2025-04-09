import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("1.txt");
        String sTemp = Files.readString(fileName);
        int iCounter = 0;
        int index1 = 0, index2=0,index3=0,index4=0,index5=0,index6 = 0;

        while (true){
            if (sTemp.indexOf("Пьер ", index1 + 1) != -1) {
                iCounter++;
                index1 = sTemp.indexOf("Пьер ", index1 + 1);
            } else if (sTemp.indexOf("Пьер,", index2 + 1) != -1) {
                iCounter++;
                index2 = sTemp.indexOf("Пьер,", index2 + 1);
            } else if (sTemp.indexOf("Пьер?", index3 + 1) != -1) {
                iCounter++;
                index3 = sTemp.indexOf("Пьер?", index3 + 1);
            } else if (sTemp.indexOf("Пьер!", index4 + 1) != -1) {
                iCounter++;
                index4 = sTemp.indexOf("Пьер!", index4 + 1);
            } else if (sTemp.indexOf("Пьер.", index5 + 1) != -1) {
                iCounter++;
                index5 = sTemp.indexOf("Пьер.", index5 + 1);
            } else if (sTemp.indexOf("Пьер)", index6 + 1) != -1) {
                iCounter++;
                index6 = sTemp.indexOf("Пьер)", index6 + 1);
            } else break;

        }

        System.out.println(iCounter);

    }
}
