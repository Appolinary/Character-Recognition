import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingPanel {
	
	public static  class DPanel extends JPanel{
		
		private Image image;
		private Graphics imageGraphics;
	
		private static final long serialVersionUID = 1L;
		private MListener listener; 
		private int startX;
		private int startY;
		private int endX;
		private int endY;
		
		public DPanel(){
			
			listener = new MListener(this);
			setFocusable(true);
			addMouseMotionListener(listener);
			addMouseListener(listener);
			
			
		}
		private void initImage() {
			image = createImage(getBounds().width, getBounds().height);
			imageGraphics = image.getGraphics();
			imageGraphics.setColor(Color.white);
			imageGraphics.fillRect(0, 0, getBounds().width, getBounds().height);
			
		}
		@Override
		public void paintComponent(Graphics g){
			if(image == null){
				initImage();
			}
			
			image.getGraphics().setColor(Color.red);
			image.getGraphics().drawLine(startX, startY, endX, endY);
			
			g.drawImage(image,0, 0,this);

			
		}
		
		public void draw(int x, int y, int x2, int y2){
			startX = x;
			startY = y;
			endX = x2;
			endY = y2;
			
			repaint();
		}
		
		
	}
	public static void main(String args[]){
		
		JFrame frame = new JFrame("NiiMs.inc");
		frame.setSize(400,400);
		frame.setContentPane(new DPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 300);
		frame.setVisible(true);
		
	}

}
