public class Pet {
    private String type;

    public Pet() {

    }

    public Pet(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                '}';
    }
}
