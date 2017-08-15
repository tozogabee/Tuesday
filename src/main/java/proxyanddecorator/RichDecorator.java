package proxyanddecorator;

public class RichDecorator extends PlayerDecorator {
    
    public RichDecorator(PlayerInterface decoratedShape) {
        super(decoratedShape);
    }
    
    @Override
    public void writeoutProperties() {
        decoratedPlayer.writeoutProperties();
        setSpeed(decoratedPlayer);
        
    }
    
    private void setSpeed(PlayerInterface decoratedShape) {
        System.out.print(" Rich ");
    }
    
}
