module com.example.canvasdemo {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.example.canvasdemo to javafx.fxml;
    exports com.example.canvasdemo;
}