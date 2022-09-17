package com.ibik.pbo.pertemuan2;

public class Students {
	int NPM;
	String FullName;
	String ClassName;
	int Semester;
	double GPA;
	
	int GetNPM (int value) {
		NPM = value;
		return NPM;
	}	
	String GetFullName(String value) {
		FullName = value;
		return FullName;
	}
	String GetClassName(String value) {
		ClassName = value;
		return ClassName;
	}
	int GetSemester(int value) {
		Semester = value;
		return Semester;
	}
	double GetGPA(double value) {
		GPA = value;
		return GPA;
	}
	
}
