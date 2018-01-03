package com.example.louise.ReportCard;

public class ReportCard.java {

    /*** Student ID*/
    private int mStudentId;

    /*** Student First Name*/
    private String mStudentFirstName;

    /*** Student Last Name*/
    private String mStudentLastName;

    /*** Student Grade in English*/
    private char mEnglishGrade;

    /*** Student Grade in Dutch*/
    private int mDutchGrade;

    /*** Student Grade in Spanish*/
    private double mSpanishGrade;


    /*** Create new ReportCard object*/

    public ReportCard(int studentId, String studentFirstName, String studentLastName, char englishGrade, int dutchGrade, double spanishGrade) {
        mStudentId = studentId;
        mStudentFirstName = studentFirstName;
        mStudentLastName = studentLastName;
        mEnglishGrade = englishGrade;
        mDutchGrade = dutchGrade;
        mSpanishGrade = spanishGrade;
    }

    /*** Get Student ID*/
    public int getStudentId() {
        return mStudentId;
    }

    /*** Set Student ID*/
    public void setStudentId(int studentId) {
        mStudentId = studentId;
    }

    /*** Get Student First Name*/
    public String getStudentFirstName() {
        return mStudentFirstName;
    }

    /*** Set Student First Name*/
    public void setStudentFirstName(String studentFirstName) {
        mStudentFirstName = studentFirstName;
    }

    /*** Get Student Last Name*/
    public String getStudentLastName() {
        return mStudentLastName;
    }

    /*** Set Student Last Name*/
    public void setStudentLastName(String studentLastName) {
        mStudentLastName = studentLastName;
    }

    /*** Get Student Grade in English*/
    public char getEnglishGrade() {
        return mEnglishGrade;
    }

    /*** Set Student Grade in English*/
    public void setEnglishGrade(char englishGrade) {
        mEnglishGrade = englishGrade;
    }

    /*** Get Student Grade in Dutch*/
    public int getDutchGrade() {
        return mDutchGrade;
    }

    /*** Set Student Grade in Dutch*/
    public void setDutchGrade(int dutchGrade) {
        mDutchGrade = dutchGrade;
    }

    /*** Get Student Grade in Spanish*/
    public double getSpanishGrade() {
        return mSpanishGrade;
    }

    /*** Get Student Grade in Spanish*/
    public void setSpanishGrade(double spanishGrade) {
        mSpanishGrade = spanishGrade;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "\nID: " + mStudentId +
                "\nFirst name: " + mStudentFirstName +
                "\nLast name: " + mStudentLastName +
                "\nGrade in English: " + mEnglishGrade +
                "\nGrade in Dutch: " + mDutchGrade +
                "\nGrade in Spanish: " + mSpanishGrade + " }";

    }
}