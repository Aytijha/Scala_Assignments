import math
def SieveOfEratosthenes(n):
      
    # Create a boolean array "prime[0..n]" and initialize all entries it as true
    # A value in prime[i] will finally be false if i is Not a prime, else true
    prime = [True for i in range(n+1)]
     
    prime_list = [] # will contain all the prime numbers upto square root of input

    p = 2
    while(p * p <= n): 
        # If prime[p] is not changed, then it is a prime
        if (prime[p] == True):
            # Update all multiples of p
            for i in range(p * p, n + 1, p):
                prime[i] = False
        p += 1
    
    c = 0
    # append all prime numbers
    for p in range(2, n+1):
        if prime[p]:
            prime_list.append(p)
    return prime_list

#checking for divisibility by the numbers in the prime list
def prime_check(n, prime_list):
    for i in prime_list:
        if n%i == 0:
            print('Not Prime')
            return
    print('Prime')
    return

# driver code
x = int(input('Enter the number to check: '))
# 0 or 1 are not prime numbers
if (x == 0 or x == 1):
    print('Not Prime')
# 2 is the only even prime number
elif x == 2:
    print('Prime')
# no other even numbers are prime
elif x%2 == 0:
    print('Not Prime')
# check for the rest
else:
    prime_list_upto_sqrt_n = SieveOfEratosthenes(math.ceil(math.sqrt(x)))
    # print('Prime List upto square root of Input: ', prime_list_upto_sqrt_n)
    prime_check(x, prime_list_upto_sqrt_n)