import java.util.Scanner;

public class Assignment {




    public static void main(String args[]) {

        int overall;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a grade: ");
        int grade = keyboard.nextInt();

        System.out.print("Please enter a grade: ");
        int grade2 = keyboard.nextInt();

        System.out.print("Please enter a grade: ");
        int grade3 = keyboard.nextInt();

        System.out.print("Please enter a grade: ");
        int grade4 = keyboard.nextInt();

        System.out.print("Please enter a grade: ");
        int grade5 = keyboard.nextInt();

        System.out.print("Please enter a grade: ");
        int grade6 = keyboard.nextInt();

        overall  = (grade + grade2 + grade3 + grade4 + grade5 + grade6) / 6;


        if (grade > 100 || grade < 0) {
            System.out.println("ERROR 404, Please enter a grade between 0% and 100%, Try Again");
            die();
        }
        if (grade2 > 100 || grade2 < 0) {
            System.out.println("ERROR 404, Please enter a grade between 0% and 100%, Try Again");
            die();
        }
        if (grade3 > 100 || grade3 < 0) {
            System.out.println("ERROR 404, Please enter a grade between 0% and 100%, Try Again");
            die();
        }
        if (grade4 > 100 || grade4 < 0) {
            System.out.println("ERROR 404, Please enter a grade between 0% and 100%, Try Again");
            die();
        }
        if (grade5 > 100 || grade5 < 0) {
            System.out.println("ERROR 404, Please enter a grade between 0% and 100%, Try Again");
            die();
        }
        if (grade6 > 100 || grade6 < 0) {
            System.out.println("ERROR 404, Please enter a grade between 0% and 100%, Try Again");
            die();
        }




        if (grade < 100 && grade> 0){

            System.out.printf("grade: %s %n",
                    grades(grade));

            System.out.printf("grade: %s %n",
                    grades2(grade2));

            System.out.printf("grade: %s %n",
                    grades3(grade3));

            System.out.printf("grade: %s %n",
                    grades(grade4));

            System.out.printf("grade: %s %n",
                    grades2(grade5));

            System.out.printf("grade: %s %n",
                    grades3(grade6));



        }


        System.out.printf("Your average grade is: %d %% %n"
                , average(grade, grade2, grade3, grade4, grade5, grade6));


        System.out.printf("your %s %n",
                averagegrade(overall));





    }

    private static void die() {
    }


    public static String grades(int grade) {

        if (grade > 90 && grade < 100) {
            return "1st: " + grade + "%" + " = A+";
        }
        if (grade > 80 && grade < 91) {
            return "1st: " + grade + "%" + " = A";
        }
        if (grade > 75 && grade < 81) {
            return "1st: " + grade + "%" + " = B+";
        }
        if (grade > 65 && grade < 76) {
            return "1st: " + grade + "%" + " = B";
        }
        if (grade > 60 && grade < 66) {
            return "1st: " + grade + "%" + " = C+";
        }
        if (grade > 55 && grade < 61) {
            return "1st: " + grade + "%" + " = C";
        }
        if (grade > 50 && grade < 56) {
            return "1st: " + grade + "%" + " = D";
        }
        if (grade > 0 && grade < 51) {
            return "1st: " + grade + "%" + " = E";
        }

        return null;
    }

    public static String grades2(int grade2) {

        if (grade2 > 90 && grade2 < 100) {
            return "2nd: " + grade2 + "%" + " = A+";
        }
        if (grade2 > 80 && grade2 < 91) {
            return "2nd: " + grade2 + "%" + " = A";
        }
        if (grade2 > 75 && grade2 < 81) {
            return "2nd: " + grade2 + "%" + " = B+";
        }
        if (grade2 > 65 && grade2 < 76) {
            return "2nd: " + grade2 + "%" + " = B";
        }
        if (grade2 > 60 && grade2 < 66) {
            return "2nd: " + grade2 + "%" + " = C+";
        }
        if (grade2 > 55 && grade2 < 61) {
            return "2nd: " + grade2 + "%" + " = C";
        }
        if (grade2 > 50 && grade2 < 56) {
            return "2nd: " + grade2 + "%" + " = D";
        }
        if (grade2 > 0 && grade2 < 51) {
            return "2nd: " + grade2 + "%" + " = E";
        }

        return null;
    }

