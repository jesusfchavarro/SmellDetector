package Detectors;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

public abstract class SmellDetector<T> extends java8Visitor<T>{
    String detector();
}
