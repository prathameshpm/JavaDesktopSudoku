package sudoku.userinterface;

import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sudoku.problemdomain.Coordinates;
import sudoku.problemdomain.SudokuGame;

public class UserInterfaceImpl implements IUserInterfaceContract.View,
        EventHandler<KeyEvent> {

                private final Stage stage;
                private final Group root;

                private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;

                private IUserInterfaceContract.EventListener listener;

                private static final double WINDOW_Y = 732;
                private static final double WINDOW_X = 668;
                private static final double BOARD_PADDING = 50;
                private static final double BOARD_X_AND_Y = 576;

                private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(0, 150, 136);
                private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(224, 242, 241);
                private static final String SUDOKU = "Sudoku";

        @Override
        public void showDialog(String message) {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void showError(String message) {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void updateBoard(SudokuGame game) {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void handle(KeyEvent keyEvent) {
                
        }
    
        @Override
        public void setListener(IUserInterfaceContract.EventListener listener) {

        }

        @Override
        public void updateSquare(int x, int y, int input) {

        }
}
