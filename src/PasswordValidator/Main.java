package PasswordValidator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        System.out.println(
                "\n1. A password must have at least eight characters." +
                        "\n2. A password consists of only letters and digits." +
                        "\n3. A password must contain at least two digits." +
                        "\nInput a password (You are agreeing to the above Terms and Conditions):" +
                        "\nType '0' to exit."
        );


        int t;
        do {
            t = 0;
            Scanner k = new Scanner(System.in);
            String p = k.nextLine();

            if (p == "0") {
                System.exit(0);
            } else {
                if (Validator.isValid(p)) {
                    System.out.println("Valid password.");
                    t = 1;
                    System.exit(0);
                } else {
                    System.out.println("Invalid password.");
                }
            }
        } while (t == 0);
        return;
    }
}
