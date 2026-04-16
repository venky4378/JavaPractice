class Human{
    
    private String name;
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
        
    }
    public Human()                           //Default Constructor
    {
        age = 18;
        name = "Navin";
    }
    public Human(int a,String m)            //Parameterized Constructor
    {
        age = a;
        name = m;


    }

}



public class PracticePrivateKeyword {
    

    public static void main(String[] args) {
        Human s = new Human();
        Human s1 = new Human(23,"Markus");          //for Parameterized Constructor
        s.setAge(12);
        s.setName("Venky");
        System.out.println(s.getAge() + " : "+ s.getName());
        System.out.println(s1.getAge() + " : "+ s1.getName());
    }
}
