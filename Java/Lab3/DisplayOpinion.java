import javax.swing.JFrame;
public class DisplayOpinion {
      // main(): application entry point
      public static void main(String[] args) {
            JFrame w1 = new JFrame("Ask a question");
            Opinion myOpinion = new Opinion();
            w1.getContentPane().add(myOpinion);
            w1.pack();
            w1.setVisible(true);
      } //end main
}//end class