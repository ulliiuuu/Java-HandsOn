package HandsOn5;

class CompareUtil {

    public static <T extends Comparable<T>>
    boolean isEqual(T a, T b) {
        return a.compareTo(b) == 0;
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println(CompareUtil.isEqual(5, 5));
        System.out.println(CompareUtil.isEqual("Hello", "World"));
        System.out.println(CompareUtil.isEqual(3.14, 3.14));
        System.out.println(CompareUtil.isEqual('A', 'A'));
    }
}

