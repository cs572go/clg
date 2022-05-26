package lca04;
import java.io.*;
/*
buffered reader - buffered writer file to file
 */
public class filecopy {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Tushar Deshmukh\\eclipse-workspace\\clg\\src\\lca04\\source.txt");
        File f2 = new File("C:\\Users\\Tushar Deshmukh\\eclipse-workspace\\clg\\src\\lca04\\destination.txt");

        BufferedReader br = new BufferedReader(new FileReader(f1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

        String str=br.readLine();
        do{
            System.out.println(str);
            bw.write(str+"\n");
            str=br.readLine();
        }while(str!=null);
        br.close();
        bw.close();
    }
}
