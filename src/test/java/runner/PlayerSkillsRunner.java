package runner;

import java.util.Map;

import org.apache.log4j.Logger;

import proxyanddecorator.BasketballPlayer;
import proxyanddecorator.FootballPlayer;
import proxyanddecorator.JuniorDecorator;
import proxyanddecorator.PlayerInterface;
import proxyanddecorator.ProxySkill;
import proxyanddecorator.RichDecorator;
import proxyanddecorator.SkillInterface;
import org.junit.*;
import org.testng.*;


public class PlayerSkillsRunner {
    
    final static Logger logger = Logger.getLogger(PlayerSkillsRunner.class);
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        SkillInterface proxySkill = new ProxySkill("index.txt");
        // FileReading fileReading = new FileReading("index.txt");
        // Map<String, String> properties = fileReading.getPropertyList();
        
        //PlayerInterface richJunior = new RichDecorator(new JuniorDecorator(new FootballPlayer("index.txt")));
        //PlayerInterface juniorBasketPlayer = new JuniorDecorator(new BasketballPlayer("index.txt"));
        
        // proxySkill.getSkill();
        /*
         * soccer.writeoutProperties(); basketer.writeoutProperties();
         */
        //Map<String, String> properties = proxySkill.getSkill();
        //juniorBasketPlayer.writeoutProperties();
        //richJunior.writeoutProperties();
        /*
         * for (Map.Entry<String, String> entry : properties.entrySet()) { System.out.println(entry.getKey() + " = " + entry.getValue()); }
         */
        
    }
    
}
