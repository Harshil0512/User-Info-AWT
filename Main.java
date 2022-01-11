package userInfo;

import java.awt.*;

public class Main extends Frame{
    private Label heading,uName,hobby;
    private TextField name;
    private Checkbox h1,h2,h3,h4; 
    private Button submit;
    Main()
    {  
        setLayout(new BorderLayout());
        Panel center = new Panel(new GridLayout(10,1));
        Panel bottom = new Panel(new FlowLayout(FlowLayout.CENTER,10,40));;
        Panel top = new Panel(new FlowLayout(FlowLayout.CENTER,10,10));
        top.setBackground(Color.gray);
        heading = new Label("User Info");
        heading.setForeground(Color.WHITE);
        setHobby();
        setName();
        top.add(heading);
        Panel userName = new Panel(new FlowLayout(FlowLayout.CENTER,5,1));
        userName.add(uName);
        userName.add(name);
        Panel userHobby = new Panel(new FlowLayout(FlowLayout.CENTER, 5, 1));
        userHobby.add(h1);
        userHobby.add(h2);
        userHobby.add(h3);
        userHobby.add(h4);
        setSubmit();
        center.add(userName);
        center.add(userHobby);
        Panel submitBtn = new Panel(new FlowLayout(FlowLayout.CENTER,20,20));
        submitBtn.add(submit);
        center.add(submitBtn);
        bottom.setBackground(Color.GRAY);
        
        add(top,BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(bottom,BorderLayout.SOUTH);
        setBounds(250,100,500,500);
        setVisible(true);
    }
    void setHobby()
    {
        hobby = new Label("Hobby : ");
        h1 = new Checkbox("Coding");
        h2 = new Checkbox("Cricket");
        h3 = new Checkbox("Chess");
        h4 = new Checkbox("Tennis");
    }
    void setName()
    {
        uName = new Label("Name : ");
        name = new TextField(20);
    }
    void setSubmit()
    {
        submit = new Button("Submit");
        submit.setPreferredSize(new Dimension(100,20));
        submit.setBackground(Color.CYAN);
    }
    public static void main(String[] args)
    {
        Main m = new Main();
    } 

}