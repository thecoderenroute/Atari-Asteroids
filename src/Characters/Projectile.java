package Characters;

import Main.AsteroidsApplication;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Projectile extends Character {

    public Projectile(int x, int y) {
        super(new Polygon(2, -2, 2, 2, -2, 2, -2, -2), x, y);
        this.getCharacter().setFill(Color.web("#990000"));
    }

    @Override
    public void move(){
        super.getCharacter().setTranslateX(super.getCharacter().getTranslateX() + super.getMovement().getX());
        super.getCharacter().setTranslateY(super.getCharacter().getTranslateY() + super.getMovement().getY());
    }

    public void isOutBounds() {
        if (super.getCharacter().getTranslateY() >= AsteroidsApplication.HEIGHT ||
                super.getCharacter().getTranslateY() <= 0 ||
                super.getCharacter().getTranslateX() >= AsteroidsApplication.WIDTH ||
                super.getCharacter().getTranslateX() <= 0) {
            super.setIsDead(true);
        }

    }

}
