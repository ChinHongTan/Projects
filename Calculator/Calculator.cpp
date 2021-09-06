#include <iostream>
using namespace std;
void prompt(int mode) {
    double first, second, result;
    cout << "First number: ";
    cin >> first;
    cout << "Second number: ";
    cin >> second;
    if (mode == 1) result = first + second;
    if (mode == 2) result = first - second;
    if (mode == 3) result = first * second;
    if (mode == 4) result = first / second;
    cout << "Result: " << result << "\n";
}
int main() {
    int mode;
    cout << "Mode: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n";
    cin >> mode;
    prompt(mode);
    return 0;
}