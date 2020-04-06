package FileCopyTime;

import java.io.File;
import java.io.IOException;

public class FileCopyImpl {
    public static double fileCopyTime(FileCopy fileCopy, File sources, File target) throws IOException {
        long start = System.currentTimeMillis();
        fileCopy.copy(sources, target);
        long end = System.currentTimeMillis();
        return end - start;
    }
}

