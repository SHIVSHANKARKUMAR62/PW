package PW_Program.File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File01 {
    public static void main(String[] args) throws IOException {
        // create a folder
        File dir = new File("PW");
        System.out.println(dir.exists());
        System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("........................");
        System.out.println(dir.exists());
        // create a file in pw folder(dir)
        File file = new File(dir,"pw.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.isFile());
        // write something in your available file
        FileWriter fw = new FileWriter(file); // they override the file text
        //FileWriter fr = new FileWriter(file,true); they don't override the file text
        fw.write("Hello Shiv");
        FileReader fr = new FileReader(file);
        // they Have Written an integer value, so we're typecasting the values
        int a = fr.read();
        char c = (char) a;
        while (a!=-1){
            System.out.println(c);
            a = fr.read(); // this is used to return the String last time
        }


        System.out.println("..................");
        // this is the best way to read the file

        char[] ch = new char[(int)file.length()];

        fr.read(ch);

        for (char i : ch){
            System.out.print(i);
        }






    }
}
