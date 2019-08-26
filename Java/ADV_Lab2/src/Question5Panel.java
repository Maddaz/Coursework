/******************************************
 * Lab 2 Advanced Programming
 * Question 5
 * Author: Mateusz Glogowski s4546642  
 ******************************************/

// import packages
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.*;
import javax.swing.border.* ;


// class 
public class Question5Panel extends JPanel implements ActionListener
{ 
  // data declarations
  private JLabel shapeLabel ;
  private JRadioButton circleButton ;
  private JRadioButton rectangleButton ;
  private ButtonGroup shape ;
  private JPanel selectShape ;
  
  private JLabel radius ;
  private JTextField radiusIn ;
  
  private JLabel rectangle ;
  
  private JLabel length ;
  private JTextField lengthIn ;
  private JLabel width ;
  private JTextField widthIn ;
  
  private JPanel westPanel ;
  private JPanel circlePanel ;
  private JPanel rectanglePanel ;
  
  private JPanel outputPanel ;
  private JTextArea output ;
  
  private Circle myCircle ;
  private Rectangle myRectangle ;
  
  //constructor to initiate data and set up GUI  
  public Question5Panel ( )
  {  setLayout (new BorderLayout ( ) );
  
    // setting up north area of GUI
     shapeLabel = new JLabel ("Please select a shape\n" );
     shapeLabel.setFont (new Font ("Arial", Font.BOLD, 16 ) );
    
     // organizing radio buttons and their behaviours
     circleButton = new JRadioButton ("Circle");
     rectangleButton = new JRadioButton ("Rectangle" );
     shape = new ButtonGroup( );
     shape.add ( circleButton );
     shape.add ( rectangleButton ) ;

     // adding components to panel to be located north in the GUI
     selectShape = new JPanel ( );
     selectShape.add ( shapeLabel ) ;
     selectShape.add ( circleButton );
     selectShape.add ( rectangleButton ) ;
     add (selectShape, BorderLayout.NORTH );
     
     //setting up west area of GUI
     westPanel = new JPanel ( ) ;
     
     // setting up components for the circlePanel of the GUI
     circlePanel = new JPanel ( ) ;
     radius = new JLabel ("radius is: " );
     radiusIn = new JTextField ( 10 );
     
     circlePanel.add ( radius ) ;
     circlePanel.add ( radiusIn ) ;
        
     TitledBorder circleBorder = BorderFactory.createTitledBorder ("Circle") ;
     circlePanel.setBorder ( circleBorder ) ;
     
     add (westPanel, BorderLayout.WEST );
     
      //setting up components for the rectanglePanel of GUI
     length = new JLabel ("length is: ");
     lengthIn = new JTextField ( 10 );
     
     width  = new JLabel ("width is: ") ;
     widthIn = new JTextField ( 10 );
     
     // adding components to the rectanglePanel of GUI
     rectanglePanel = new JPanel ( ); 
     rectanglePanel.add (length);
     rectanglePanel.add (lengthIn);
     rectanglePanel.add (width);
     rectanglePanel.add (widthIn);
     TitledBorder rectangleBorder = BorderFactory.createTitledBorder ( "Rectangle" ) ;
     rectanglePanel.setBorder ( rectangleBorder ) ;
     
     // adding the circlePanel and rectanglePanels into the westPanel
     westPanel.setLayout (new GridLayout (2,1) ) ;
     westPanel.setPreferredSize (new Dimension (200, 15)) ;
     westPanel.add ( circlePanel );
     westPanel.add ( rectanglePanel );
     
        
     // setting up centre area of GUI
     outputPanel = new JPanel ( ) ;
     output = new JTextArea ( 15,25) ;
     outputPanel.add (output) ;
     add (outputPanel, BorderLayout.CENTER);
     
     // add listeners to radio buttons
     circleButton.addActionListener (this) ;
     rectangleButton.addActionListener (this) ;
     
      //add listeners to all textfields
     radiusIn.addActionListener (this) ;
     lengthIn.addActionListener (this) ;
     widthIn.addActionListener (this) ;      
              
  } //end constructor
    
    
//***************************************************************************
//  Students to complete the functionality of the GUI through actionPerformed 
//***************************************************************************

     
  public void actionPerformed(ActionEvent e)
 {   
//***************************************************************************
// if radio button for a circle is selected
//          create myCircle using input data from  radiusIn textfield.  
//          If no data in radiusIn textfield create myCircle with a radius of 0.
//          Use various methods from class Circle to do the setting of text for the
//          text field output  
//***************************************************************************
 
	  if(e.getSource() == circleButton){
		  String result;
		  //Checking for empty radius box and creating object with 0 radius
		  if(radiusIn.getText().equals("")){
			  myCircle = new Circle(0);
		  }
		  else{
			  myCircle = new Circle(Double.parseDouble(radiusIn.getText()));
		  }
		  result = "Circle has a radius of " + myCircle.getRadius();
		  result += "\nand a perimeter of " + myCircle.findPerimeter();
		  result += "\nand a area of " + myCircle.findArea();
		  output.setText(result);
	  }

  //***************************************************************************
// if radio button for a rectangle is selected
//          create myRectangle using input data from  lengthIn textfield and the
//          widthIn textfield.  
//          If no data in lengthIn textfield create myRectangle with a length of 0.
//          If no data in widthIn textfield create myRectangle with a widtth of 0.
//          Use various methods from class Rectangle to do the setting of text for the
//          text field output  
//***************************************************************************
	  else if(e.getSource() == rectangleButton){
		  String result;
		  //Checking for empty input on width or length, default to 0 if either is empty
		  if(lengthIn.getText().equals("") || widthIn.getText().equals("")){
			  myRectangle = new Rectangle(0,0);
		  }
		  //Creating a Rectangle object using inputs from length and width boxes
		  else {
			  myRectangle = new Rectangle(Double.parseDouble(lengthIn.getText()), Double.parseDouble(widthIn.getText()));
		  }
		  //Storing String result in result and outputting to output text area
		  result = "Rectangle has a length of " + myRectangle.getLength();
		  result += "\nwith a width of " + myRectangle.getWidth();
		  result += "\nand a perimeter of " + myRectangle.findPerimeter();
		  result+= "\nand a area of " + myRectangle.findArea();
		  output.setText(result);
		
	  }


  
   }  //end of actionPerformed 
    
 } // end class
