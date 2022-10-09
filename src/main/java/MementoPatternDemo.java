import java.util.Scanner;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Character player1 = new Character("Gandalf", "Wizard");
        CareTaker caretaker = new CareTaker();
        Memento memento = new Memento();

        Stats temp = Stats.generate();
        temp.print();
        memento = temp.saveStateToMemento();
        caretaker.add(memento);

        String answ;
        int tempId;

        for(int i =0; i<100; i++) {
            System.out.println("Do you want to change your attributes? (Yes or No)");
            answ = keyboard.nextLine();
            if (answ.equals("Yes")) {
                temp = Stats.generate();
                temp.print();
                memento = temp.saveStateToMemento();
                caretaker.add(memento);
            }
            else {
                player1.setAttr(temp);
                player1.printSheet();
                break;
            }
        }

        System.out.println("Do you want to load previous stats? (Yes or No)");
        answ = keyboard.nextLine();
        if (answ.equals("Yes")) {
            if(caretaker.getId() == 0) {
                System.out.println("You have nothing to load");
            }
            else {
                System.out.println("Enter id of save that you want to load(from 0 to " + caretaker.getId() + "):");
                while ((tempId = keyboard.nextInt()) > caretaker.getId()) {
                    System.out.println("Enter the correct id:");
                }
                temp.getSateFromMemento((Memento) caretaker.get(tempId));
                player1.setAttr(temp);
                player1.printSheet();
            }
        }
    }
}
