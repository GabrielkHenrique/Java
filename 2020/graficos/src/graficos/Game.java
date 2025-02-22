package graficos;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	
	public static JFrame frame;
	private Thread thread;
	private boolean isRunning = true;
	private final int WIDHT = 160;
	private final int HEIGHT = 120;
	private final int SCALE = 3;
	public Game () {
    setPreferredSize(new Dimension(WIDHT*SCALE,HEIGHT*SCALE));
		initFrame();
	}
	
	
	public void initFrame () {
		frame = new JFrame("Game #1");
		frame.add(this);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
		public synchronized void start (){
			thread = new Thread(this);
			isRunning = true;
			thread.start();
			
			
			
			}
   
		public synchronized void stop(){
		
	}
	public static void main (String args []) {
		Game game = new Game();
		
	}
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
	    while (isRunning){
		long now = System.nanoTime();
		delta += (now -lastTime) /ns;
		
	}
		
	}

    }
