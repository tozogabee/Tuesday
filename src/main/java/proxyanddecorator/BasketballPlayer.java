package proxyanddecorator;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class BasketballPlayer extends AbstractPlayer {
    
    //final static Logger logger = Logger.getLogger(BasketballPlayer.class);
    
    private SkillInterface skills;
    private HistoryInterface histories;
    private String fileName;
    private String historyFileName;


    
    public BasketballPlayer(String fileName,String historyFileName) {
        super("BasketBallPlayer");
        this.fileName = fileName;
        this.historyFileName=historyFileName;
        this.skills = new ProxySkill(fileName);
        this.histories=new ProxyPlayerHistory(this.historyFileName);
        
    }


    @Override
    public SkillInterface getSkills() {
        return skills;
    }

    @Override
    public HistoryInterface beforeTeam() {
        return this.histories;
    }

    @Override
    public List<String> listingHistories()
    {
        return this.histories.beforeTeam();
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
