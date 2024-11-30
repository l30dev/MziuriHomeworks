package Hw1;

public class City {
    private String name;
    private int population;
    private int area;
public City(String name, int population, int area){
    this.name=name;
    this.population=population;
    this.area=area;
}
public int getArea(){
    return area;
}
public int getPopulation(){
        return population;
    }

}
