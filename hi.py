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
        
    

