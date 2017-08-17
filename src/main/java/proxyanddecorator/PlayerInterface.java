package proxyanddecorator;

import java.util.List;

public interface PlayerInterface {
    void writeoutProperties();
    public String getWhichTypeOfPlayer();
    public SkillInterface getSkills();
    public HistoryInterface beforeTeam();
    public List<String> listingHistories();
    public List<String> skillList();
}
