package proxyanddecorator;

public abstract class PlayerDecorator extends AbstractPlayer {
    protected PlayerInterface decoratedPlayer;
    protected String whichTypeOfPlayerDecorator;
    private AbstractPlayer decorated;

    public PlayerDecorator(String whichTypeOfPlayerDecorator,AbstractPlayer decoratedCar) {
        super(whichTypeOfPlayerDecorator);
        this.decoratedPlayer = decoratedCar;
    }

    public PlayerInterface getDecoratedPlayer() {
        return decoratedPlayer;
    }

    public void setDecoratedPlayer(PlayerInterface decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    public String getWhichTypeOfPlayerDecorator() {
        return whichTypeOfPlayerDecorator;
    }

    public void setWhichTypeOfPlayerDecorator(String whichTypeOfPlayerDecorator) {
        this.whichTypeOfPlayerDecorator = whichTypeOfPlayerDecorator;
    }

    @Override
    public SkillInterface getSkills()
    {
        return decorated.getSkills();
    }

    @Override
    public void writeoutProperties() {
        decoratedPlayer.writeoutProperties();
    }
}
