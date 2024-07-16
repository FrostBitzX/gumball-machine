//Mr.Yossawaj Bowonsrithananon ID:6510450879
public class outOfGumball implements State{
    gumballMachine gumballMachine;

    public outOfGumball(gumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispenseGumball() {
        //nothing
    }

    @Override
    public void choose(String flavor) {
        System.out.println("Oops, out of gumballs!");
    }
}
