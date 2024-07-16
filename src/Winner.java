//Mr.Yossawaj Bowonsrithananon ID:6510450879
public class Winner implements State{
    gumballMachine gumballMachine;

    public Winner(gumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning twice doesn't get you another gumball");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("YOU’RE A WINNER! You get two gumballs for your quarter");
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getOutOfGumball());
        }else{
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarter());
            }else{
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getOutOfGumball());
            }
        }
    }

    @Override
    public void choose(String flavor) {
        System.out.println("Please choose a flavor after insert quarter");
    }
}
