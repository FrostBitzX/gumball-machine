//Mr.Yossawaj Bowonsrithananon ID:6510450879
public class noQuarter implements State{
    gumballMachine gumballMachine;

    public noQuarter(gumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.getHasQuarter());
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("Please pay first");
    }
}
