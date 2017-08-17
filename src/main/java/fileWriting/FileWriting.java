package fileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by java on 2017.08.17..
 */
public class FileWriting {


    private FileWriter newFile;

    public FileWriting(String fileName)
    {
        try {
            this.newFile=new FileWriter(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(List<String> content)
    {
        for(String actContent : content)
        {
            try {
                this.newFile.write(actContent+"\n");
                this.newFile.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            this.newFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
