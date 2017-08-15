package proxyanddecorator;

import java.util.Map;

import org.apache.log4j.Logger;

public class FootballPlayer implements PlayerInterface {
    
    final static Logger logger = Logger.getLogger(FootballPlayer.class);
    
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
