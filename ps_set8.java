package self;
//class employee{
//    int salary;
//    String name;
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public String setName(String n){
//        name= n;
//     }
//   }
class tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void firing(){
        System.out.println("firing the enemy");
    }
}
public class ps_set8 {
    public static void main(String[] args) {
    //Problem 1
//        employee harry = new employee();
//        harry.setName("codeWithAnushka");
//        System.out.println(harry.getName());
//        harry.salary=33;
//        System.out.println(harry.getSalary());
//        System.out.println(harry.getName());

        //Problem 5
        tommy player1 = new tommy();
        player1.firing();
        player1.hit();
        player1.run();

    }
}
