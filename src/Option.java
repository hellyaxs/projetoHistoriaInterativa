public class Option{
    private String keyword;
    private String text;
    private int abilityDamage;
    private int energyDamage;
    private boolean valor;
    
    public Option(String text, int abilityDamage, boolean valor){
      this.text = text;
      this.valor = valor;
      this.abilityDamage = abilityDamage;
  
    }
    public String getText(){
      return text;
    }
  
    public String getKeyWord(){
      return keyword;
    }
  
    public int getAbilityDamage(){
        return abilityDamage;
    }
    
    public int getEnergyDamage(){
      return energyDamage;
    }
  }
  
