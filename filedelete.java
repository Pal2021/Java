import java.nio.file.*;
import java.io.*;
public class filedelete {
    public static void main(String[] args)throws IOException {
        Path path = FileSystems.getDefault().getPath("C:\\Users\\prash\\Desktop\\cap.pptx");
        Files.delete(path);
          System.out.println("file deleted");
    }
}
