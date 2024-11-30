package Hw1;

public class Nation {
    private String name;
    private int population;
    private String capital;
    private double area;

    public Nation(String name, int population, String capital, double area) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Nation: " + name + "\n" +
                "Population: " + population + "\n" +
                "Capital: " + capital + "\n" +
                "Area: " + area + " km²";
    }

    public class River {
        private String name;
        private double length;

        public River(String name, double length) {
            this.name = name;
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public double getLength() {
            return length;
        }

        @Override
        public String toString() {
            return "River Name: " + name + "\n" +
                    "River Length: " + length + " km";
        }
    }
}