import java.io.*;

public class file{
    public static void main(String[] args) {
        File myDir = new File("C:\\Program Files\\Java\\jdk-24\\bin\\serialver.exe");
        System.out.println(myDir+(myDir.isDirectory()? "is a Directory":" is not a Directory"));
        File myFile = new File(myDir,"ABC.java");
        System.out.println(myFile+(myFile.exists()?"does":"does not"+"exists"));
        System.out.println("Read Premium :"+(myFile.canRead()?"granted":"denied"));
        System.out.println("Write Premium :"+(myFile.canWrite()?"granted":"denied"));
    }
}
