package streamAPI.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        Integer total1 = nums.parallelStream().reduce(soma).get();
        System.out.println(total1);

        //com valor inicial não precisa de get()
        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(total2);

        //Opcional<Integer>....
        nums.stream()
                .filter(n -> n > 3)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
