import  java.awt.event.*;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.Timer;


public class GamePanel extends JPanel implements ActionListener{

    static final int SCREEN_W = 800;
    static final int SCEEEN_H = 800;
    static final int UNIT_SIZE =20;
    static final int GAME_UNITS = (SCREEN_W * SCEEEN_H) / UNIT_SIZE;
    static int  x[] = new int[GAME_UNITS];
    static int y[] = new int[GAME_UNITS];
    static final int DELAY = 75;
    Random random;
    
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;

     //creating construct for our game pannel
     GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_W, SCEEEN_H));
        this.setBackground(Color.white);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
     }

     public void startGame(){
            newApple();
            running = true;
            // timer = new Timer(DELAY,this);
            // Timer.start()

     }

     public void paintComponet(Graphics g){

     }

     public void draw(Graphics g){

     }

     public void newApple(){

     }
     public void move(){

     }
     public void  checkApple(){

     }
     public void checkCollitions(){

     }
     public void GameOver(Graphics g){

     }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    public class MyKeyAdapter extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
            
        }
    }
    
}
