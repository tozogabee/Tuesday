package proxyanddecorator;

public class JuniorDecorator extends PlayerDecorator {

    private SkillInterface skills;

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
    public SkillInterface getSkills()
    {
        return decoratedShape.getSkills();
    }



    private void setRedBody(PlayerInterface decoratedShape) {
        System.out.print(" Junior ");
    }
}
