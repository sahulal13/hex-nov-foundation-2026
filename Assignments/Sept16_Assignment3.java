public class Sept16_Assignment3 {
    static void main(String[] args) {
        int[] attendance = {30,28,27,25,26,31,24,25,21,27};
        int[] consecAtd = new int[attendance.length + 1];
        for(int i =1;i<attendance.length;i++){
            consecAtd[i] = consecAtd[i-1] + attendance[i];
        }
        System.out.println("The day with highest attendance is day " + largestAttendance(attendance));
        System.out.println("Day 3 to Day 7 has a total attendance of " + (consecAtd[7] - consecAtd[3]));
    }

    private static int largestAttendance(int[] attendance) {
        int max = 0;
        for(int i=1;i<attendance.length;i++){
            if(attendance[max]<attendance[i]){
                max = i;
            }

        }
        return max;
    }
}
