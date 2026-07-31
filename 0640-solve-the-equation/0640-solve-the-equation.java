class Solution {
    public String solveEquation(String equation) {
        String[] parts = equation.split("=");
        int[] left = evaluate(parts[0]);
        int[] right = evaluate(parts[1]);

        // LHS: x terms, RHS: constant numbers
        int xCoeff = left[0] - right[0];
        int numSum = right[1] - left[1];

        if (xCoeff == 0) {
            if (numSum == 0) {
                return "Infinite solutions";
            } else {
                return "No solution";
            }
        }

        return "x=" + (numSum / xCoeff);
    }

    private int[] evaluate(String expr) {
        // Regex splits numbers/x terms while keeping signs attached
        String[] tokens = expr.split("(?=[+-])");
        int xCoeff = 0;
        int numSum = 0;

        for (String token : tokens) {
            if (token.equals("+x") || token.equals("x")) {
                xCoeff += 1;
            } else if (token.equals("-x")) {
                xCoeff -= 1;
            } else if (token.contains("x")) {
                xCoeff += Integer.parseInt(token.replace("x", ""));
            } else {
                numSum += Integer.parseInt(token);
            }
        }

        return new int[]{xCoeff, numSum};
    }
}