package anonymousclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("T-REX");

        // Anonymous class using Abstract class Animal
        // Use anonymous class whenever you don't need to re-use the class anywhere else and you just
        // want an ad-hoc class creation
        Animal cat = new Animal("Kitty") {
            @Override
            public void makeSound() {
                System.out.println("Meow");
            }
        };

        // Anonymous class using interface
        Button button = new Button("Click me");
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };

        button.addActionListener(actionListener);
    }
}
