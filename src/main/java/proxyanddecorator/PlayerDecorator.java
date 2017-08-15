package proxyanddecorator;

public abstract class PlayerDecorator implements PlayerInterface {
    protected PlayerInterface decoratedPlayer;
    
    public PlayerDecorator(PlayerInterface decoratedCar) {
        this.decoratedPlayer = decoratedCar;
    }
    
    @Override
    public void writeoutProperties() {
        decoratedPlayer.writeoutProperties();
    }
}
