import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button HerbaloreXPCalculator;

    @FXML
    public void launchHerbalore(ActionEvent event) throws IOException {
        Parent herby = FXMLLoader.load(getClass().getResource("herbaloreXPCalculator.fxml"));
        Scene herbaloreScene = new Scene(herby);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(herbaloreScene);
        window.show();
    }
}
