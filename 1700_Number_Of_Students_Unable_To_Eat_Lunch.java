class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int cirStud = 0, sqStud = 0;

        for (int student : students) {
            if (student == 0) {
                cirStud++;
            }else{
                sqStud++;
            } 
        }
        for (int sandwich : sandwiches) {
            if (sandwich == 0 && cirStud > 0) {
                cirStud--; 
            } else if (sandwich == 1 && sqStud > 0) {
                sqStud--; 
            } else {
                break; 
            }
        }
        return cirStud + sqStud; 
    }
}
