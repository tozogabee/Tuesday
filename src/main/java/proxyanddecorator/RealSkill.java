package proxyanddecorator;

import java.util.Map;

import fileReading.FileReading;

public class RealSkill implements SkillInterface {
    
    private String fileName;
    private FileReading file;
    
    public RealSkill(String fileName) {
        this.fileName = fileName;
        this.file = new FileReading(fileName);
    }
    
    public FileReading getFile() {
        return file;
    }
    
    public void setFile(FileReading file) {
        this.file = file;
    }
    
    @Override
    public Map<String, String> getSkill() {
        Map<String, String> skillList = this.getFile().getPropertyList();
        return skillList;
    }
    
}
