package onetest.one;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

	

	

		public class SidePanelTest {

		    private SidePanel sidePanel;
		    private SnakeGame snakeGame;
		    
			 Thread gameThread = new Thread(() -> {
			       snakeGame.startGame(); // Method that starts the game loop
			    });

		    @Before
		    public void setUp() {
		    	snakeGame = new SnakeGame();
		    sidePanel = new SidePanel(snakeGame);
		    }
		    
		    @Test
		    public void SidePanelNotNULL(){
		    	assertNotNull(sidePanel);
		    }
		    
		   
		}