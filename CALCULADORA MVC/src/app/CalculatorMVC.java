package app;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorMVC {
    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        //CalculatorController theController = new CalculatorController(theView, theModel);
        // Para no generar un error se instancia un objeto de CalcularController
        new CalculatorController(theView, theModel);
        theView.setVisible(true);
    }
}
