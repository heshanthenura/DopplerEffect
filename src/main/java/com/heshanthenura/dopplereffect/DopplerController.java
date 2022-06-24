package com.heshanthenura.dopplereffect;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class DopplerController implements Initializable {

    //region FXML elements
    @FXML
    private TextField inpAf;

    @FXML
    private TextField inpFs;

    @FXML
    private TextField inpVm;

    @FXML
    private TextField inpVo;

    @FXML
    private TextField inpVs;

    @FXML
    private Button Calculate;

    @FXML
    private RadioButton rbAf;

    @FXML
    private RadioButton rbFs;

    @FXML
    private RadioButton rbVm;

    @FXML
    private RadioButton rbVo;

    @FXML
    private RadioButton rbVs;

    @FXML
    private ToggleGroup VarChk;
    //endregion

    @FXML
    void Calculate(MouseEvent event) {
        double Vm = 0;
        double Vo = 0;
        double Vs = 0;
        double Fs = 0;
        double Af = 0;

        if(rbVm.isSelected()){
            Vo = Double.parseDouble(inpVo.getText());
            Vs = Double.parseDouble(inpVs.getText());
            Fs = Double.parseDouble(inpFs.getText());
            Af = Double.parseDouble(inpAf.getText());
            Vm = DopplerEffect.MediumVelocity(Vo,Vs,Fs,Af);
            inpVm.setText(String.valueOf(Vm));

        }
        else if(rbVo.isSelected()){
            Vm= Double.parseDouble(inpVm.getText());
            Vs = Double.parseDouble(inpVs.getText());
            Fs = Double.parseDouble(inpFs.getText());
            Af = Double.parseDouble(inpAf.getText());
            Vo=DopplerEffect.ObserverVelocity(Vm,Vs,Fs,Af);
            inpVo.setText(String.valueOf(Vo));

        }
        else if(rbVs.isSelected()){
            Vm = Double.parseDouble(inpVm.getText());
            Vo = Double.parseDouble(inpVo.getText());
            Fs = Double.parseDouble(inpFs.getText());
            Af = Double.parseDouble(inpAf.getText());
            Vs = DopplerEffect.SourceVelocity(Vm,Vo,Fs,Af);
            inpVs.setText(String.valueOf(Vs));

        }
        else if(rbFs.isSelected()){
            Vm = Double.parseDouble(inpVm.getText());
            Vo = Double.parseDouble(inpVo.getText());
            Af = Double.parseDouble(inpAf.getText());
            Vs = Double.parseDouble(inpVs.getText());
            Fs = (DopplerEffect.SourceFrequency(Vm,Vo,Vs,Af));
            inpFs.setText(String.valueOf(Fs));

        }
        else if(rbAf.isSelected()){
            Vo = Double.parseDouble(inpVo.getText());
            Vm= Double.parseDouble(inpVm.getText());
            Fs = Double.parseDouble(inpFs.getText());
            Vs = Double.parseDouble(inpVs.getText());
            Af = DopplerEffect.ApparentFrequency(Vm,Vo,Vs,Fs);
            inpAf.setText(String.valueOf(Af));
        }

    }

//region RbStatChk
    @FXML
    void rbAfStaCheck(MouseEvent event) {

    }

    @FXML
    void rbFsStaCheck(MouseEvent event) {

    }

    @FXML
    void rbVmStaCheck(MouseEvent event) {

    }

    @FXML
    void rbVoStaCheck(MouseEvent event) {

    }

    @FXML
    void rbVsStaCheck(MouseEvent event) {

    }
//endregion

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}