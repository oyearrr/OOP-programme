package cinema_info;

public class Movie {
    private String name;
    private double score;
    private int id;
    private String actor;

    public Movie(){}
    public Movie(int id, String name, double score, String actor){
        this.id = id;
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
