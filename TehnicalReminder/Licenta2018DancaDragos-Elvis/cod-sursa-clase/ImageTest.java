package frames;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageTest {

  public static void main(String[] args) {
    ImagePanel panel = new ImagePanel(new ImageIcon("C:\\Users\\HP\\Desktop\\imgg.jpg").getImage());
    panel.setOpaque(true);
    JFrame frame = new JFrame();
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}

class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(1700,900 );
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
    
  }

}