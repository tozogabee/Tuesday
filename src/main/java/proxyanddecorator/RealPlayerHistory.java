package proxyanddecorator;

import fileReading.FileReading;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by java on 2017.08.17..
 */
public class RealPlayerHistory implements HistoryInterface {


    private String fileName;
    private FileReading file;

    public RealPlayerHistory(String fileName) {
        this.fileName = fileName;
        this.file=new FileReading(this.fileName);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileReading getFile() {
        return file;
    }

    public void setFile(FileReading file) {
        this.file = file;
    }

    @Override
    public List<String> beforeTeam() {
        Map<String,String> listOfTeams=this.getFile().getPropertyList();
        List<String> teams=new ArrayList<>();
        for(Map.Entry<String,String> entries : listOfTeams.entrySet())
        {
            teams.add(entries.getValue());
        }

        return teams;
    }
}
