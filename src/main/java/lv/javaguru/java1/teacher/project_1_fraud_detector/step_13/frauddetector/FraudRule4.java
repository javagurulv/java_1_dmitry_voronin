package lv.javaguru.java1.teacher.project_1_fraud_detector.step_13.frauddetector;

class FraudRule4 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
}
