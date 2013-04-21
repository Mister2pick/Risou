import java.io.*;

import org.newdawn.slick.*;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
public class main extends StateBasedGame
{
  Image tile;
  static AppGameContainer app;
  private Entity player;
  
  public main()
  {
     super("Hello World");
  }
 
  @Override
  public void initStatesList(GameContainer gc) throws SlickException
  {
	  player = new Entity();
	  addState((GameState)player);
  }
 

@Override
  public void update(GameContainer gc, int delta) throws SlickException
  {
	  
  }
 
  @Override
  public void render(GameContainer gc, Graphics g) throws SlickException
  {
	  //world.gen("1.map");
  }
 
  public static void main(String[] args) throws SlickException
  {
     app = new AppGameContainer(new main());
	 int maxFPS = 60;
	  
     app.setDisplayMode(1024, 720, false);
     app.setTargetFrameRate(maxFPS);
     app.start();
  }
}