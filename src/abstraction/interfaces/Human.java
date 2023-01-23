package abstraction.interfaces;

public abstract class Human {
    private String skinColor;

    public Human(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
