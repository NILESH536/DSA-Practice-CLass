#include <iostream>
using namespace std;

int main() {
    float *ptr1 = new float(2.35);
    float **ptr2 = &ptr1;
    float ***ptr3 = &ptr2;
    cout<<ptr2<<endl;
    cout<<ptr3<<endl;

    return 0;
}
