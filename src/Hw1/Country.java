package Hw1;

public class Country {
    private  String name;
    private  City capital;
    private  City[] Cities;
public Country(String name, City capital, City[] Cities){
    this.name=name;
    this.capital=capital;
    this.Cities=Cities;
}
public int getArea(){
    int areah=0;
    for(City Citeh:Cities){
        areah+=Citeh.getArea();
    }
    return areah;
}
public int getPopulation(){
    int population =0;
    for(City Citeh:Cities){
        population +=Citeh.getPopulation();
    }
    return population;
}
}
