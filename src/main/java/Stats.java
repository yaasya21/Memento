public class Stats {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Stats() {

    }

    public static Stats generate() {
        return new Stats(Dice.roll(), Dice.roll(), Dice.roll(), Dice.roll(), Dice.roll(), Dice.roll());
    }

    public Stats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public int getStr() {
        return strength;
    }

    public int getDex() {
        return dexterity;
    }

    public int getCons() {
        return constitution;
    }

    public int getIntl() {
        return intelligence;
    }

    public int getWis() {
        return wisdom;
    }

    public int getChr() {
        return charisma;
    }

    public Memento saveStateToMemento() {
        return new Memento(this.strength, this.dexterity, this.constitution, this.intelligence, this.wisdom, this.charisma);
    }


    public void getSateFromMemento(Memento memento) {
        Stats mementoState = memento.getStats();
        this.strength = mementoState.strength;
        this.dexterity = mementoState.dexterity;
        this.constitution = mementoState.constitution;
        this.intelligence = mementoState.intelligence;
        this.wisdom = mementoState.wisdom;
        this.charisma = mementoState.charisma;
    }

    public void print() {
        System.out.println("~~~~~attributes~~~~~" +
                        "\nstrength: " + strength +
                        "\ndexterity: " + dexterity +
                        "\nconstitution: " + constitution +
                        "\nintelligence: " + intelligence +
                        "\nwisdom: " + wisdom +
                        "\ncharisma: " + charisma);
    }
}
