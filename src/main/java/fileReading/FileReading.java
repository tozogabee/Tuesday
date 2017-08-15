package fileReading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileReading {
    
    private BufferedReader readFromfile;
    
    public FileReading(String fileName) {
        try {
            readFromfile = new BufferedReader(new FileReader(fileName));
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public BufferedReader getReadFromfile() {
        return readFromfile;
    }
    
    public void setReadFromfile(BufferedReader readFromfile) {
        this.readFromfile = readFromfile;
    }
    
    public Map<String, String> getPropertyList() {
        Map<String, String> propertiesList = new HashMap<>();
        String line = null;
        try {
            while ((line = this.getReadFromfile().readLine()) != null) {
                String[] properties = line.split(";");
                for (String propertiesTmp : properties) {
                    String[] property = propertiesTmp.split("=");
                    propertiesList.put(property[0], property[1]);
                }
            }
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return propertiesList;
    }
    
}
