import folderA.Owner;
class Chaishop  extends Owner{
    
}
public class MyClass {
    public static void main(String args[]) {
        Chaishop sh= new Chaishop();
         System.out.println(sh.publicn);
        // System.out.println(protectedn);// cannot access in otherclass(different package)
        // System.out.println(defaultn);// cannot access in otherclass(different package)
        // System.out.println(privaten);// cannot access in otherclass(different package)     
        
    }
}
