package model;

public class EmployeeParttime extends Employee {
    @Override
    public double tinhLuong() {
// TODO Auto-generated method stub
        return 150;
    }
    @Override
    public String toString() {
// TODO Auto-generated method stub
        return super.toString() + " --> PartTime=" + tinhLuong();
    }
}