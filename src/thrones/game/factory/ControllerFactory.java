package thrones.game.factory;

import thrones.game.controller.CanonicalController;

public class ControllerFactory {
    private ControllerFactory instance = this;
    private CanonicalController canonicalController;
    public ControllerFactory(){
        this.canonicalController = new CanonicalController();
    }
    public ControllerFactory getControllerFactory(){
        return this.instance;
    }
    public CanonicalController getCanonicalController() {
        return canonicalController;
    }
}
