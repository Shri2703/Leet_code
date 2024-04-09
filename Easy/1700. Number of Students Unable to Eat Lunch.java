class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int nType0 = 0;
        int nType1 = 0;
        for(int i=0;i<students.length;i++){
            if(students[i] == 0){
                nType0++;
            }else{
                nType1++;
            }
        }
        
        int unableToEat = students.length;

        for(int i=0;i < sandwiches.length;i++){
            int sandwich = sandwiches[i];
            if((sandwich == 0 && nType0 >0) || (sandwich == 1 && nType1 >0)){
               for(int j =0;j<students.length;j++){
                if(students[j] == sandwich){
                    students[j] = -1;
                    unableToEat--;
                    if (sandwich == 0){
                        nType0--;
                    }else{
                        nType1--;
                    }
                    break;
                }
               }
            }else{
                break;
            }
        }
        return unableToEat;
    }
}