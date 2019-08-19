package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label lblText;

    @FXML
    private TextField textName;

    @FXML
    public void changeText(){
        lblText.setText("Hello " + textName.getText() + "!");
        textName.clear();
    }
}
