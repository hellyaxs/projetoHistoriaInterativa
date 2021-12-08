import java.util.ArrayList;

abstract class playerAbtract {

    protected String name;
    protected int life;
    protected int energy;
    protected Energy alt;
    protected ArrayList<Player> allies;
    protected ArrayList<Player> inimigos;
    protected Position positionplay;
  

  public void setEnergy(Energy energia){

   if(this.energy >=100)
   {
      this.energy = 100;
   }
   else if(this.energy<0)
   {
      this.energy = 0;
   }
   else
   {
      this.energy += (int)energia.getLife()/4;
   } 
   
   if(this.life>=100)
   {
     this.life = 100;
   }
   else
   {
     this.life +=energia.getLife();
   }
   
   this.positionplay.x = energia.getPositionX();
   this.positionplay.y = energia.getPositionY();
  }
  
  public String getName(){
      return name;
  }
  
  public void setLife(int life){
    if(this.life>=100)
   {
     this.life = 100;
   }
   else
   {
     this.life +=life;
   }
  }
  public int getLife(){
    return life;
  }

   public int getEnergy(){
    return energy;
  }
  
  public ArrayList<Player> getInimigos(){
    return inimigos;
  }

  void setPosition(Position v){
     positionplay.setPosition(v.x,v.y);
  }
  void setPositionXY(int x,int y){
     positionplay.setPosition(x,y);
  }

  Position getPosition(){
    return positionplay;
  }


 
 

}
