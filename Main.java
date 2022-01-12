package userInfo;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame{
    private Label heading,uName,hobby,output;
    private TextField name;
    private Checkbox h1,h2,h3,h4; 
    private Button submit;
    Main()
    {  
        setLayout(new BorderLayout());
        Panel center = new Panel(new GridLayout(3,1));
        Panel bottom = new Panel(new FlowLayout(FlowLayout.CENTER,10,10));;
        Panel top = new Panel(new FlowLayout(FlowLayout.CENTER,10,10));
        top.setBackground(Color.gray);
        heading = new Label("User Info");
        heading.setForeground(Color.WHITE);
        setHobby();
        setName();
        top.add(heading);
        Panel userName = new Panel(new FlowLayout(FlowLayout.CENTER,5,5));
        userName.add(uName);
        userName.add(name);
        Panel userHobby = new Panel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        userHobby.add(hobby);
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
        output=new Label("Output :                                               ");
        bottom.add(output);
        add(top,BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(bottom,BorderLayout.SOUTH);
        setTitle("User Information");
        setBounds(250,100,500,400);
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
        submit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String temp = "Output : "+"Hello "+uName.getText()+"! Your Hobbys Are : "+(h1.getState()?h1.getLabel()+", ":"")+(h2.getState()?h2.getLabel()+", ":"")+(h3.getState()?h3.getLabel()+", ":"")+(h4.getState()?h4.getLabel()+", ":"");
                temp = temp+"\b\b";
                output.setText(temp);
            }
        });
    }
    public static void main(String[] args)
    {
        Main m = new Main();
    } 

}
