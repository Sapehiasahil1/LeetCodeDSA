import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> astFight = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int attacker = asteroids[i];

            while (!astFight.isEmpty() && astFight.peek() > 0 && attacker < 0) {
                int prev = astFight.peek();
                if (prev == -attacker) {
                    astFight.pop();
                    attacker = 0;  
                    break;
                } else if (prev < -attacker) {
                    astFight.pop(); 
                } else {
                    attacker = 0;  
                    break;
                }
            }

            if (attacker != 0) {
                astFight.push(attacker);
            }
        }

        int[] res = new int[astFight.size()];
        for (int t = res.length - 1; t >= 0; --t) {
            res[t] = astFight.pop();
        }

        return res;
    }
}
