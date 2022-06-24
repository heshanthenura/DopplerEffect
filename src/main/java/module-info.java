module com.heshanthenura.dopplereffect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.heshanthenura.dopplereffect to javafx.fxml;
    exports com.heshanthenura.dopplereffect;
}