package package1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class CercleDebutImage extends CercleDebut {

	/**
     * l'image a afficher pour le d�but de cercle
     */
    private final BufferedImage img;
    
    /**
     * 
     * @param xInit abscisse initial du centre du cerlce de d�but
     * @param yInit ordonn�es intiial du centre du cerlce de d�but
     * @param pointe la pointe initialdu cerlce de d�but
     * @param img l'image du cerlce de d�but
     */
    public CercleDebutImage(int xInit, int yInit, int cap, BufferedImage img) {
        super(xInit, yInit, img.getWidth() /2 , cap);
        this.img = img;
    }

    // redéfinition de la méthode dessiner
    
    @Override
    public void dessiner(Graphics g) {
        g.drawImage(img, 
                this.x - r, this.y - r, this.x + r, this.y + r,
                0, 0, 63, 63, null);
    }
	
}
