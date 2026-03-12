public class Del3 {
/*
Interfaces:
Mange af mine klasser har noget tilfælles:
- Alle items (Weapon, Armor, Potion) har et navn.
- Nogle kan bruges (fx heal, skade, defense).

Man kunne lave et interface som f.eks.:
public interface Usable {
    void use(Character target); //hvad sker der, når man bruger det
}

Fordel: Man kan håndtere alle items ens uden at tjekke deres type.


Polymorfi:
Der er steder, hvor jeg behandler objekter ens:
  - attack(Character enemy) → alle Characters kan angribes på samme måde
  - heal(), takeDamage(), addGold() → alle Characters kan bruges på samme måde
  - removeItem() → alle items i inventory kan håndteres på samme måde

Hvis alle items implementerede et interface, kunne man f.eks. loope gennem inventory og bruge:
for (InventoryItem item : inventory) {
    item.use(this); //virker på alle typer af items
}

Polymorfi betyder altså: man behøver ikke vide præcis hvilken type et objekt er, man kalder bare metoden, og Java sørger for den rigtige version bliver brugt.
*/
}
