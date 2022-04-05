import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(127, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
  fill(255,255,255);
  ellipse(300,150,150,150);
  fill(255,255,255);
  ellipse(300,348,250,250);
  fill(0,0,0);
  rect(296,290,8,10);
  fill(0,0,0);
  rect(296,320,8,10);
  fill(0,0,0);
  rect(296,350,8,10);
  fill(150,150,150);
  ellipse(270,135,15,15);
  fill(150,150,150);
  ellipse(330,135,15,15);
  fill(255,255,0);
  ellipse(600,0,150,150);
  fill(255,255,255);
  rect(0, 450, 1000, 1000);
  fill(255,0,0);
  triangle(200, 100, 400, 100, 300, 40);
}
  
  // define other methods down here.
}