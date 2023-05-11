public class Main {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};

        ForHelper<Integer> forHelper = new ForHelper<>(nums);
        forHelper.forEach((index, num) -> {
            System.out.println("Index: " + index + ", Value: " + num);
        });
    }
}
