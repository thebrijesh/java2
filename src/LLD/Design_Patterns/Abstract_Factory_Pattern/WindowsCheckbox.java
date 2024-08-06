package LLD.Design_Patterns.Abstract_Factory_Pattern;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in a Windows style.");
    }
}

