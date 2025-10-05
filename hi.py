print("Hello, Ishwarya! Your VS Code is working perfectly 🚀")
#reverse a String
def reverse_string(n):
    return n[::-1]
print(reverse_string("ishu"))
#palindrome
def  palindrome(n):
    return n==n[::-1]
print(palindrome("madam"))

def palindrome(n):
    if n%10==0:
        return False
    rev=0
    temp=n
    while temp>0:
        rev=rev*10+temp%10
        temp//=10
        return rev==n       
print(palindrome(121))
#factorial
def factorial(n):
    if n==0 or n==1:
        return 1
    else:
        return n*factorial(n-1)
print(factorial(9))
#Count vowels/consonants
def count_vowelsandconstants(s):
    vowels=0
    constants=0
    for i in s:
        if i in 'aeiouAEIOU':
            vowels+=1
        else:
            constants +=1
    return vowels,constants
v, c = count_vowelsandconstants("ishwarya")
print("Vowels:", v)
print("Consonants:", c)
#First non-repeating character
from collections import Counter
def firstnonrepeatingchar(s):
   count= Counter(s)
   for i in s:
       if count==1:
           print(s[i])
       else :
            print("All characters are repeating")
print(firstnonrepeatingchar("swiss"))


def first_non_repeating_char(s):
    char_count = {}     # Step 1: Create an empty dictionary to hold counts
    for ch in s:        # Step 2: Loop over every character in the string   in the same order they appear
        char_count[ch] = char_count.get(ch, 0) + 1  # Step 3: Update counts 
    return None # Step 4: Find the first non-repeating character                                        
print(first_non_repeating_char("ishwarya"))
#Armstrong number
def armstrong(n):
    order=len(str(n))
    sum=0
    temp=n
    while temp>0:
        digit=temp%10
        sum+=digit**order
        temp//=10
    return sum==n
print(armstrong(153))

        
    

