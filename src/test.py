import unittest
from prettytable import PrettyTable
import compiler

class TestStringMethods(unittest.TestCase):
    
    def test_multiply_procedure(self):

        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("Multiply 5 5"), " 0 40 25")
        self.assertEqual(compiler.Exec("Multiply 0 0"), " 0 0 0")
        self.assertEqual(compiler.Exec("Multiply -1 -1"), " -1 -1 0")
        self.assertEqual(compiler.Exec("Multiply 0 -1"), " 0 -1 0")
        self.assertEqual(compiler.Exec("Multiply 1000 9999"), " 0 10238976 9999000")

    def test_divide_procedure(self):

        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("Divide 9 5"), " 9 5 1 4")
        self.assertEqual(compiler.Exec("Divide -1 5"), " -1 5 0 -1")
        self.assertEqual(compiler.Exec("Divide 12 9"), " 12 9 1 3")

    def test_bin_search(self):
        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("BinSearch 9 2 3 4 5 6 7 8 9 10 2"), " 1 1 3")
        self.assertEqual(compiler.Exec("BinSearch 6 1 3 5 7 9 11 6"), " 3 3 7")
        self.assertEqual(compiler.Exec("BinSearch 5 4 5 6 7 8 9 4"), " 5 5 11")
        self.assertEqual(compiler.Exec("BinSearch 8 1 2 3 4 5 6 7 8 8"), " 8 8 10")

    def test_fibonachi(self):
        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("Fibonacci 20"), " 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765")
        self.assertEqual(compiler.Exec("Fibonacci 1"), " 0 1")
        self.assertEqual(compiler.Exec("Fibonacci 5"), " 0 1 1 2 3 5")
        self.assertEqual(compiler.Exec("Fibonacci 8"), " 0 1 1 2 3 5 8 13 21")

    def test_power_of_two(self):
        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("PowerOfTwo 2"), " 4")
        self.assertEqual(compiler.Exec("PowerOfTwo 3"), " 8")
        self.assertEqual(compiler.Exec("PowerOfTwo 5"), " 32")
        self.assertEqual(compiler.Exec("PowerOfTwo 10"), " 1024")
        self.assertEqual(compiler.Exec("PowerOfTwo 15"), " 32768")

    def test_bubble_sort(self):
        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("BubbleSort 5 3 1 4 2 5"), " 1 2 3 4 5")
        self.assertEqual(compiler.Exec("BubbleSort 0"), "")
        self.assertEqual(compiler.Exec("BubbleSort 1 10"), " 10")
        self.assertEqual(compiler.Exec("BubbleSort 4 1 2 3 4"), " 1 2 3 4")

    def test_factorial(self):
        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("Factorial 0"), " 1")
        self.assertEqual(compiler.Exec("Factorial 1"), " 1")
        self.assertEqual(compiler.Exec("Factorial 5"), " 120")
        self.assertEqual(compiler.Exec("Factorial 10"), " 3628800")
        self.assertEqual(compiler.Exec("Factorial 7"), " 5040")

    def test_reverse_array(self):
        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("ReverseArray 5 1 2 3 4 5"), " 5 4 3 2 1")
        self.assertEqual(compiler.Exec("ReverseArray 0"), "")
        self.assertEqual(compiler.Exec("ReverseArray 1 10"), " 10")
        self.assertEqual(compiler.Exec("ReverseArray 4 1 2 3 4"), " 4 3 2 1")
    def test_sum_of_series(self):
        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("SumOfSeries 5"), " 15")
        self.assertEqual(compiler.Exec("SumOfSeries 10"), " 55")
        self.assertEqual(compiler.Exec("SumOfSeries 1"), " 1")
        self.assertEqual(compiler.Exec("SumOfSeries 0"), " 0")
    def test_swap_elements(self):
        compiler.Compile(filename="tests/data/source.mod")
        compiler.Decode()
        compiler.Load()

        self.assertEqual(compiler.Exec("SwapElements 5 1 2 3 4 5"), " 2 1 4 3 5")
        self.assertEqual(compiler.Exec("SwapElements 4 5 10 15 20"), " 10 5 20 15")
        self.assertEqual(compiler.Exec("SwapElements 1 100"), " 100")
        self.assertEqual(compiler.Exec("SwapElements 0"), "")


if __name__ == '__main__':
    suite = unittest.TestLoader().loadTestsFromTestCase(TestStringMethods)
    result = unittest.TextTestRunner(verbosity=2).run(suite)

    table = PrettyTable()
    table.field_names = ['Test #', 'Test Name', 'Status']

    for i, test in enumerate(suite._tests):
        table.add_row([
            i + 1,
            test._testMethodName,
            'Passed' if result.wasSuccessful() else 'Failed'
        ])

    print(table)
