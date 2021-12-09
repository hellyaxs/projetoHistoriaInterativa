import java.util.ArrayList;
abstract class playerAbtract {

    protected String name;
    protected int life;
    protected int energy;
    protected ArrayList<Player> allies;
    protected ArrayList<Player> inimigos;
    protected Position positionplay;
  
  public void setEnergy(Energy energia){

      if(this.energy<100 && this.energy>=0)
      {
          this.energy += (int) energia.getLife()/4;
      }
      else 
      {   
          this.energy = 100;
      }
 
      if(this.life<100 && this.life>=0)
      {
        this.life += energia.getLife();
      }
      else if(this.life ==100)
      {
        if(energia.getLife()>=0){
          this.life = 100;
        }else{
          this.life += energia.getLife();
        }
      }
      else
      {
        this.life = 100;
      }
      this.positionplay.x = energia.getPositionX();
      this.positionplay.y = energia.getPositionY();
  }
  
  public String getName(){
      return name;
  }

  public void setEnergyjust(int energy){

    if(this.energy >=100)
      {
          this.energy = 100;
      }
      else if(this.energy<0)
      {
          this.energy = 0;
      }else{
        this.energy +=energy;
      }
  }

  public void setLife(int life){
    if(this.life>100) {
     this.life = 100;
   }
   else
   {
     this.life += life;
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

  public void setPosition(Position v){
     positionplay.setPosition(v.x,v.y);
  }
  public void setPositionXY(int x,int y){
     positionplay.setPosition(x,y);
  }

  Position getPosition(){
    return positionplay;
  }
}
