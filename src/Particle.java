import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Particle 
{
	public double x,y;
	private double speed;
	private double angle;
	private double xR;
	private double yR;

	private float red;
	private float green;
	private float blue;
	private boolean toggle;
	public float alpha;
	
	
	public Particle()
	{
		speed = Math.random() * 20.0;
		angle = Math.random() * 60 + 60.0;
		
		red = (float)Math.random();
		green = (float)Math.random();
		blue = (float)Math.random();
		
		alpha = 1.0f;
	}
	
	public Particle(int x2, int y2, boolean colour, boolean normal) {
		this.x = x2;
		this.y = y2;
		int min = 1;
		int max = 4;
		//Gives random speed to the particle
		speed = (Math.random() * (max - min) + min)* 20.0;
		angle = (Math.random() * (max - min) + min)* 60 + 60.0;
		//Gives a random direction to the particle
		xR = (Math.random() * (max - min) + min);
		yR = (Math.random() * (max - min) + min);
		if(colour) red=(float)Math.random();
		else red=1;
		if(colour)green=(float)Math.random();
		else green=1;
		if(colour)blue=(float)Math.random();
		else blue=1;
		alpha = 1.0f;
		toggle = normal;
	}
	
	
	public void update()
	{
		//direction depends on the random number generator
		if(xR<=2)x -= (speed * Math.cos((3.14/180)*angle))/21;
		else x += (speed * Math.cos((3.14/180)*angle))/27;
		if(yR<=2)y += (speed * Math.sin((3.14/180)*angle))/27;
		else y -= (speed * Math.sin((3.14/180)*angle))/27;
		alpha -= 0.01f;
		alpha = Math.max(0,alpha);
	}
	
	
	public void draw(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		if(toggle){
			Ellipse2D.Double ellipse = new Ellipse2D.Double(x,y,35,35);
			g2.setColor(new Color(red, green, blue, alpha));
			g2.fill(ellipse);
//			int xS=(int)x;
//			int yS=(int)y;
//			g2.drawString("LOL!", xS, yS);
			}
		else{
			Rectangle2D.Double ellipse = new Rectangle2D.Double(x,y,10,10);
			g2.setColor(new Color(red, green, blue, alpha));
			g2.fill(ellipse);
			}
		
		
	}
	
}