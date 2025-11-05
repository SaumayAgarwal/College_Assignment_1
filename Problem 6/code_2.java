class Solution {
    // Function to find max occurring character
    public char getMaxOccurringChar(String s) {
        // Convert to char array and sort
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        // Variables to store result
        int maxFreq = 1, currFreq = 1;
        char maxChar = arr[0];

        // Traverse the sorted array
        for (int i = 1; i < arr.length; i++) {
            // If same char, increase count
            if (arr[i] == arr[i - 1]) {
                currFreq++;
            } 
            else {
                // If frequency greater, update result
                if (currFreq > maxFreq) {
                    maxFreq = currFreq;
                    maxChar = arr[i - 1];
                }
                currFreq = 1;
            }
        }

        // Final check for last character
        if (currFreq > maxFreq) {
            maxFreq = currFreq;
            maxChar = arr[arr.length - 1];
        }

        // Return result
        return maxChar;
    }
}
