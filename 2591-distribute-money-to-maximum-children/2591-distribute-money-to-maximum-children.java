class Solution {
    public int distMoney(int money, int children) {
        // Rule 1 & 2: Everyone needs at least $1
        money -= children;
        if (money < 0) return -1;

        // Each child needs $7 more to reach $8
        int count = money / 7;
        int remainder = money % 7;

        // Case 1: More than enough money for everyone to have $8
        // The last child must absorb all extra money, so they won't have exactly $8.
        if (count == children && remainder == 0) {
            return children;
        }
        if (count >= children) {
            return children - 1;
        }

        // Case 2: The "Forbidden 4" rule
        // If we have one child left and they are slated to receive exactly $3 more (1+3=4)
        if (count == children - 1 && remainder == 3) {
            return count - 1;
        }

        return count;
    }
}