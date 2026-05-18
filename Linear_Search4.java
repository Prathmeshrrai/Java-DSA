static int max(int[][]arr){
    int max = Integer.MIN_VALUE;
    for(int [] ints:arr){
        for(int anInt:ints){
            if(anInt>max){
                max=anInt;
            }
        }
    }
    return max;
}