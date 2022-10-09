public class Memento {
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;

    public Memento() {
    }

    Memento(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Stats getStats() {
        return new Stats(strength,dexterity,constitution,intelligence,wisdom,charisma);
    }

}
