#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <iomanip>

using namespace std;

// Structure to hold student data
struct Student {
    string id;
    string answers;
    int score;
    char grade;
};

// Function to calculate grade based on score
char calculateGrade(int score) {
    /**
     * Calculates the percentage score based on a given score.
     * Assumes the maximum possible score is 40.
     * 
     * @param score The score obtained.
     * @return The percentage score.
     */
    double percentage = (score / 40.0) * 100;
    if (percentage >= 90) return 'A';
    if (percentage >= 80) return 'B';
    if (percentage >= 70) return 'C';
    if (percentage >= 60) return 'D';
    return 'F';
}

// Function to calculate score based on correct answers and student's answers
int calculateScore(const string& correctAnswers, const string& studentAnswers) {
    /**
     * Calculates the score based on the correct answers and the student's answers.
     * 
     * @param correctAnswers The correct answers.
     * @param studentAnswers The student's answers.
     * @return The score.
     */
    int score = 0;
    for (size_t i = 0; i < correctAnswers.size(); ++i) {
        if (i >= studentAnswers.size() || studentAnswers[i] == ' ') continue;
        if (studentAnswers[i] == correctAnswers[i]) {
            score += 2; // Correct answer
        } else {
            score -= 1; // Wrong answer
        }
    }
    return score;
}

// Correct answers: TFFTFFTTTTFFTFTFTFTT

int main() {
    // Hardcoded correct answers
    string correctAnswers = "TFFTFFTTTTFFTFTFTFTT";

    // Open the input file
    ifstream inputFile("students.txt");
    if (!inputFile) {
        cerr << "Error opening file!" << endl;
        return 1;
    }

    vector<Student> students;
    string id, answers;

    // Read each student's ID and answers from the file
    while (inputFile >> id >> ws && getline(inputFile, answers)) {
        Student student;
        student.id = id;
        student.answers = answers;
        student.score = calculateScore(correctAnswers, answers);
        student.grade = calculateGrade(student.score);
        students.push_back(student);
    }

    // Close the input file
    inputFile.close();

    // Print the results
    cout << left << setw(10) << "ID" << setw(25) << "Answers" << setw(10) << "Score" << "Grade" << endl;
    for (const auto& student : students) {
        cout << left << setw(10) << student.id << setw(25) << student.answers << setw(10) << student.score << student.grade << endl;
    }

    return 0;
}
