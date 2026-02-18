package Problem03;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord<T extends Number> {
    private List<T> grades = new ArrayList<>();

    public void addGrade(T grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (T g : grades) sum += g.doubleValue();
        return sum / grades.size();
    }
}
