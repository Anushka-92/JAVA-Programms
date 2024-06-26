package self;
class myemployee{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "anurg";
    }

    public void setId(int id) {
        this.id = 5;
    }

    public int getId() {
        return id;
    }
}
public class accesModifiers {
    public static void main(String[] args){
        myemployee anurag= new myemployee();
       anurag.setName("codeWithHarry");
        System.out.println(anurag.getName());
    }
}
