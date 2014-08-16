public class Flower
{
   private int x;
   private int y;
   
   public Flower(int theX, int theY)
   {
   
      this.x = theX;
      this.y = theY;
   }

   public void draw()
   {
       
      Ellipse circle2 = new Ellipse(x + 20, y, 20, 20);
      circle2.setColor(Color.PINK);
      circle2.fill();
      Ellipse circle = new Ellipse(x, y + 20, 20, 20);
      circle.setColor(Color.PINK);
      circle.fill();
      Ellipse circle3 = new Ellipse(x + 20, y + 20, 20, 20);
      circle3.setColor(Color.YELLOW);
      circle3.fill();
      Ellipse circle9 = new Ellipse(x + 40, y + 20, 20, 20);
      circle9.setColor(Color.PINK);
      circle9.fill();
      Ellipse circle4 = new Ellipse(x + 20, y + 40, 20, 20);
      circle4.setColor(Color.PINK);
      circle4.fill();
            
       
      Line line = new Line(x + 30, y + 60, x + 30, y + 120);
      line.setColor(Color.GREEN);
      line.draw();
    
       

   }
}