module com.example.magicalgirlbattlearena {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;


    opens com.example.magicalgirlbattlearena to javafx.fxml;
    exports com.example.magicalgirlbattlearena;

    opens com.magicalgirlbattlefxgl to com.almasb.fxgl.core;
    exports com.magicalgirlbattlefxgl;

}