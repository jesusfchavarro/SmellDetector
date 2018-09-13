package Detectors;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.java8BaseVisitor;

import java.util.ArrayList;

abstract class SmellDetector<T> extends java8BaseVisitor {
    ArrayList<Smell> smells;

    public SmellDetector(ParseTree tree, Pane p, WebEngine webEngine){
        smells = new ArrayList<>();
        visit(tree);

        for(Object s : smells){
            TextArea t = new TextArea(s.toString());
            t.setPrefRowCount(4);
            t.setMinHeight(50);
            t.prefWidthProperty().bind(p.widthProperty());
            t.setEditable(false);
            t.setOnMouseClicked(event -> webEngine.load(((Smell)s).url));
            p.getChildren().add(t);
        }
    }

}

