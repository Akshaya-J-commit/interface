import java.util.Scanner;
package com.hcl2;
interface Stall{
    public void display();

}
class GoldStall implements Stall{
    private String stallname;
   private String ownername;
    private int cost;
   private int tvSet;
   GoldStall(){

   }
   GoldStall(String stallname,String ownername,int cost ,int tvSet){
       this.stallname=stallname;
       this.ownername=ownername;
       this.cost=cost;
       this.tvSet=tvSet;
   }

    public void setStallname(String stallname) {
        this.stallname = stallname;
    }

    public String getStallname() {
        return stallname;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setTvSet(int tvSet) {
        this.tvSet = tvSet;
    }

    public int getTvSet() {
        return tvSet;
    }

    @Override
    public void display() {
        System.out.println("Stallname:"+stallname);
        System.out.println("cost:"+cost);
        System.out.println("ownername:"+ownername);
        System.out.println("tv set":+tvSet);
    }

}
class Premium implements Stall{
    private String stallname;
    private int cost;
    private  String ownername;
    private int projector;
    Premium(){

    }
    Premium(String stallname,String ownername,int cost ,int projector){
        this.stallname=stallname;
        this.ownername=ownername;
        this.cost=cost;
        this.projector=projector;
    }

    public void setStallname(String stallname) {
        this.stallname = stallname;
    }

    public String getStallname() {
        return stallname;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setProjector(int Projector) {
        this.projector = projector;
    }

    public int getProjector() {
        return projector;
    }

    @Override
    public void display() {
        System.out.println("Stallname:"+stallname);
        System.out.println("cost:"+cost);
        System.out.println("ownername:"+ownername);
        System.out.println("projector":+projector);
    }

}
class ExecutiveStall implements Stall{
    private String stallname;
    private String ownername;
    private int cost;
    private int screen;
    ExecutiveStall(){

    }
    ExecutiveStall(String stallname,String ownername,int cost ,int screen){
        this.stallname=stallname;
        this.ownername=ownername;
        this.cost=cost;
        this.screen=screen;
    }

    public void setStallname(String stallname) {
        this.stallname = stallname;
    }

    public String getStallname() {
        return stallname;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public int getScreen() {
        return screen;
    }

    @Override
    public void display() {
        System.out.println("Stallname:"+stallname);
        System.out.println("cost:"+cost);
        System.out.println("ownername:"+ownername);
        System.out.println("screen":+screen);
    }
}
public class Main {

    public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int choice;
	System.out.println("choose stall type:");
	System.out.println("1.Goldstall");
	System.out.println("2.Premium stall");
	System.out.println("3.Executive stall");
	choice=in.nextInt();
    if(choice==1)
    {
        System.out.println("stallname:");
        String stallname=in.nextLine();
        System.out.println("cost:");
        int cost=in.nextInt();
        System.out.println("ownername:");
        String ownername=in.nextLine();
        System.out.println("sets:");
        int tvset=in.nextInt();
        Stall s=new GoldStall(stallname,cost,ownername,tvset);
        s.display();
    }
        else if(choice==2)
        {
            System.out.println("stallname:");
            String stallname=in.nextLine();
            System.out.println("cost:");
            int cost=in.nextInt();
            System.out.println("ownername:");
            String ownername=in.nextLine();
            System.out.println("sets:");
            int projector=in.nextInt();
            Stall s=new Premium(stallname,cost,ownername,projector);
            s.display();
        }
        if(choice==1)
        {
            System.out.println("stallname:");
            String stallname=in.nextLine();
            System.out.println("cost:");
            int cost=in.nextInt();
            System.out.println("ownername:");
            String ownername=in.nextLine();
            System.out.println("sets:");
            int screen=in.nextInt();
            Stall s=new ExecutiveStall(stallname,cost,ownername,screen);
            s.display();
        }

    }
}
