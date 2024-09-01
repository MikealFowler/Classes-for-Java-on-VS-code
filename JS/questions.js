//1 Maximum of Two Numbers
//Write a program that takes two integer variables, a and b, and prints the maximum of the two.
class NumberComparison {
    constructor(first, second) {
        this.first = first;
        this.second = second;
    }

    getMax() {
        if (this.first > this.second) {
            console.log('The bigger number of the two is: ' + this.first);
        } else {
            console.log('The bigger number of the two is: ' + this.second);
        }
    }
}
const compare = new NumberComparison(12, 15);

//2 Odd or Even
//Create a program that checks if a given integer n is odd or even and prints the result.
