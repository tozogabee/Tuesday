package proxyanddecorator;

public abstract class AbstractPlayer implements PlayerInterface{

    protected String whichTypeOfPlayer;

    public AbstractPlayer(String whichTypeOfPlayer) {
        this.whichTypeOfPlayer=whichTypeOfPlayer;
    }

    @Override
    public String getWhichTypeOfPlayer() {
        return whichTypeOfPlayer;
    }

    public void setWhichTypeOfPlayer(String whichTypeOfPlayer) {
        this.whichTypeOfPlayer = whichTypeOfPlayer;
    }
}
