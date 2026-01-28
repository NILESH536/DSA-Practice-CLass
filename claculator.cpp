// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

int main() {
    int num1;
    int num2;
    int result;
    string ops;
    cout<<"Enter the number1: "<<endl;
    cin>>num1;
    cout<<"Enter the number2: "<<endl;
    cin>>num2;
    cout<<"Enter the operation: "<<endl;
    cin>>ops;
    if(ops =="add"){
        result = num1+num2;
        cout<<result;
       
    }
    else if(ops =="mult"){
        result = num1*num2;
        cout<<result;
       
    }
    else if(ops =="sub"){
        result = num1-num2;
        cout<<result;
       
    }
    else if(ops =="div"){
        result = num1/num2;
        cout<<result;
        
    }
    else if(ops =="shitr"){
        result = num1>>num2;
        cout<<result;
       
    }
    else if(ops=="shiftl"){
        result = num1<<num2;
        cout<<result;
  
    }
    else{
        cout<<"invalid";
    }
    
    return 0;
}