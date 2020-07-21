package Fifth;

// 문제 2. 일반 학사와 석사 학생의 성적 관리 프로그램을 작성한다.
//      성적 관리시 평균과 표준 편차를 계산하도록 한다.

class Undergraduate extends Student{
    private double grade[];

    public Undergraduate(int age, String major, String name,
                         int math, int science, int english, int korean) {
        super(age, major, name);
        grade = new double[4];
        grade[0] = math;
        grade[1] = science;
        grade[2] = english;
        grade[3] = korean;
    }

    public void avgUnderGraduate() {
        System.out.println(mean(grade));
    }
    public void sttdevUnderGraduate() {
        System.out.println(standardDeviation(grade, 0));
    }

    public static double mean(double[] array) {  // 산술 평균 구하기
        double sum = 0.0;

        for (int i = 0; i < array.length; i++)
            sum += array[i];

        return sum / array.length;
    }

    public static double standardDeviation(double[] array, int option) {
        if (array.length < 2) return Double.NaN;

        double sum = 0.0;
        double sd = 0.0;
        double diff;
        double meanValue = mean(array);

        for (int i = 0; i < array.length; i++) {
            diff = array[i] - meanValue;
            sum += diff * diff;
        }
        sd = Math.sqrt(sum / (array.length - option));

        return sd;
    }

}

class Graduate extends Student{
    private int math;
    private int science;
    private int english;
    private int korean;

    public Graduate(int age, String major, String name,
                    int math, int science, int english, int korean) {
        super(age, major, name);
        this.math = math;
        this.science = science;
        this.english = english;
        this.korean = korean;
    }

    public int avgGraduate() {
        return (math+science+english+korean)/4;
    }

    public int stddevGraduate() {
        int stddev=0;
        int avg = avgGraduate();
        stddev = (math-avg)+(science-avg)+(english-avg)+(korean-avg);

        return stddev;
    }
}

class Student {
    int age;
    String major;
    String name;

    public Student(int age, String major, String name) {
        this.age = age;
        this.major = major;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getMajor() {
        return major;
    }
    public String getName() {
        return name;
    }
}

public class StudentTest {
    public static void main(String[] args) {
//        Student student1 = new Undergraduate(
//                23, "it", "lee", 90, 30, 42, 30
//        );
        Undergraduate student1 = new Undergraduate(
                23, "it", "lee", 90, 30, 42, 30
        );
        student1.avgUnderGraduate();
        student1.sttdevUnderGraduate();

        Student student2 = new Student(12, "it", "jinh");

    }
}
