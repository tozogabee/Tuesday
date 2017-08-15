package proxyanddecorator;

public class RichDecorator extends PlayerDecorator {

    private SkillInterface skills;
    private AbstractPlayer decoratedShape;

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


    private void setSpeed(PlayerInterface decoratedShape) {
        System.out.print(" Rich ");
    }
    
}
