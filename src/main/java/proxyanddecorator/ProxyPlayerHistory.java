package proxyanddecorator;

import java.util.List;

/**
 * Created by java on 2017.08.17..
 */
public class ProxyPlayerHistory implements HistoryInterface {

    private RealPlayerHistory realPlayerHistory;
    private String fileName;

    public ProxyPlayerHistory(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<String> beforeTeam() {
        if(realPlayerHistory==null)
        {
            this.realPlayerHistory=new RealPlayerHistory(this.fileName);
        }
        return this.realPlayerHistory.beforeTeam();
    }
}
