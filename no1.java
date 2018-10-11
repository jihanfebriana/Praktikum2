
package Modul2;
import java.io.*;
/**
 *
 * @author indha
 */
public class no1 {
    public static void main(String args[]){
    try{
        FileReader fr=new FileReader("D:/copy.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("D:/paste.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String line;
        line=br.readLine();
        while(line !=null){
            try{
         
            bw.write(line,0,line.length());
            bw.newLine();
            line=br.readLine();
            System.out.println("data berhasil di copy");
        } catch(Exception e){
            System.out.println("data gagal di copy");
        }      
        }
        br.close();
        bw.close();
    }    catch(Exception e){
        e.printStackTrace();
    }
}
}         