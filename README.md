
# Sorting an array of Any random size by taking any random input in between 0 to 100


For this code i have used command line input in which first input define what will be the the no of test cases.
then the next line define the size of array you want.

So, for taking input i have used the "Scanner" class object so it will take input by reading each integer and line by line.


So firstly i m filling the array(here i have used ArrayList) with the random number then after it i am giving this array as
argument to a function "Permute" which basically does it permute over each possible different pattern and then stores each 
into a temporary array and then by using "CHECK" function it get verfied wheter it is in sorted form or not if yes then that check
function return true otherwise return false.

Now coming to point why i have named it as non efficient program because what it does is basicall it find all permutation of 
oo any given array and out of that it finds wheter it is sorted or not

so for small array size may be it will take less time(that is a very less probability) but for large number it is very time taking
algorithm it may take yeas or more than that.

In worst cases we will have to travel N! times which is very time taking....
