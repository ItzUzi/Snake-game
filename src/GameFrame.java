import javax.swing.JFrame;

public class GameFrame extends JFrame{
    
    GameFrame(){
        
        GamePanel panell = new GamePanel();
        
        this.add(panell);
        this.setTitle("Java Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}