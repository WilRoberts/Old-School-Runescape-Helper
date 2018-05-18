import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;

public class HerbaloreCalculatorController {

    //region Grimy Herb TextFields
    @FXML
    private TextField grimyGuamLeaf;
    @FXML
    private TextField grimyMarrentill;
    @FXML
    private TextField grimyTarromin;
    @FXML
    private TextField grimyHarralander;
    @FXML
    private TextField grimyRanarrWeed;
    @FXML
    private TextField grimyToadflax;
    @FXML
    private TextField grimyIritLeaf;
    @FXML
    private TextField grimyAvantoe;
    @FXML
    private TextField grimyKwuarm;
    @FXML
    private TextField grimySnapdragon;
    @FXML
    private TextField grimyCadantine;
    @FXML
    private TextField grimyLantadyme;
    @FXML
    private TextField grimyDwarfWeed;
    @FXML
    private TextField grimyTorstol;
    //endregion

    //region Clean Herbs/Unf. Potions TextFields
    @FXML
    private TextField cleanGuamLeaf;
    @FXML
    private TextField cleanMarrentill;
    @FXML
    private TextField cleanTarromin;
    @FXML
    private TextField cleanHarralander;
    @FXML
    private TextField cleanRanarrWeed;
    @FXML
    private TextField cleanToadflax;
    @FXML
    private TextField cleanIritLeaf;
    @FXML
    private TextField cleanAvantoe;
    @FXML
    private TextField cleanKwuarm;
    @FXML
    private TextField cleanSnapdragon;
    @FXML
    private TextField cleanCadantine;
    @FXML
    private TextField cleanLantadyme;
    @FXML
    private TextField cleanDwarfWeed;
    @FXML
    private TextField cleanTorstol;
    //endregion TextFields

    //region Herbalore Seed Inputs TextFields
    @FXML
    private TextField seedGuamLeaf;
    @FXML
    private TextField seedMarrentill;
    @FXML
    private TextField seedTarromin;
    @FXML
    private TextField seedHarralander;
    @FXML
    private TextField seedRanarrWeed;
    @FXML
    private TextField seedToadflax;
    @FXML
    private TextField seedIritLeaf;
    @FXML
    private TextField seedAvantoe;
    @FXML
    private TextField seedKwuarm;
    @FXML
    private TextField seedSnapdragon;
    @FXML
    private TextField seedCadantine;
    @FXML
    private TextField seedLantadyme;
    @FXML
    private TextField seedDwarfWeed;
    @FXML
    private TextField seedTorstol;
    //endregion

    @FXML
    private TextField totalXP;

    @FXML
    private Button calculate;

    @FXML
    public void calculateTotalXP(ActionEvent event){
        double total;

        double guam = (Integer.valueOf(grimyGuamLeaf.getText()) * 2.5) + (Integer.valueOf(cleanGuamLeaf.getText()) * 25) + (Integer.valueOf(seedGuamLeaf.getText()) * 8 * 27.5);
        double marrentill = (Integer.parseInt(grimyMarrentill.getText()) * 3.75) + (Integer.parseInt(cleanMarrentill.getText()) * 37.5) + (Integer.parseInt(seedMarrentill.getText()) * 8 * 41.25);
        double tarromin = (Integer.parseInt(grimyTarromin.getText()) * 5) + (Integer.parseInt(cleanTarromin.getText()) * 50) + (Integer.parseInt(seedTarromin.getText()) * 8 * 55);
        double harralander = (Integer.parseInt(grimyHarralander.getText()) * 6.25) + (Integer.parseInt(cleanHarralander.getText()) * 67.5) + (Integer.parseInt(seedHarralander.getText()) * 8 * 73.75);
        double ranarr = (Integer.parseInt(grimyRanarrWeed.getText()) * 7.5) + (Integer.parseInt(cleanRanarrWeed.getText()) * 87.5) + (Integer.parseInt(seedRanarrWeed.getText()) * 8 * 95);
        double toadflax = (Integer.parseInt(grimyToadflax.getText()) * 8) + (Integer.parseInt(cleanToadflax.getText()) * 180) + (Integer.parseInt(seedToadflax.getText()) * 8 * 188);
        double irit = (Integer.parseInt(grimyIritLeaf.getText()) * 8.75) + (Integer.parseInt(cleanIritLeaf.getText()) * 100) + (Integer.parseInt(seedIritLeaf.getText()) * 8 * 108.75);
        double avantoe = (Integer.parseInt(grimyAvantoe.getText()) * 10) + (Integer.parseInt(cleanAvantoe.getText()) * 117.5) + (Integer.parseInt(seedAvantoe.getText()) * 8 * 127.5);
        double kwuarm = (Integer.parseInt(grimyKwuarm.getText()) * 11.25) + (Integer.parseInt(cleanKwuarm.getText()) * 125) + (Integer.parseInt(seedKwuarm.getText()) * 8 * 136.25);
        double snapdragon = (Integer.parseInt(grimySnapdragon.getText()) * 11.75) + (Integer.parseInt(cleanSnapdragon.getText()) * 142.5) + (Integer.parseInt(seedSnapdragon.getText()) * 8 * 154.25);
        double cadantine = (Integer.parseInt(grimyCadantine.getText()) * 12.5) + (Integer.parseInt(cleanCadantine.getText()) * 150) + (Integer.parseInt(seedCadantine.getText()) * 8 * 162.5);
        double lantadyme = (Integer.parseInt(grimyLantadyme.getText()) * 13.125) + (Integer.parseInt(cleanLantadyme.getText()) * 157.5) + (Integer.parseInt(seedLantadyme.getText()) * 8 * 170.625);
        double dwarfWeed = (Integer.parseInt(grimyDwarfWeed.getText()) * 13.75) + (Integer.parseInt(cleanDwarfWeed.getText()) * 162.5) + (Integer.parseInt(seedDwarfWeed.getText()) * 8 * 176.25);
        double torstol = (Integer.parseInt(grimyTorstol.getText()) * 15) + (Integer.parseInt(cleanTorstol.getText()) * 150) + (Integer.parseInt(seedTorstol.getText()) * 8 * 165);

        total = guam + marrentill + tarromin + harralander + ranarr + toadflax + irit + avantoe + kwuarm + snapdragon + cadantine + lantadyme + dwarfWeed + torstol;

        totalXP.setText(Double.toString(total));

    }

    @FXML
    public void goToMainScene(ActionEvent event) throws IOException {
        Parent main = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene mainScene = new Scene(main);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }
}
