package Game;

import javax.swing.*;
import java.awt.*;

public class GameXO extends JFrame {

    private int winWidth;
    private int winHeight;
    private int winPosX;
    private int winPosY;

    private JButton buttonStartGame;
    private JButton buttonEndGame;

    private GameField gameField;
    private JPanel panelSettings;
    private JPanel panelControls;

    GameXO() {
        prepareWin();
        prepareGameSettingsPanel();
        prepareGameButtons();
        prepareGameControlsPanel();

        gameField = new GameField();
        panelSettings.add(panelControls,  BorderLayout.NORTH);

        add(panelSettings, BorderLayout.EAST);
        add(gameField);




//        panelSettings.add(buttonStartGame);
//        panelSettings.add(buttonEndGame);
//
//        add(panelSettings, BorderLayout.EAST);
//        add(gameField);




//        add(buttonStartGame, BorderLayout.NORTH);
//        add(buttonEndGame, BorderLayout.SOUTH);
//
//        setLayout(new GridLayout(15, 15));
//        for (int i = 0; i < 60; i++) {
//            add(new Button("Text + i"));
//        }

        setVisible(true);
    };

    private void prepareWin() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.winWidth = 1024;
        this.winHeight = 768;
        this.winPosX = 300;
        this.winPosY = 80;
        setSize(winWidth,winHeight);
        setLocation(winPosX,winPosY);
        setTitle("Application");
        setResizable(false);


    }

    private void prepareGameSettingsPanel() {
        panelSettings = new JPanel();
        panelSettings.setLayout(new GridLayout(2, 1));
    }

    private void prepareGameButtons() {
        buttonStartGame = new JButton( "Start Game");
        buttonEndGame = new JButton( "End Game");

    }

    private void prepareGameControlsPanel() {
        panelControls = new JPanel();
        panelControls.setLayout(new GridLayout(6,1));

        panelControls.add(buttonStartGame);
        panelControls.add(buttonEndGame);

    }


}
