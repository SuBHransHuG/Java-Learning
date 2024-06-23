class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> aL = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>1){
                aL.add(arr[i]);
            }
            if(aL.size() !=0){
                return aL;
            }
        }
        if (aL.size() == 0) {
            aL.add(-1);
        }
        return aL;
    }
}
