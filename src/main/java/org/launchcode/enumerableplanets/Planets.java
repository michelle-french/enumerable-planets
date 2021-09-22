package org.launchcode.enumerableplanets;

public enum Planets {

    MERCURY("88", "0"),
    VENUS("225", "0"),
    EARTH("365", "1"),
    MARS("687", "2"),
    JUPITER("4333", "79"),
    SATURN("10759", "62"),
    URANUS("30687", "27"),
    NEPTUNE("60200", "14");

    private final String yearLength;
    private final String moons;

    Planets(String yearLength, String moons){
        this.yearLength = yearLength;
        this.moons = moons;
    }

    public String getYearLength() {
        return yearLength;
    }

    public String getMoons() {
        return moons;
    }

}
