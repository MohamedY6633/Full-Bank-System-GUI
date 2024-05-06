public class App {
    public static void main(String[] args) throws Exception {
        GUI s = new GUI();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new GUI().setVisible(true);
            }
        });
    }
}
