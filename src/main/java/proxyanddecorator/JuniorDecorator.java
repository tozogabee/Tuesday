package proxyanddecorator;

import java.util.List;

public class JuniorDecorator extends PlayerDecorator {

    private SkillInterface skills;
    private HistoryInterface histories;
    AbstractPlayer decoratedShape;

    public JuniorDecorator(String playerType,AbstractPlayer decoratedShape) {

        super("Junior "+playerType+" decorator",decoratedShape);
        this.decoratedShape=decoratedShape;
    }
    
    @Override
    public void writeoutProperties() {
        decoratedPlayer.writeoutProperties();
        setRedBody(decoratedPlayer);
    }

    @Override
    public List<String> listingHistories()
    {
        return this.beforeTeam().beforeTeam();
    }

    @Override
    public SkillInterface getSkills()
    {
        return decoratedShape.getSkills();
    }

    @Override
    public HistoryInterface beforeTeam() {
        return decoratedShape.beforeTeam();
    }


    private void setRedBody(PlayerInterface decoratedShape) {
        System.out.print(" Junior ");
    }
}
