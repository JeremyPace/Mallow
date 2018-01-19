import javax.swing.JFrame;
public class Main();

   public static void main(String[] args) {
   
     private void createWindow(String name, int x, int y) 
     {
        window(name, x, y);
     }
    private void window(String title, int x, int y) 
    {
      
      JFrame frame = new JFrame();
      frame.setTitle(title);
      frame.setSize(x, y);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
    }
   
} 
