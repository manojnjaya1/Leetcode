class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
       
        Set<String> supp=new HashSet<>(Arrays.asList(supplies));
        Queue<Integer> que=new LinkedList<>();
        List<String> ans=new ArrayList<>();
        for(int i=0;i<recipes.length;i++){
            que.offer(i);
        }
        
        int prev=supp.size()-1;
        while(supp.size()>prev){
            prev=supp.size();
            mid:
            for(int j=que.size();j>0;j--){
                int i=que.poll();
                for(String ing:ingredients.get(i)){
                    if(!supp.contains(ing)){
                        que.offer(i);
                        continue mid;
                    }
                    
                }
                supp.add(recipes[i]);
                                ans.add(recipes[i]);

            }
        }
        return ans;

    }
}