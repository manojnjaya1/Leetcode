/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
       Map<Integer,Employee> map=new HashMap<>();
        for(Employee employee :employees){
            map.put(employee.id,employee);
        }
        return solve(map,id);
    }
    int solve(Map<Integer,Employee> map,int id){
        Employee root=map.get(id);
        int importance=root.importance;
        
        for(int subor:root.subordinates){
            importance+=solve(map,subor);
        }
        return importance;
         
       
    
    
   
    }
}