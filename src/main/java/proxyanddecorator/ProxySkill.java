package proxyanddecorator;

import java.util.Map;

public class ProxySkill implements SkillInterface {
    
    private RealSkill realImage;
    private String fileName;
    
    public ProxySkill(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public Map<String, String> getSkill() {
        if (realImage == null) {
            realImage = new RealSkill(fileName);
        }
        return realImage.getSkill();
    }
}
