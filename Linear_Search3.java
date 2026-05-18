static int min(int[] arr){
    int ans = arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i]<ans){
            ans=arr[i];
        }
    }
    return ans;
}