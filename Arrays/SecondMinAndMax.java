class SecondMinAndMax {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 1, 3, 11, 44, 15, 17};
        int n = a.length;

        int max1 = a[0], max2 = a[0];
        int min1 = a[0], min2 = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > max1) {
                max2 = max1; // Old max becomes second max
                max1 = a[i]; // Update new max
            } else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i]; // Update second max only
            }

            // Update Min logic
            if (a[i] < min1) {
                min2 = min1; // Old min becomes second min
                min1 = a[i]; // Update new min
            } else if (a[i] < min2 && a[i] != min1) {
                min2 = a[i]; // Update second min only
            }
        }

        System.out.println("Second max: " + max2);
        System.out.println("Second Min: " + min2);
    }
}
