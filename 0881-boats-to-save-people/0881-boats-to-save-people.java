class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        
        int i = 0, j = people.length - 1;
        int boatCount = 0;

        while (i <= j) {
            boatCount++;
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return boatCount;
    }
}