import pytest
import allure
import compiler


@pytest.mark.parametrize("x, y, expected_result", [(1, 2, " 0 40 25"), (5, 5, " 0 40 25"), (10, 12, " 0 40 25")])
def test_multiply_procedure(x, y, expected_result):

    compiler.Compile(filename="tests/data/source.mod")
    compiler.Decode()
    compiler.Load()

    result = compiler.Exec("Multiply " + str(x) + " " + str(y) + " ")

    return result == expected_result



if __name__ == 'main':
    pytest.main(['--alluredir', 'reports'])
