import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class world {
	
	static void gendown(String mapPath) throws SlickException
	{
		Image tile;
		int map[][] = serialize.deserialiser(mapPath);
	    int ligne = 31;
	    int tile1ereLigne= 16;
	    int couche = 3;
	    
	    
	    int i = 0;//Nbr de ligne
	    int j = 0;//Nbr carreau ligne
	    int k = 0;//Nbr de tiles
	    int l = 0;//Nbr de couche
	    while(l != couche)
	    {
		     while(i != ligne)
		     {
		    	 if (map[l][k]==0)
		    	 {
		    		 if (i % 2 == 0)
			    	 {
			    		 j+=1;
			    		 k+=1;
			    		 if(j==tile1ereLigne)
			        	 {
			    			 i+=1;
			    			 j=0;
			        	 }
			    	 }
			    	 //Lignes impair
			    	 if (i % 2 != 0)
			    	 {
			    		 j+=1;
			    		 k+=1;
			    		 if(j==tile1ereLigne-1)
			        	 {
			    			 i+=1;
			    			 j=0;
			        	 }
			    	 }
		    	 }
		    	 else{
		    	 String urlStr = "res/images/tiles/" + map[l][k] + ".png";
		    	 tile = new Image(urlStr);
		    	 
		    	 //Lignes pair
			    	 if (i % 2 == 0)
			    	 {
			    		 tile.draw(j*64,i*16-32);
			    		 j+=1;
			    		 k+=1;
			    		 if(j==tile1ereLigne)
			        	 {
			    			 i+=1;
			    			 j=0;
			        	 }
			    	 }
			    	 //Lignes impair
			    	 if (i % 2 != 0)
			    	 {
			    		 if(i!=ligne)
			    		 {
			    			 tile.draw(j*64+32,i*16-32);
			    		 }
			    		 j+=1;
			    		 k+=1;
			    		 if(j==tile1ereLigne-1)
			        	 {
			    			 i+=1;
			    			 j=0;
			        	 }
			    	 }
		    
		    	 }
	
		     }
		     i = 0;
		     j = 0;
		     k = 0;
		     l += 1;
	    }
	}
	static void genup(String mapPath) throws SlickException
	{
		Image tile;
		int map[][] = serialize.deserialiser(mapPath);
	    int ligne = 31;
	    int tile1ereLigne= 16;
	    int couche = 6;
	    
	    
	    int i = 0;//Nbr de ligne
	    int j = 0;//Nbr carreau ligne
	    int k = 0;//Nbr de tiles
	    int l = 3;//Nbr de couche
	    while(l != couche)
	    {
		     while(i != ligne)
		     {
		    	 if (map[l][k]==0)
		    	 {
		    		 if (i % 2 == 0)
			    	 {
			    		 j+=1;
			    		 k+=1;
			    		 if(j==tile1ereLigne)
			        	 {
			    			 i+=1;
			    			 j=0;
			        	 }
			    	 }
			    	 //Lignes impair
			    	 if (i % 2 != 0)
			    	 {
			    		 j+=1;
			    		 k+=1;
			    		 if(j==tile1ereLigne-1)
			        	 {
			    			 i+=1;
			    			 j=0;
			        	 }
			    	 }
		    	 }
		    	 else{
		    	 String urlStr = "res/images/tiles/" + map[l][k] + ".png";
		    	 tile = new Image(urlStr);
		    	 
		    	 //Lignes pair
			    	 if (i % 2 == 0)
			    	 {
			    		 tile.draw(j*64,i*16-32);
			    		 j+=1;
			    		 k+=1;
			    		 if(j==tile1ereLigne)
			        	 {
			    			 i+=1;
			    			 j=0;
			        	 }
			    	 }
			    	 //Lignes impair
			    	 if (i % 2 != 0)
			    	 {
			    		 if(i!=ligne)
			    		 {
			    			 tile.draw(j*64+32,i*16-32);
			    		 }
			    		 j+=1;
			    		 k+=1;
			    		 if(j==tile1ereLigne-1)
			        	 {
			    			 i+=1;
			    			 j=0;
			        	 }
			    	 }
		    
		    	 }
	
		     }
		     i = 0;
		     j = 0;
		     k = 0;
		     l += 1;
	    }
	}
}

