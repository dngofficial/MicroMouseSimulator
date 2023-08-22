package controller;

import model.Model;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinishAction implements ActionListener {

    private final Model model;
    private final View view;

    private final Controller controller;

    public FinishAction(Model model, View view, Controller controller) {
        this.model = model;
        this.view = view;
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.controller.stopPlaying();
        this.model.finish();
        this.view.updateView(this.model.updateView());
    }
}
