package proxyanddecorator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class FootballPlayer extends AbstractPlayer {
    
    final static Logger logger = Logger.getLogger(FootballPlayer.class);
    
    private SkillInterface skills;
    private HistoryInterface histories;
    private String fileName;
    private String historyFileName;
    
    public FootballPlayer(String fileName,String historyFileName) {
        super("FootBallPlayer");
        this.fileName = fileName;
        this.skills = new ProxySkill(fileName);
        this.historyFileName=historyFileName;
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

    @Override
    public List<String> skillList() {
        Map<String,String>skillList=skills.getSkill();
        List<String> skills=new ArrayList<>();
        for(Map.Entry<String,String> entries : skillList.entrySet())
        {
            skills.add(entries.getValue());
        }
        return skills;
    }

    public void setSkills(SkillInterface skills) {
        this.skills = skills;
    }

    @Override
    public void writeoutProperties() {
        System.out.println("The FootballPlayer has got the following skills");
        for (Map.Entry<String, String> entry : this.skills.getSkill().entrySet()) {
            
            System.out.println("\t" + entry.getKey() + " = " + entry.getValue());
        }
    }
}
