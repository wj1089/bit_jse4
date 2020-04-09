package com.jse.grade;

public interface GradeService {
	public void setGrade(Grade[] grades);
	public Grade[] getGrades();
	public void setCount(int count);
	public void getCount();
	public void add(Grade grade);
	public int total(Grade grade);
	public int average(Grade grade);
	public String level(Grade grade);
	public String record(Grade grade);
	public String printGrades();	
	public String ranking();
}
