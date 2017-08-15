package proxyanddecorator;

public class JuniorDecorator extends PlayerDecorator {
    
    public JuniorDecorator(PlayerInterface decoratedShape) {
        super(decoratedShape);
    }
    
    @Override
    public void writeoutProperties() {
        decoratedPlayer.writeoutProperties();
        setRedBody(decoratedPlayer);
    }
    
    private void setRedBody(PlayerInterface decoratedShape) {
        System.out.print(" Junior ");
    }
}
