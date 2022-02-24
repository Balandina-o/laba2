package laba4;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Image extends JComponent {

	private BufferedImage image;
    private java.awt.Image src;
    public Image() {
        // получаем изображение и проверяем на доступность
        try
        {
        	image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("USATUlogo.jpg"));
            src=image.getScaledInstance(100,100,java.awt.Image.SCALE_AREA_AVERAGING);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g)
    {
        if(src == null) return;
        // тображение рисунка в левом верхнем углу.
        g.drawImage(src,0,0,100,100,null);
    }
}
