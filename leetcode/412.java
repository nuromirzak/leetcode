class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        String f = "Fizz";
        String b = "Buzz";
        String fb = "FizzBuzz";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    arr.add(fb);
                } else {
                    arr.add(f);
                }
            } else if (i % 5 == 0) {
                arr.add(b);
            } else {
                arr.add(Integer.toString(i));
            }
        }
        return arr;
    }
}