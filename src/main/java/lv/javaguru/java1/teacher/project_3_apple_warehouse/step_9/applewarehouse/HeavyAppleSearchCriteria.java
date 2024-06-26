package lv.javaguru.java1.teacher.project_3_apple_warehouse.step_9.applewarehouse;

class HeavyAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}
