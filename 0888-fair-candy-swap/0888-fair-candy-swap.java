class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int arr[] = {-1, -1};
        int suma = 0, sumb = 0;
        for(int i = 0; i < aliceSizes.length; i++)
        {
            suma = suma + aliceSizes[i];
        }
        for(int i = 0; i < bobSizes.length; i++)
        {
            sumb = sumb + bobSizes[i];
        }
        int d = (suma - sumb) / 2;
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int i = 0;
        int j = 0;
        while(j < bobSizes.length && i < aliceSizes.length)
        {
            int diff = aliceSizes[i] - bobSizes[j];
            if( diff == d)
            {
                arr[0] = aliceSizes[i];
                arr[1] = bobSizes[j];
                return arr;
            }
            else if(diff < d)
            {
                i++;
            } else 
            {
                j++;
            }
        }
        return arr;
    }
}