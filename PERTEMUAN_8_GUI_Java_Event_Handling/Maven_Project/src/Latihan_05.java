import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;


public class Latihan_05 extends JPanel implements KeyListener {
    private int x = 150, y = 150; 
    private int step = 10;        
    private Image image1, image2; 
    private boolean imageToggle = true; 
    
    public Latihan_05() {
        setFocusable(true);
        addKeyListener(this);
        
        
        image1 = new ImageIcon(getClass().getResource("/images/image1.png")).getImage();
        image2 = new ImageIcon(getClass().getResource("/images/image2.png")).getImage();
        
        URL imageUrl1 = getClass().getResource("/images/image1.png");
        URL imageUrl2 = getClass().getResource("/images/image2.png");

        if (imageUrl1 != null && imageUrl2 != null) {
            image1 = new ImageIcon(imageUrl1).getImage();
            image2 = new ImageIcon(imageUrl2).getImage();
        } else {
            System.out.println("Gambar tidak ditemukan!");
        }


    }

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image currentImage = imageToggle ? image1 : image2;
        g.drawImage(currentImage, x, y, this);
    }

    
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        
        switch (key) {
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                x = Math.max(x - step, 0); 
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                x = Math.min(x + step, getWidth() - 50); 
                break;
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                y = Math.max(y - step, 0); 
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                y = Math.min(y + step, getHeight() - 50); 
                break;
        }

        
        if (x <= 0 || x >= getWidth() - 50 || y <= 0 || y >= getHeight() - 50) {
            imageToggle = !imageToggle;
        }

        repaint(); 
    }

    
    public void keyReleased(KeyEvent e) {}

    
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener");
        Latihan_05 panel = new Latihan_05();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
