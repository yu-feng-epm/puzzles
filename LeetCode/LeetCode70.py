"""
 Question:
 You are climbing a staircase. It takes n steps to reach the top.
 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 Constraints: 1 <= n <= 45
"""
def climbStairs(n):
  if n == 1:
    return 1
  elif n == 2:
    return 2
  else:
    return climbStairs(n-1) + climbStairs(n-2)

for n in [3, 4, 5]:
  print("There are ", climbStairs(n), " approaches for ", n, " steps.")
