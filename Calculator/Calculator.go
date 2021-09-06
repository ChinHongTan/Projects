package main
import ("fmt")
func prompt(mode int) {
	var first, second, result float64
	fmt.Println("Enter first number: ")
	fmt.Scanln(&first)
	fmt.Println("Enter second number: ")
	fmt.Scanln(&second)
	switch mode {
		case 1: result = first + second
		case 2: result = first - second
		case 3: result = first * second
		case 4: result = first / second
	}
	fmt.Println("Result:", result)
}
func main() {
	var mode int
	fmt.Println("Mode: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division")
	fmt.Scanln(&mode)
	prompt(mode)
}