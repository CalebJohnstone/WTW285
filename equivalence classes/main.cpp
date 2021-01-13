/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

void equivClasses(){
    int a[] = {-3, -1, 1, 3};
    
    for(int i = 0; i < 4; ++i){
        for(int j = 0; j < 4; ++j){
            cout << "(a = " << a[i] << ", b = " << a[j] << "): " << (a[i]*a[j]) << endl;
        }
    }
}

int main()
{
    equivClasses();

    return 0;
}
