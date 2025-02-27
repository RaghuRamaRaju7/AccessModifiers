
class Chaishop{
    String branchName="tejoshchai";
    public String publicn="pub";
    protected String protectedn="prot";
    String defaultn="def";
    private String privaten="pri";
    void display(){
        System.out.println(publicn);
        System.out.println(protectedn);
        System.out.println(defaultn);
        System.out.println(privaten);
        
    }
    
}
public class MyClass {
    public static void main(String args[]) {
        Chaishop sh= new Chaishop();
        // sh.display();
        System.out.println(sh.publicn);
        System.out.println(sh.protectedn);
        System.out.println(sh.defaultn);
        // System.out.println(sh.privaten); //can not access
        
    }
}
