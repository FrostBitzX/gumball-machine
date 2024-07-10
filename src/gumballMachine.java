//Mr.Yossawaj Bowonsrithananon ID:6510450879
public class gumballMachine {
    private State noQuarter;
    private State hasQuarter;
    private State gumballSold;
    private State outOfGumball;
    private State state;
    private int count;
    private String gumballStatus;

    public gumballMachine(int count){
        this.noQuarter = new noQuarter(this);
        this.hasQuarter = new hasQuarter(this);
        this.gumballSold = new gumballSold(this);
        this.outOfGumball = new outOfGumball(this);
        this.count = count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public State getGumballSold() {
        return gumballSold;
    }

    public State getOutOfGumball() {
        return outOfGumball;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispenseGumball();
    }

    @Override
    public String toString() {
        if(this.count > 0){
            this.state = noQuarter;
            gumballStatus = "Machine is waiting for quarter";
        }else if(this.count == 0){
            this.state = outOfGumball;
            gumballStatus = "Machine is sold out";
        }
        return "\nMighty Gumball, Inc." +
                "\nJava-enabled Standing Gumball Model #2004" +
                "\nInventory: " + count + " gumballs" +
                "\n" + gumballStatus + "\n";
    }
}
