package Detectors;

import parser.java8BaseVisitor;

abstract class SmellDetector<T> extends java8BaseVisitor {
    public abstract Smell detector();


}
