/*<APPLET CODE="titol.java" width=460 height=200>
</APPLET>*/
import java.io.*;
import java.applet.*;
import java.awt.*;

// ADSL Web Page
// Javara Factory Entertainment
// 2001-2026
// Efecto de titulo en el applet
// Leer readme.html

public class titol extends Applet{
        //Definir, declarar objetos.
                Color c, tronja;
                int x,y;
                Dimension d;
                Font letra;
                Panel barra;
		Thread retras;
        public void init(){
                retras=Thread.currentThread();
        }
        public void start(){
                //iniciar variables
                x=0;
                y=5;
                d=size();
                tronja=new Color(255,125,0);
                barra=new Panel();
        }
        public void paint (Graphics g){
                //Dibujar o pintar
                for (x=1;x<100;x++){
                        for (y=0;y<200;y++){
                                c = new Color (0,0,y);
                                g.setColor(c);
                                g.drawLine(0,y,d.width,y); 
                        }
                        letra=new Font("Arial", Font.BOLD, 50);
                        g.setFont(letra);
                        g.setColor(tronja);
                        g.drawString("ADSL Web Page", 35,250-x);
                        //Leer readme.html
                        try{
                                retras.sleep(50);
                        }catch(InterruptedException e){}
                }
                for (x=0;x<100;x++){
                        for (y=0;y<200;y++){ 
                        //(byte)(y*n�) es xa poder multiplicar la x por un real
                                c = new Color (0,0,y);
                                g.setColor(c);
                                g.drawLine(0,y,d.width,y);
                        }
                        letra=new Font("Arial", Font.BOLD, (50-(byte)(x*0.5)));
                        g.setFont(letra);
                        g.setColor(tronja);
                        g.drawString("ADSL Web Page", 35+x*2,150-x);
                        letra=new Font("Arial", Font.BOLD, 50);
                        g.setFont(letra);
                        g.setColor(tronja);
                        g.drawString("Aran Factory Web", 15,250-x);
                        //Leer readme.html
                        try{
                                retras.sleep(100);
			}catch(InterruptedException e){}
                }
                for (x=0;x<25;x++){
                        for (y=0;y<200;y++){ 
                        //(byte)(y*n�) es xa poder multiplicar la x por un real
                                c = new Color (0,0,y);
                                g.setColor(c);
                                g.drawLine(0,y,d.width,y);
                        }
                        letra=new Font("Arial", Font.BOLD, 50);
                        g.setFont(letra);
                        g.setColor(tronja);
                        g.drawString("Aran Factory Web", 15,150-x);
                        //Leer readme.html
                        try{
                                retras.sleep(100);
			}catch(InterruptedException e){}
                }
                
        }
}
