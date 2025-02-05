package generics;

import java.util.TreeSet;

public class ComparaleTeste {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>(); //menor para o maior

        nums.add(10);
        nums.add(30);
        nums.add(151);
        nums.add(120);
        nums.add(5);

        for (Integer n : nums) {
            System.out.println(n);
        }
    }
}