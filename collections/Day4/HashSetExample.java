import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("New York"); 
        
        System.out.println("HashSet elements:");
        for (String city : cities) {
            System.out.println(city);
        }
        
        String checkCity = "London";
        if (cities.contains(checkCity)) {
            System.out.println(checkCity + " exists in the set.");
        } else {
            System.out.println(checkCity + " does not exist in the set.");
        }
        
        cities.remove("Paris");
        System.out.println("Updated HashSet after removing Paris:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

