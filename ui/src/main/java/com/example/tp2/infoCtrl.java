package com.example.tp2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class infoCtrl {


    @FXML
    private TextField pid;

    @FXML
    private TextField ip;

    @FXML
    private TextField port;

    @FXML
    private TextField ressource;

    public void getInfo(int process_number) throws IOException {

        Process p = Main.processes.get(process_number-1);
        pid.appendText(String.valueOf(p.getPid()));
        ip.appendText(p.getIp());
        port.appendText(String.valueOf(p.getPort()));
        ressource.appendText(String.valueOf(p.getResourceName()));

        System.out.println((String.valueOf(p.getIp())));

    }
}
