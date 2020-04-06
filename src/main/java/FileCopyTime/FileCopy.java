package FileCopyTime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

interface FileCopy {
    void copy(File sources, File target) throws IOException;

    FileCopy useIOStream = (sources, target1) -> {
        try (FileInputStream in = new FileInputStream(sources);
             FileOutputStream out = new FileOutputStream(target1)) {
            int anotherByte;
            while (((anotherByte = in.read()) != -1)) {
                out.write(anotherByte);
            }
        }
    };
}