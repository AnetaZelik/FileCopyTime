package FileCopyTime;

import java.io.File;
import java.io.IOException;

import static FileCopyTime.FileCopy.useIOStream;
import static FileCopyTime.FileCopyImpl.fileCopyTime;

public class Main {
    public static void main(String[] args) throws IOException {
        File source = new File("source.txt");
        File target = new File("target.txt");
        double copyTime = fileCopyTime(useIOStream, source, target);
        System.out.println(copyTime);
    }
}
