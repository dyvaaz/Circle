package lingkaran;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author DIF
 */
public class Garis extends JPanel {
    //Menentukan titik pusat dan radiusnya
    private int xc,yc,r;

    //get dan set untuk titik pusat dan radiusnya
    public int getxc() {
        return xc;
    }

    public int getyc() {
        return yc;
    }

    public int getR() {
        return r;
    }

    public void setxc(int xa) {
        xc = xa;
    }

    public void setyc(int ya) {
        yc = ya;
    }

    
    public void setR(int radius) {
        r = radius;
    }
    //hitung p awal dan set nilai awal untuk x dan y
    public void paintComponent(Graphics g) {   
        int p = 1-r;
        int x = 0; // P awal (0,r)
        int y = r;

        while(x<=y) {
            x++; //karena nilai x akan selalu tambah 1 terus menerus
            if (p<0) 
            {
               p += 2*x+1; //hitung p selanjutnya jika p < 0
            }
           
            else
            {
                y--; // nilai y akan - 1
                p += 2*(x-y)+1; //hitung p selanjutnya jika p>0 atau p = 0
            }
            //translasi terhadap titik pusat dan cerminkan
            g.drawRect(xc+x, yc+y, 1, 1);
            g.drawRect(xc-x, yc+y, 1, 1);
            g.drawRect(xc+x, yc-y, 1, 1);
            g.drawRect(xc-x, yc-y, 1, 1);
            g.drawRect(xc+y, yc+x, 1, 1);
            g.drawRect(xc-y, yc+x, 1, 1);
            g.drawRect(xc+y, yc-x, 1, 1);
            g.drawRect(xc-y, yc-x, 1, 1);
        }
    }
}
