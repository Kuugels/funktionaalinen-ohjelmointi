
public class teht1 {
    
    interface Calculation {
        double calc(double n);
    }
    
    public static void main(String[] args) {
        Calculation toCelcius = (fahrenheit) -> {
            return (0.55555 * (fahrenheit - 32));    
        };
        Calculation area = (radius) -> (Math.PI * radius * radius);

	    System.out.println(toCelcius.calc(10));
	    System.out.println(area.calc(10));
    }
}

