import org.newdawn.slick.*;
import org.newdawn.slick.GameContainer;  
import org.newdawn.slick.Graphics;  
import org.newdawn.slick.SlickException;  
import org.newdawn.slick.state.BasicGameState;  
import org.newdawn.slick.state.StateBasedGame;

public class Entity
{  
           
        private float x= 200, y = 200, i=1, pas=3;
        private SpriteSheet heroH, heroB,heroL,heroR;
        private Animation courirVbas,courirVhaut,courirVgauche,courirVdroite;
        private Image heroRB, heroRH, heroRL, heroRR;
        private boolean isRunningH=false,isRunningB=false,isRunningL=false,isRunningR=false,
                isReposH=false,isReposB=true, isReposL=false, isReposR=false;
        public static final int ID = 1; 
        
  public int getID() {return ID;}

  public void init() throws SlickException
  {
      
      
      heroB = new SpriteSheet("res/images/sprites/HerosB.png", 32,32);
      heroH = new SpriteSheet("res/images/sprites/HerosH.png", 32,32);
      heroL = new SpriteSheet("res/images/sprites/HerosL.png", 32,32);
      heroR = new SpriteSheet("res/images/sprites/HerosR.png", 32,32);
      
      courirVbas = new Animation(heroB,0,0,1,0,true,250,true);
      heroRB = heroB.getSprite(0, 0);
      
      courirVhaut = new Animation(heroH,0,0,1,0,true,250,true);
      heroRH = heroH.getSprite(0, 0);
      
      courirVgauche = new Animation(heroL,0,0,1,0,true,250,true);
      heroRL = heroL.getSprite(0, 0);
      
      courirVdroite= new Animation(heroR,0,0,1,0,true,250,true);
      heroRR = heroR.getSprite(0, 0);
  }
 
  public void update(Input input) throws SlickException
  {
      
    if ( input.isKeyDown(Input.KEY_UP))
       {
           y-= pas;
           i=1;
           isRunningH=true;
           isReposH=false;
       }
    else if( input.isKeyDown(Input.KEY_DOWN))
       {
           y+= pas;
           i=2;
           isRunningB=true;
           isReposB=false;
       }
    else if(input.isKeyDown(Input.KEY_LEFT)){
        x-= pas;
        i=3;
        isRunningL=true;
        isReposL=false;
    }
    else if(input.isKeyDown(Input.KEY_RIGHT)){
        x+= pas;
        i=4;
        isRunningR=true;
        isReposR=false;
    }
    else {
        if(i==1){
           isRunningH=false;
           isRunningB=false;
           isRunningL=false;
           isRunningR=false;
           isReposR=false;
           isReposB=false;
           isReposL=false;
           isReposH=true;
        }
        else if(i==2){
           isRunningB=false;
           isRunningH=false;
           isRunningL=false;
           isRunningR=false;
           isReposR=false;
           isReposH=false;
           isReposL=false;
           isReposB=true;
        }
        else if(i==3){
           isRunningB=false;
           isRunningH=false;
           isRunningL=false;
           isRunningR=false;
           isReposR=false;
           isReposH=false;
           isReposB=false;
           isReposL=true;
        }
        else if(i==4){
           isRunningB=false;
           isRunningH=false;
           isRunningL=false;
           isRunningR=false;
           isReposR=true;
           isReposH=false;
           isReposB=false;
           isReposL=false;
        }
        else{
            
        }
    }
      
  }
 
  public void render() throws SlickException
  {
      //si personnage marche
      if(isRunningH){
            courirVhaut.draw(x, y);   
         }
      else if(isRunningB){
          courirVbas.draw(x,y);
      }
      else if(isRunningL){
          courirVgauche.draw(x,y);
      }
      else if(isRunningR){
          courirVdroite.draw(x,y);
      }
      
      //si personnage repos
      else if(isReposH){
          heroRH.draw(x,y);
      }
      else if(isReposB){
          heroRB.draw(x,y);
      }
      else if(isReposL){
          heroRL.draw(x,y);
      }
      else if(isReposR){
          heroRR.draw(x,y);
      }
      else{
      }
  }
}