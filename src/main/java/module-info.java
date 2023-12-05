module es.ieslosmontecillos.appusotextoboton {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmontecillos.componentes_salvadorsepulveda;


    opens es.ieslosmontecillos.appusotextoboton to javafx.fxml;
    exports es.ieslosmontecillos.appusotextoboton;
}