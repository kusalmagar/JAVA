import java.awt.*;
public class borderLayoutDemo extends Frame
{
    public borderLayoutDemo(String title)
    {
        super(title);
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        setLayout(new BorderLayout());
        add("North", b1);
        add("South", b2);
        add("East", b3);
        add("West", b4);
        add("Center", b5);
    }
    public static void main(String[] args) {
       borderLayoutDemo bld = new borderLayoutDemo("Demo");
       bld.setSize(400,400);
       bld.setVisible(true);

    }
}