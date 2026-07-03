public class Televizyon {
    private String büyüklük;
    private String model;

    public Televizyon(String model, String büyüklük) {
        this.model = model;
        this.büyüklük = büyüklük;
    }

    public void tvÇalıştır(){
        System.out.println("tv açılıyo");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBüyüklük() {
        return büyüklük;
    }

    public void setBüyüklük(String büyüklük) {
        this.büyüklük = büyüklük;
    }
}
