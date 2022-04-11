class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> records = new Stack<Integer>();

        for (String op : ops) {
            if (op.equals("+")) {
                int last = records.pop();
                int newLast = last + records.peek();
                records.push(last);
                records.push(newLast);
            } else if (op.equals("D")) {
                records.push(2 * records.peek());
            } else if (op.equals("C")) {
                records.pop();
            } else {
                records.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int record : records) {
            sum += record;
        }

        return sum;
    }
}