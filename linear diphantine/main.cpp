#include <iostream>

using namespace std;

int main()
{
    for(int t = -10; t <= 10; ++t){
        int x = 18 + 11*t;
        int y = -24 - 15*t;
        
        int lhs = 45*x+33*y;
        cout << "(x = " << x << ", y = " << y << ") => " << lhs << endl;
    }

    return 0;
}
