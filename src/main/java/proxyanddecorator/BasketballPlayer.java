package proxyanddecorator;

import java.util.Map;

import org.apache.log4j.Logger;

public class BasketballPlayer implements PlayerInterface {
    
    final static Logger logger = Logger.getLogger(BasketballPlayer.class);
    
    private SkillInterface skills;
    private String fileName;
    
    public BasketballPlayer(String fileName) {
        this.fileName = fileName;
        this.skills = new ProxySkill(fileName);
        
    }
    
    @Override
    public void writeoutProperties() {
        // System.out.println("The BasketballPlayer has got the following skills");
        logger.info("The BasketballPlayer has got the following skills");
        for (Map.Entry<String, String> entry : this.skills.getSkill().entrySet()) {
            logger.info("\t" + entry.getKey() + " = " + entry.getValue());
            // System.out.println("\t" + entry.getKey() + " = " + entry.getValue());
        }
    }
}
