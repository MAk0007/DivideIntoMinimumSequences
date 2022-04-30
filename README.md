# DivideIntoMinimumSequences
DivideIntoMinimumSequences is a program that inputs three parameters(n, k, arr) and returns the number of minimum sequences the arr can be divided into with a special condition for k

Detailed Explanation:
Requirement: 
We are given an array Arr of length 'n' and an integer 'k'

we need to divide Arr into the minimum number of sequences such that each element of Arr belongs to exactly one sequence. Moreover. for each valid sequence the following condition must hold-
  * After rearranging the sequence in a random order, the sum of every adjacent pair must be divisible by 'k'
 
Find the minimum number of valid sequences that Arr can be divided into.

Test Cases:<br />
 i)input: n=1, k=4, Arr = [5]<br />
 output: 1<br />
 description: Arr is [5] hence 1 sequence is enough which is [5].<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Since there are no two adjacent elements.<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hence the answer is 1.<br />
              
 ii)input: n=2, k=2, Arr = [4,5]<br />
 output: 2<br />
 description: Arr is [4,5]<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;We need 2 sequences [4], [5].<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;It's not possible to have a single sequence because (4+5) is not divisible by 2.<br />
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hence the answer is 2.<br />
 
 iii)input: n=5, k=5, Arr = [5,4,1,7,6]<br />
 output: 3<br />
 description: Arr is [5,4,1,7,6]<br />
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;It can be divided into [5], [4,1,6] and [7].<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;After rearranging [4,1,6] --> [1,4,6] where adjacent (1+4) and (4+6) both are divisible by 5.<br />
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hence the answer is 3.<br />
