package es.ieslosmontecillos.appusotextoboton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import es.ieslosmontecillos.componentes_sepulvedasalvador.CampoTextoBoton;

public class AppUsoTextoBotonController {

    @FXML
    private Label label;
    @FXML
    private CampoTextoBoton nombre;
    @FXML
    private CampoTextoBoton apellido;

    @FXML
    protected void onButtonClickedName() {
        label.setText("Tu nombre es: " + nombre.getText());
    }

    @FXML
    protected void onButtonClickedLastName() {
        label.setText("Tu apellido es: " + apellido.getText());
    }
}