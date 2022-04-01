package Java9;


public class ExploreDeprecated {
    private final int radius = 5;

    @Deprecated(since = "1.01", forRemoval = true)
    public Double sizeDeprecated(){
        return  Math.pow(this.radius,2);
    }

    public Double size(){
        return  Math.pow(this.radius,2);
    }

    public static void main(String[] args) {
        ExploreDeprecated exploreDeprecated = new ExploreDeprecated();
        System.out.println(exploreDeprecated.sizeDeprecated().equals(exploreDeprecated.size()));
    }
}
