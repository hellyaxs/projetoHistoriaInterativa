import java.util.ArrayList;

abstract class playerAbtract {

    protected Energy myEnergy;
    protected String name;
    protected int life;
    protected int energy;
    protected ArrayList<Player> allies;
    protected ArrayList<Player> inimigos;
    protected int linha;
    protected int coluna;
 
  public void setEnergy(Energy energia){
   this.energy += energia.getEnergy();
   this.life += energia.getLife();

  }
  
  public void setLife(int life){
    this.life = life;
  }
  public int getLife(){
    return this.life;
  }
   public int getEnergy(){
    return energy;
  }
  public int getLinha(){
    return linha;
  }
  public int getColuna(){
    return coluna;
  }
  
  public void setLinha(int linha){
    this.linha = linha;
  }
  
   public void setColuna(int coluna){
    this.coluna = coluna;
  }
  public ArrayList<Player> getInimigos(){
    return this.inimigos;
  }

}