    public static String grades3(int grade3) {

        if (grade3 > 90 && grade3 < 100) {
            return "3rd: " + grade3 + "%" + " = A+";
        }
        if (grade3 > 80 && grade3 < 91) {
            return "1nd: " + grade3 + "%" + " = A";
        }
        if (grade3 > 75 && grade3 < 81) {
            return "1st: " + grade3 + "%" + " = B+";
        }
        if (grade3 > 65 && grade3 < 76) {
            return "1st: " + grade3 + "%" + " = B";
        }
        if (grade3 > 60 && grade3 < 66) {
            return "1st: " + grade3 + "%" + " = C+";
        }
        if (grade3 > 55 && grade3 < 61) {
            return "1st: " + grade3 + "%" + " = C";
        }
        if (grade3 > 50 && grade3 < 56) {
            return "1st: " + grade3 + "%" + " = D";
        }
        if (grade3 > 0 && grade3 < 51) {
            return "1st: " + grade3 + "%" + " = E";
        }

        return null;
    }

    public static String grades4(int grade4) {

        if (grade4 > 90 && grade4 < 100) {
            return "2st: " + grade4 + "%" + " = A+";
        }
        if (grade4 > 80 && grade4 < 91) {
            return "2st: " + grade4 + "%" + " = A";
        }
        if (grade4 > 75 && grade4 < 81) {
            return "2st: " + grade4 + "%" + " = B+";
        }
        if (grade4 > 65 && grade4 < 76) {
            return "2st: " + grade4 + "%" + " = B";
        }
        if (grade4 > 60 && grade4 < 66) {
            return "2st: " + grade4 + "%" + " = C+";
        }
        if (grade4 > 55 && grade4 < 61) {
            return "2st: " + grade4 + "%" + " = C";
        }
        if (grade4 > 50 && grade4 < 56) {
            return "2st: " + grade4 + "%" + " = D";
        }
        if (grade4 > 0 && grade4 < 51) {
            return "2st: " + grade4 + "%" + " = E";
        }

        return null;
    }

    public static String grades5(int grade5) {

        if (grade5 > 90 && grade5 < 100) {
            return "2st: " + grade5 + "%" + " = A+";
        }
        if (grade5 > 80 && grade5 < 91) {
            return "2st: " + grade5 + "%" + " = A";
        }
        if (grade5 > 75 && grade5 < 81) {
            return "2st: " + grade5 + "%" + " = B+";
        }
        if (grade5 > 65 && grade5 < 76) {
            return "2st: " + grade5 + "%" + " = B";
        }
        if (grade5 > 60 && grade5 < 66) {
            return "2st: " + grade5 + "%" + " = C+";
        }
        if (grade5 > 55 && grade5 < 61) {
            return "2st: " + grade5 + "%" + " = C";
        }
        if (grade5 > 50 && grade5 < 56) {
            return "2st: " + grade5 + "%" + " = D";
        }
        if (grade5 > 0 && grade5 < 51) {
            return "2st: " + grade5 + "%" + " = E";
        }

        return null;
    }

    public static String grades6(int grade6) {

        if (grade6 > 90 && grade6< 100) {
            return "2st: " + grade6 + "%" + " = A+";
        }
        if (grade6 > 80 && grade6 < 91) {
            return "2st: " + grade6 + "%" + " = A";
        }
        if (grade6 > 75 && grade6 < 81) {
            return "2st: " + grade6 + "%" + " = B+";
        }
        if (grade6 > 65 && grade6 < 76) {
            return "2st: " + grade6 + "%" + " = B";
        }
        if (grade6 > 60 && grade6 < 66) {
            return "2st: " + grade6 + "%" + " = C+";
        }
        if (grade6 > 55 && grade6 < 61) {
            return "2st: " + grade6 + "%" + " = C";
        }
        if (grade6 > 50 && grade6 < 56) {
            return "2st: " + grade6 + "%" + " = D";
        }
        if (grade6 > 0 && grade6 < 51) {
            return "2st: " + grade6 + "%" + " = E";
        }

        return null;
    }

    public static String averagegrade(int overall) {

        if (overall > 90 && overall< 100) {
            return "Final Grade: " + overall + "%" + " is equal to a A+";
        }
        if (overall > 80 && overall < 91) {
            return "Final Grade: " + overall + "%" + " is equal to a A";
        }
        if (overall > 75 && overall < 81) {
            return "Final Grade: " + overall + "%" + " is equal to a B+";
        }
        if (overall > 65 && overall < 76) {
            return "Final Grade: " + overall + "%" + " is equal to a B";
        }
        if (overall > 60 && overall < 66) {
            return "Final Grade: " + overall + "%" + " is equal to a C+";
        }
        if (overall > 55 && overall < 61) {
            return "Final Grade: " + overall + "%" + " is equal to a C";
        }
        if (overall > 50 && overall < 56) {
            return "Final Grade: " + overall + "%" + " is equal to a D";
        }
        if (overall > 0 && overall < 51) {
            return "Final Grade: " + overall + "%" + " is equal to a E";
        }

        return null;
    }



        public static int average(int grade, int grade2, int grade3, int grade4, int grade5, int grade6) {
            return ((grade + grade2 + grade3 + grade4 + grade5 + grade6) / 6);


        }

}
