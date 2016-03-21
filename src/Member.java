package idolgroup;

public class Member {

    private String nama, team;
    private int umur;
    private double penampilan, suara, attitude, nilai;

    public void setNama(String temp) {
        nama = temp;
    }

    public String getNama() {
        return nama;
    }

    public void setTeam(String temp) {
        team = temp;
    }

    public String getTeam() {
        return team;
    }

    public void setUmur(int temp) {
        umur = temp;
    }

    public int getUmur() {
        return umur;
    }

    public void setPenampilan(double temp) {
        penampilan = temp;
    }

    public void setSuara(double temp) {
        suara = temp;
    }

    public void setAttitude(double temp) {
        attitude = temp;
    }

    public double getNilai() {
        nilai = (penampilan + suara + attitude) / 3;
        return nilai;
    }
}