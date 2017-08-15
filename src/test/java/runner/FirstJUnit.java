package runner;

import org.junit.*;
import org.testng.*;
import proxyanddecorator.*;

import java.util.*;

import static org.junit.Assert.*;

public class FirstJUnit {

    private PlayerInterface basketballPlayer;
    private PlayerInterface footballPlayer;
    private PlayerInterface JuniorFootBallPlayer;
    private PlayerInterface JuniorBasketballPlayer;
    private PlayerInterface RichBasketPlayer;
    private PlayerInterface RichFootBallPlayer;
    private List<PlayerInterface> players;



    @Before
    public void setUp()
    {
        this.basketballPlayer=new BasketballPlayer("index.txt");
        this.footballPlayer=new FootballPlayer("index.txt");
        this.JuniorBasketballPlayer= new JuniorDecorator("BasketBallPlayer",new BasketballPlayer("index.txt"));
        this.JuniorFootBallPlayer=new JuniorDecorator("FootBallPlayer",new FootballPlayer("index.txt"));
        this.RichBasketPlayer=new RichDecorator("BasketBallPlayer",new BasketballPlayer("index.txt"));
        this.RichFootBallPlayer=new RichDecorator("FootBallPlayer",new FootballPlayer("index.txt"));
        this.players=new ArrayList<>();
        players.add(this.basketballPlayer);
        players.add(this.footballPlayer);
        players.add(this.JuniorBasketballPlayer);
        players.add(this.JuniorFootBallPlayer);
        players.add(this.RichBasketPlayer);
        players.add(this.RichFootBallPlayer);
    }

    @Test
    public void checkingExistBasketPlayer()
    {
        assertNotNull(this.basketballPlayer);
    }

    @Test
    public void checkingExistFootBallPlayer()
    {
        assertNotNull(this.footballPlayer);
    }

    @Test
    public void checkingJuniorBasketPlayer()
    {
        assertNotNull(this.JuniorBasketballPlayer);
    }

    @Test
    public void checkingJuniorFootBallPlayer()
    {
        assertNotNull(this.JuniorFootBallPlayer);
    }

    @Test
    public void checkingRichFootBallPlayer()
    {
        assertNotNull(this.RichFootBallPlayer);
    }

    @Test
    public void checkingRichBasketBallPlayer()
    {
        assertNotNull(this.RichBasketPlayer);
    }

    @Test
    public void sizeOfPlayers()
    {
        assertEquals(6,this.players.size());
    }

    @Test
    public void getListOfPlayerTypes()
    {
        assertEquals("BasketBallPlayer", this.players.get(0).getWhichTypeOfPlayer());
        assertEquals("FootBallPlayer",this.players.get(1).getWhichTypeOfPlayer());
        assertEquals("Junior BasketBallPlayer decorator",this.players.get(2).getWhichTypeOfPlayer());
        assertEquals("Junior FootBallPlayer decorator",this.players.get(3).getWhichTypeOfPlayer());
        assertEquals("Rich BasketBallPlayer decorator",this.players.get(4).getWhichTypeOfPlayer());
        assertEquals("Rich FootBallPlayer decorator",this.players.get(5).getWhichTypeOfPlayer());
    }

    @Test
    public void getPropertiesList()
    {
         for(PlayerInterface tmp : this.players)
         {
            SkillInterface skills=tmp.getSkills();
            for(Map.Entry<String,String> entry : skills.getSkill().entrySet())
            {
                String key=entry.getKey();
                String value=entry.getValue();
                if(key.equals("Speed"))
                {
                    assertEquals("Speed",key);
                    assertEquals("25",value);
                }
                else if(key.equals("color"))
                {
                    assertEquals("color",key);
                    assertEquals("red",value);
                }
                else if(key.equals("size"))
                {
                    assertEquals("size",key);
                    assertEquals("176",value);

                }
                else if(key.equals("weight"))
                {
                    assertEquals("weight",key);
                    assertEquals("85",value);
                }
                else
                {
                    fail("This key is not available");
                }

            }

         }
    }



}
