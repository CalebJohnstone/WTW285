#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    //begin: INPUT
    
    //inital values
    int a0 = 1;
    int a1 = 8;
    
    //ak = Aak−1 + Bak−2
    int A = 1;
    int B = 2;
    
    //end: INPUT
    
    //get solutions to characteristic equation: t^2 - At - B = 0
    int r = (A + sqrt(pow(A,2) + 4*B))/2;
    int s = (A - sqrt(pow(A,2) + 4*B))/2;
    
    cout << "r: " << r << endl;
    cout << "s: " << s << endl;
    
    //C+D = a0
    //r*C + s*D = a1 => D = (a1 - r*a0)/(s-r)
    int D = (a1 - r*a0)/(s-r);
    int C = a0-D;
    
    cout << "C: " << C << endl;
    cout << "D: " << D << endl;
    cout << "f(k) := " << C << "(" << r << ")^k " << (D > 0 ? "+" : "") << D << "(" << s << ")^k (k >= 0)" << endl; 

    return 0;
}

