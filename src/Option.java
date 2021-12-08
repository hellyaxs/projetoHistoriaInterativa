public class Option{
  //esta class e reponsavel pelas opções que o player deve ter em cada capitulos alem de alterar sua energia e vida dependo da escolha do player

    private String keyword;    //texto que ele deve digitar para proseguir
    private String text;       //opção 
    private int abilityDamage; //dano/ganho na vida do player 
    private int energyDamage;  //dano/ganho na energia do player
    
   

  
    public Option(String text, int abilityDamage,String key){
      this.text = text;
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
  
