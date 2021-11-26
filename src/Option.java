public class Option{

    private String keyword;
    private String text;
    private int abilityDamage;
    private int energyDamage;
    private boolean valor;
    
    public Option(String text, int abilityDamage, boolean valor,String key){
      
      this.text = text;
      this.valor = valor;
      this.abilityDamage = abilityDamage;
      this.keyword = key;
  
    }
    public String getText(){
      return text;
    }
  
    public String getKeyWord(){
      return this.keyword;
    }
  
    public int getAbilityDamage(){
        return abilityDamage;
    }
    
    public int getEnergyDamage(){
      return energyDamage;
    }
  }
  
