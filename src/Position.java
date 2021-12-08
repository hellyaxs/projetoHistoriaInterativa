public class Position{
  
  public int x;
  public int y;

 Position(int x,int y){
    this.x = x;
    this.y = y;
  }

 void setPosition(int x, int y){
   this.x = x;
   this.y = y;
}
 public Position substrair(Position p){
   
   Position result = new Position(0,0);
     result.x = this.x - p.x;
     result.y = this.y - p.y;
  
    return result;
  }
  public Position somar(Position p){
   
    Position result = new Position(0,0);
      result.x = this.x + p.x;
      result.y = this.y + p.y;
   
     return result;
   }

 int PositionX(){
   return x;
 } 
 int PositionY(){
   return y;
 } 
 void setPositionAbsolute(Position c){
   this.x = c.x;
   this.y = c.y;
}


}