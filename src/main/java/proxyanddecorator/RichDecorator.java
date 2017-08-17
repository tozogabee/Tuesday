package proxyanddecorator;

import java.util.List;

public class RichDecorator extends PlayerDecorator {

    private SkillInterface skills;
    private AbstractPlayer decoratedShape;
    private HistoryInterface histories;

    public RichDecorator(String playerType,AbstractPlayer decoratedShape) {
        super("Rich "+playerType+" decorator",decoratedShape);
        this.decoratedShape=decoratedShape;
    }
    
    @Override
    public void writeoutProperties() {
        decoratedPlayer.writeoutProperties();
        setSpeed(decoratedPlayer);
        
    }

    @Override
    public SkillInterface getSkills() {
        return decoratedShape.getSkills();
    }

    @Override
    public HistoryInterface beforeTeam() {
       return this.decoratedShape.beforeTeam();
    }

    @Override
    public List<String> listingHistories()
    {
        return this.decoratedShape.beforeTeam().beforeTeam();
    }


    private void setSpeed(PlayerInterface decoratedShape) {
        System.out.print(" Rich ");
    }
    
}
