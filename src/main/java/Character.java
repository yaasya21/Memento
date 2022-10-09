public class Character {
    private String name;
    private String dndclass;
    private Stats attributes;

    Character(String name, String dndclass) {
        this.name = name;
        this.dndclass = dndclass;
    }

    public void setAttr(Stats attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public String getDndcl() {
        return dndclass;
    }

    public Stats getAttr() {
        return attributes;
    }

    public void printSheet() {
        System.out.println("Name " + name + "\nClass " + dndclass);
        attributes.print();
    }
}
