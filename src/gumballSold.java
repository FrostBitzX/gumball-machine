//Mr.Yossawaj Bowonsrithananon ID:6510450879
public class gumballSold implements State{
    gumballMachine gumballMachine;

    public gumballSold(gumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        //nothing
    }

    @Override
    public void dispenseGumball() {
        if(gumballMachine.getCount() > 0){
            System.out.println("A gumball comes rolling out the slot");
            gumballMachine.setCount(gumballMachine.getCount() - 1);
            if(gumballMachine.getCount() == 0){
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getOutOfGumball());
            }else{
                gumballMachine.setState(gumballMachine.getNoQuarter());
            }
        } else if (gumballMachine.getCount() == 0) {
            System.out.println("Machine is sold out");
            gumballMachine.setState(gumballMachine.getOutOfGumball());
        }
    }

    @Override
    public void choose(String flavor) {
        System.out.println("Please insert quarter before choosing flavor!");
    }
}
