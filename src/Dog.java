public class Dog extends Animal{
    int y;

    public Dog(String  n, int x , int y){
        super(n,x);
        this.y=y;
    }
    public void doSound(){
        System.out.println("Gav");
    }
    public void doShit(){
        System.out.println("Shit");
    }
}
