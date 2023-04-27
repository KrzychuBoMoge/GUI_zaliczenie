package org.example.architektura;

public class ManagerCannotBeWorker extends Exception{
    public ManagerCannotBeWorker(String message) {
        super(message);
    }
}
