def prompt(mode):
    first = int(input("First number: "))
    second = int(input("Second number: "))
    if mode == 1: return print("Result: " + str(first + second))
    if mode == 2: return print("Result: " + str(first - second))
    if mode == 3: return print("Result: " + str(first * second))
    if mode == 4: return print("Result: " + str(first / second))
mode = int(input("Mode: \n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n"))
prompt(mode)