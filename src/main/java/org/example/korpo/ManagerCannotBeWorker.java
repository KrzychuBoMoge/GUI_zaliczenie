package org.example.korpo;

public class ManagerCannotBeWorker extends Exception{
    public ManagerCannotBeWorker(String message) {
        super(message);
    }
}
