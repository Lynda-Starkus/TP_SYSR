package com.example.tp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class GUIctrl{

    @FXML
    private VBox messages_box;

    @FXML
    private VBox vbox_types;

    @FXML
    private Button p1;

    @FXML
    private Button p2;

    @FXML
    private Button p3;

    @FXML
    private Button p4;

    @FXML
    private Button p5;

    @FXML
    private Button p6;

    @FXML
    private Button p7;

    @FXML
    private Button p8;

    @FXML
    private Button p9;

    @FXML
    private Button p10;



    public void printMessages(){
        TextField[] textField = new TextField[Main.message.size()];
        for(int i=0; i<Main.message.size(); i++){

            textField[i] = new TextField();
            //textField[i].appendText(Main.message_type.get(i));
            textField[i].appendText("("+(i)+") ==>"+Main.message.get(i));
            messages_box.getChildren().add(textField[i]);


        }

    }


    public void printTypes(){
        TextField[] textField2 = new TextField[Main.message_type.size()];
        for(int j=0; j<Main.message_type.size(); j++){

            textField2[j] = new TextField();
            if(Main.message_type.get(j).equals("access_denied")) textField2[j].setStyle("-fx-background-color: red;");
            if(Main.message_type.get(j).equals("access_accorded")) textField2[j].setStyle("-fx-background-color: green;");
            textField2[j].appendText("("+(j)+") ==>"+Main.message_type.get(j));
            //textField2[i].appendText(Main.message.get(i));

            vbox_types.getChildren().add(textField2[j]);


        }

    }

    public void buttonClickInfo(ActionEvent event) throws IOException {
        Button srcButton = (Button) event.getSource();
        int button_num = 0;
        if(p1 == srcButton) button_num = 1;
        if(p2 == srcButton) button_num = 2;
        if(p3 == srcButton) button_num = 3;
        if(p4 == srcButton) button_num = 4;
        if(p5 == srcButton) button_num = 5;
        if(p6 == srcButton) button_num = 6;
        if(p7 == srcButton) button_num = 7;
        if(p8 == srcButton) button_num = 8;
        if(p9 == srcButton) button_num = 9;
        if(p10 == srcButton) button_num = 10;

        FXMLLoader loader = new FXMLLoader(getClass().getResource("info.fxml"));
        Parent root2 = loader.load();
        Stage stage2 = new Stage();
        infoCtrl controller = loader.getController();
        controller.getInfo(button_num);

        Scene scene2 = new Scene(root2);

        scene2.setFill(Color.TRANSPARENT);
        stage2.setScene(scene2);
        stage2.show();


    }



}