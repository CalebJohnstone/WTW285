/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <tuple>		// std::tuple, std::make_tuple, std::tie
using namespace std;

// Function for Extended Euclidean algorithm
// It returns multiple values using tuple in C++
tuple<int, int, int> extended_gcd(int a, int b)
{
	if (a == 0)
		return make_tuple(b, 0, 1);

	int gcd, x, y;

	// unpack tuple  returned by function into variables
	tie(gcd, x, y) = extended_gcd(b % a, a);

	return make_tuple(gcd, (y - (b/a) * x), x);
}

// main function
int main()
{
	int a = 18;
	int b = 24;

	tuple<int, int, int> t = extended_gcd(a, b);
	
	int gcd = get<0>(t);
	int x = get<1>(t);
	int y = get<2>(t);
	
	cout << "GCD is " << gcd << endl;
	cout << "x = " << x << " y = " << y << endl;

	cout << a << "*" << x << " + " << b << "*" << y << " = " << gcd << endl;

	return 0;
}
