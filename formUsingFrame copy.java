import java.awt.*;
class formUsingFrame
{
    formUsingFrame()   //calling constructor
    {
        Frame f = new Frame("Form Demo");
        Label username = new Label("Username");
        TextField userName = new TextField();
        Label password = new Label("Password");
        TextField passWord = new TextField();
        Choice country = new Choice();
        Label label1 = new Label("Hobbies : ");
        List l1 = new List(4,false);
        Label label2 = new Label("Geneder : ");
        CheckboxGroup gender = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", gender, false);
        Checkbox female = new Checkbox("Female", gender, true);
        Label label3 = new Label("You Love : ");
        List l2 = new List(3,false);
        Label label4 = new Label("Bio");
        TextArea area = new TextArea("Please! Enter Your Bio");
        //utility code that sets the alignment, width and height, i.e object.setBounds(int x, int y, int width, int height) 
        // This puts the upper left corner at location (x, y), where x is the number of pixels from the left of the screen and y  is the number from the top of the screen. height and width are as before.
        username.setBounds(40, 30, 65, 50);
        userName.setBounds(135, 30, 150, 50);
        password.setBounds(300, 30, 65, 50 );
        passWord.setBounds(400,30, 150, 50);
        country.setBounds(600, 20, 100, 100);
        label1.setBounds(40, 140, 70, 40);
        l1.setBounds(120, 140, 90, 60);
        label2.setBounds(250, 130, 80, 80);
        male.setBounds(330,120,80,100);
        female.setBounds(450,120,80,100);
        label3.setBounds(40,240,90, 40 );
        l2.setBounds(150, 240, 90, 60);
        label4.setBounds(300, 240, 50, 50);
        area.setBounds(350, 240, 200, 200);
        country.add("Nepal");
        country.add("China");
        country.add("India");
        country.add("France");
        country.add("England");
        country.add("Japan");
        country.add("Germany");
        l1.add("Dancing");
        l1.add("Singing");
        l1.add("Riding");
        l1.add("Travelling");
        l2.add("Drama");
        l2.add("Novel");
        l2.add("Tech");
    
        //adding all the objects in to the frame
        f.add(country);
        f.setSize(800,800);
        f.add(username);
        f.add(userName);
        f.add(password);
        f.add(passWord);
        f.add(label1);
        f.add(label2);
        f.add(l1);
        f.add(male);
        f.add(female);
        f.add(label3); 
        f.add(l2);
        f.add(label4);
        f.add(area);
        f.setLayout(null);
        f.setVisible(true);
        passWord.setEchoChar('*');

    }
    public static void main(String[] args) {
        new formUsingFrame();
    }
}