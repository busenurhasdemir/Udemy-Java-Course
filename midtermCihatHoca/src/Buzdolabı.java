public class Buzdolabı {
    private String soğutma;
    private int yaşı;
    private Televizyon televizyon ;

    public String getSoğutma() {
        return soğutma;
    }

    public void setSoğutma(String soğutma) {
        this.soğutma = soğutma;
    }

    public int getYaşı() {
        return yaşı;
    }

    public void setYaşı(int yaşı) {
        this.yaşı = yaşı;
    }

    public Televizyon getTelevizyon() {
        return televizyon;
    }

    public void setTelevizyon(Televizyon televizyon) {
        this.televizyon = televizyon;
    }

    public Buzdolabı(String soğutma, int yaşı, Televizyon televizyon) {
        this.soğutma = soğutma;
        this.yaşı = yaşı;
        this.televizyon=televizyon;
    }
}
