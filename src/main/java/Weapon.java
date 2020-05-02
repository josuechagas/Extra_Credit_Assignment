class Weapon
{
   //name: name of the weapom
   //type: attack or defence
   String name, type;
  
   //attack: damage of the weapon 
   //cost: cost to buy it
   int attack, cost;
  
   //Gets and sets the name, type and the attack cost

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getType() {
       return type;
   }

   public void setType(String type) {
       this.type = type;
   }

   public int getAttack() {
       return attack;
   }

   public void setAttack(int attack) {
       this.attack = attack;
   }

   public int getCost() {
       return cost;
   }

   public void setCost(int cost) {
       this.cost = cost;
   }
  
   //Default Constructor

   public Weapon() {
      
       name = "";
       type = "";
       attack = 0;
       cost = 0;
   }
  
   //Argument constructor
   public Weapon(String name, String type, int attack, int cost) {
       this.name = name;
       this.type = type;
       this.attack = attack;
       this.cost = cost;
   }
  
  //Extra method to double the attack
   public void doubleWeaponAttack()
   {
       attack = attack*2;
   }
  
  
}
