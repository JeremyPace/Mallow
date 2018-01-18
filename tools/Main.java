import javax.swing.JFrame;
public class Settings();

   public static void main(String[] args) {
   
     private void createWindow(boolean tf, String name, int x, int y) 
     {
       if (tf == true) 
       {
         window(tf, name, x, y);
       }  
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
