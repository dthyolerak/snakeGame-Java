import javax.swing.JFrame;

public class GameFrame extends JFrame {
    //creating construct for our gameframe
    GameFrame(){

        GamePanel Panel = new GamePanel();
        this.add(Panel); // you can do :  this.add(new GamePanel());
        this.setTitle("Snake Game"); // giving title of game
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 10, 800, 800); // setting size of our screen
        this.setResizable(false); 
        this.pack();
        this.setLocationRelativeTo(null); // to be centered 
        this.setVisible(true);


    }
}
