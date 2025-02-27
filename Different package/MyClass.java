import folderA.Owner;
class Chaishop  extends Owner{
    void display(){
        System.out.println(publicn);
        System.out.println(protectedn);
        // System.out.println(defaultn);// cannot access in subclass(different package)
        // System.out.println(privaten);// cannot access in subclass(different package)
        
    }
    
}
public class MyClass {
    public static void main(String args[]) {
        Chaishop sh= new Chaishop();
        sh.display();
        
    }
}
