public class HackerLandUniversityGrade {
    public static void main(String[] args) {
        int grade = 84;
        int nextMultiple;
        if(grade < 38) {
            System.out.println("grade : " + grade + " failed.");
        }else {
           // nextMultiple = findNextMultipleOfFive(grade);
            nextMultiple = findNextMultipleOfFiveNew(grade);
            if(nextMultiple - grade < 3) {
                grade = nextMultiple;
            }
            System.out.println("student's grade is : " + grade);
        }

    }

    public static int findNextMultipleOfFive(int grade) {
        int nextMultiple = 0;
        for (int i = 5; i <= 100; i += 5) {
            if(i > grade)  {
                nextMultiple = i;
                System.out.println("next multiple : " + i);
                break;
            }
        }
        return nextMultiple;
    }
    public static int findNextMultipleOfFiveNew(int grade) {
        return ((grade / 5) + 1) * 5;
    }
}
