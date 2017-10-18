import org.example.JosephusProblem;

/*
 * Application that takes in 2 parameters: the number of people in the circle (n) and the step rate (k).
 * For example, if k is the step rate, then you skip k-1 people and eliminate the kth person.
 * The output of the program should be the place you need to stand in the circle to be the last person left.
 */
public class App {
    public static void main(String[] args) {
        int n;
        int k;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
                k = Integer.parseInt(args[1]);
                int result = JosephusProblem.josephus(n, k);
                System.out.printf("JosephusProblem(%d,%d) = %d", n, k, result);
            } catch (Exception e) {
                System.err.println(e);
                System.exit(1);
            }
        }
    }
}
