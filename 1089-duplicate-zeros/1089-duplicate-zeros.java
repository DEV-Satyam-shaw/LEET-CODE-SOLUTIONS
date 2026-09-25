class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int count = 0;
        int size = n-1;

        for(int i = 0; i <= size-count; i++)
        {
            if(arr[i] == 0)
            {
                if(i == size-count)
                {
                    arr[size] = 0;
                    size--;
                    break;
                }
                count++;
            }
        }

        int last = size - count;
        for(int i = last; i >= 0; i--)
        {
            if(arr[i] == 0)
            {
                arr[i + count] = 0;
                count--;
                arr[i + count] = 0;
            }
            else {
                arr[i + count] = arr[i];
            }
        }

    }
}