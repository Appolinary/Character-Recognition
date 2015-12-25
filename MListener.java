import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MListener  implements MouseMotionListener,MouseListener{
	
  private final DrawingPanel.DPanel panel;
  private int startPositionY;
  private int startPositionX;
  private int endPositionX;
  private int endPositionY;
  
	
	public MListener(DrawingPanel.DPanel panel){
		this.panel = panel;
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		endPositionX = e.getX();
		endPositionY =  e.getY();
		
		drawLine();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		startPositionX = e.getX();
		startPositionY =  e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void drawLine(){
		panel.draw(startPositionX, startPositionY, endPositionX, endPositionY);
		startPositionX = endPositionX;
		startPositionY = endPositionY;
	}

}
