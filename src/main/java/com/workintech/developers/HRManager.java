package com.workintech.developers;

public class HRManager extends Employee {
    protected JuniorDeveloper[] juniorDevelopers;
    protected MidDeveloper[] midDevelopers;
    protected SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10]; // Boyutunu ihtiyacınıza göre belirleyin
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    public HRManager(int id, String name, int salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;

    }

    @Override
    public void work() {
        setSalary(70000);
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for (int i = 0; i <= juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                return;
            } else {
                System.out.println("this index is already full");
            }
        }
    }public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                return;
            } else {
                System.out.println("this index is already full");
            }
        }
    }public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                return;
            } else {
                System.out.println("this index is already full");
            }
        }
    }

}
