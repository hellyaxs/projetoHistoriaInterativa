public class Energy {

  private int energy;
  private int life;
  private Position position;

  public void setEnergy(int energy) {
    this.energy = energy;
  }

  public void setLife(int life) {
    this.life = life;
  }

  public int getLife() {
    return life;
  }

  public int getEnergy() {
    return energy;
  }
  
  public void setPosition(int x,int y){
    this.position = new Position();
    this.position.setPosition(x, y);
  }

  public int getPositionX()
  {
    return position.x;
  }
  
  public int getPositionY()
  {
    return position.y;
  }

 
}