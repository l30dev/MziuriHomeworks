package NBA;

public class Player {
    private String name;
    private String surname;
    private int points;
    private int rebounds;
    private int blocks;
    private int passes;
    private int turnovers;

    public Player(String name,String surname, int points,
                  int rebounds, int blocks, int passes,
                  int turnovers) {
        this.name = name;
        this.surname=surname;
        this.points=points;
        this.rebounds=rebounds;
        this.blocks=blocks;
        this.passes=passes;
        this.turnovers=turnovers;
    }

    public Player() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }

    public void setTurnovers(int turnovers) {
        this.turnovers = turnovers;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoints() {
        return points;
    }

    public int getRebounds() {
        return rebounds;
    }

    public int getBlocks() {
        return blocks;
    }

    public int getPasses() {
        return passes;
    }

    public int getTurnovers() {
        return turnovers;
    }
    public double rating(){
        return points+rebounds+1.5*passes+2*(blocks-turnovers);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", points=" + points +
                ", rebounds=" + rebounds +
                ", blocks=" + blocks +
                ", passes=" + passes +
                ", turnovers=" + turnovers +
                '}';
    }
}
