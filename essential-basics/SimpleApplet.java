import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
//oublic class so that AppletViewer can access it
public class SimpleApplet extends Applet{
	String text = "I'm a simple applet";

	public void init(){
		text = "I'm a simple applet";
		setBackground(Color.cyan);
	}
	public void start(){
		System.out.println("starting...");
	}
	public void stop(){
		System.out.println("stopping...");
	}
	public void destroy(){
		System.out.println("preparing to unlaod...");
	}
	public void paint(Graphics g){
		System.out.println("paint");
		g.setColor(Color.blue);
		g.drawRect(0,0,getSize().width-1,getSize().height-1);
		g.setColor(Color.red);
		g.drawString(text,15,25);
	}
}

/*
extended class: to write a new class that can use the fields and methods defined in the class 
that is being extended.


init: one time operations. creating user interface or font.etc. 
start: when the app is visited. such as when the end user foes to a web ae with an app onit
eg.such as begin animation or play sounds

stop and destroy method:
stop method stops the app when the end user goes to another diff page. 
destroy method is called when the user exits the browser
to clean up threads. 

packages:
you can import them either from ready-made JAVA API classes packages. 
they come from java platform download. 
or classes you write yourself and store in a directory separate from the program.




*/