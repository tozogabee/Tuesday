package proxyanddecorator;

import java.util.Map;

public class BasketballPlayer implements PlayerInterface {
    
    private SkillInterface skills;
    private String fileName;
    
    public BasketballPlayer(String fileName) {
        this.fileName = fileName;
        this.skills = new ProxySkill(fileName);
        
    }
    
    @Override
    public void writeoutProperties() {
        System.out.println("The BasketballPlayer has got the following skills");
        for (Map.Entry<String, String> entry : this.skills.getSkill().entrySet()) {
            
            System.out.println("\t" + entry.getKey() + " = " + entry.getValue());
        }
    }
}
