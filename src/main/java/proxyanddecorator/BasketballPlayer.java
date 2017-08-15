package proxyanddecorator;

import java.util.Map;

import org.apache.log4j.Logger;

public class BasketballPlayer extends AbstractPlayer {
    
    //final static Logger logger = Logger.getLogger(BasketballPlayer.class);
    
    private SkillInterface skills;
    private String fileName;


    
    public BasketballPlayer(String fileName) {
        super("BasketBallPlayer");
        this.fileName = fileName;
        this.skills = new ProxySkill(fileName);
        
    }


    @Override
    public SkillInterface getSkills() {
        return skills;
    }

    public void setSkills(SkillInterface skills) {
        this.skills = skills;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeoutProperties() {
        System.out.println("The BasketballPlayer has got the following skills");
        //logger.info("The BasketballPlayer has got the following skills");
        for (Map.Entry<String, String> entry : this.skills.getSkill().entrySet()) {
            //logger.info("\t" + entry.getKey() + " = " + entry.getValue());
             System.out.println("\t" + entry.getKey() + " = " + entry.getValue());
        }
    }


}
