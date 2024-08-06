package LLD.Design_Patterns.Abstract_Factory_Pattern;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering a button in a Windows style.");
    }
}
