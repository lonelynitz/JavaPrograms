

static void rearrange(int[] A, int N)
    {
        int temp[] = A.clone();
        int low = 0, high = N - 1;
        boolean flag = true;
 
        // Store result in temp[]
        for (int i = 0; i < N; i++) {
            if (flag)
                A[i] = temp[high--];
            else
                A[i] = temp[low++];
 
            flag = !flag;
        }
    }