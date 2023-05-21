package model;

public class EmployeeFulltime extends Employee {
    @Override
    public double tinhLuong() {
        return 500;
    }
    @Override
    public String toString() {
// TODO Auto-generated method stub
        return super.toString() + " --> FullTime=" + tinhLuong();
    }
}