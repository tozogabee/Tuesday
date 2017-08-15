package proxyanddecorator;

import java.util.Map;

public class FootballPlayer implements PlayerInterface {
    
    private SkillInterface skills;
    private String fileName;
    
    public FootballPlayer(String fileName) {
        this.fileName = fileName;
        this.skills = new ProxySkill(fileName);
        
    }
    
    @Override
    public void writeoutProperties() {
        System.out.println("The FootballPlayer has got the following skills");
        for (Map.Entry<String, String> entry : this.skills.getSkill().entrySet()) {
            
            System.out.println("\t" + entry.getKey() + " = " + entry.getValue());
        }
    }
}
