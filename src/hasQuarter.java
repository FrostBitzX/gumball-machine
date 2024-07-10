//Mr.Yossawaj Bowonsrithananon ID:6510450879
public class hasQuarter implements State{
    gumballMachine gumballMachine;
    public hasQuarter(gumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getGumballSold());
    }

    @Override
    public void dispenseGumball() {
        //nothing
    }
}
