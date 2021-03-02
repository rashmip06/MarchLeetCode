class Solution {
    public int distributeCandies(int[] candyType) {
        
        int maxCandy = 0;
        int halflength = candyType.length/2;
        Set<Integer> candy=new HashSet<Integer>();
        
        for(int oneCandy : candyType){
            
                candy.add(oneCandy);            
        }
        
        return Math.min(halflength, candy.size());
    }
}
