package LLD.Design_Patterns.Abstract_Factory_Pattern;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a Mac style.");
    }
}

