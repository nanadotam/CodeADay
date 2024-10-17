#include <iostream>
#include <fstream>

using namespace std;

/*
Write the definition of the function inputArray that prompts the user to input 20 numbers and
stores the numbers into alpha.
*/

void inputArray(int alpha[], int size){
    /**
    * Takes an input array and its size, and prompts the user to input the numbers.
    * 
    * @param alpha The array to store the numbers.
    * @param size The size of the array.
    */
    cout << "Please enter " << size << " numbers:" << endl;
    for (int i = 0; i < size; ++i){
        cin >> alpha[i];
    }
}

void doubleArray(const int alpha[], int beta[], int size){
    /**
    * Initializes the elements of beta to two times the corresponding elements in alpha.
    * Doesn't modify the elements of alpha.
    * 
    * @param alpha The input array whose elements are to be doubled.
    * @param beta The array to store the doubled values.
    * @param size The size of the arrays.
    */
    for (int i = 0; i < size; ++i){
        beta[i] = 2 * alpha[i];
    }
}

void copyAlphaBeta(const int alpha[], const int beta[], int matrix[10][4]){
    /**
    * Stores the elements of alpha into the first five rows of matrix and beta 
    * into the last five rows of matrix.
    * Doesn't modify elements of alpha and beta.
    * 
    * @param alpha The input array whose elements are to be stored in the first five rows.
    * @param beta The input array whose elements are to be stored in the last five rows.
    * @param matrix The 2D array to store the elements.
    */
    for (int i = 0; i < 5; ++i){
        for (int j = 0; j < 4; ++j){
            matrix[i][j] = alpha[i * 4 + j];
        }
    }
    for (int i = 5; i < 10; ++i){
        for (int j = 0; j < 4; ++j){
            matrix[i][j] = beta[(i - 5) * 4 + j];
        }
    }
}

void printArray(const int arr[], int size){
    for (int i = 0; i < size; ++i){
        cout << arr[i] << " ";
        // print 15 elements per line
        if ((i + 1) % 15 == 0) 
            cout << endl;
    }
    // if last line is not complete, print a new line
    if (size % 15 != 0) 
        cout << endl;
}

void printMatrix(int matrix[10][4]){
    for (int i = 0; i < 10; i++){
        for (int j = 0; j < 4; j++){
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
}

int main(){
    int alpha[20];
    int beta[20];
    int matrix[10][4];

    inputArray(alpha, 20);
    doubleArray(alpha, beta, 20);
    copyAlphaBeta(alpha, beta, matrix);

    cout << "Alpha array:" << endl;
    printArray(alpha, 20);

    cout << "Beta array:" << endl;
    printArray(beta, 20);

    cout << "Matrix:" << endl;
    printMatrix(matrix);

    return 0;
}
