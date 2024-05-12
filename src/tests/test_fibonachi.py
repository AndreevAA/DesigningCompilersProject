import pytest
import allure


@pytest.hookimpl(hookwrapper=True)
def pytest_runtest_makereport(item, call):
    outcome = yield
    report = outcome.get_result()

    if report.when == 'call':
        # Получаем название теста
        with allure.step('Test details'):
            allure.attach(f'{report.nodeid}', 'Test Name', allure.attachment_type.TEXT)

            # Получаем входные данные
            input_data = getattr(item, 'callspec', None)
            if input_data:
                allure.attach(str(input_data.params), 'Input Data', allure.attachment_type.TEXT)
            else:
                allure.attach('No data', 'Input Data', allure.attachment_type.TEXT)

            # Получаем выходные данные
            if hasattr(report, 'result'):
                allure.attach(str(report.result), 'Output Data', allure.attachment_type.TEXT)
            else:
                allure.attach('No data', 'Output Data', allure.attachment_type.TEXT)

            # Добавляем документацию теста
            allure.attach(item.function.doc, 'Description', allure.attachment_type.TEXT)


@pytest.mark.parametrize("a, b, expected_result", [(1, 2, 3), (3, 4, 7)])
def test_add_numbers(a, b, expected_result):
    """
    Тест для проверки сложения двух чисел.
    """
    result = a + b
    assert result == expected_result


@pytest.mark.parametrize("a, b, expected_result", [(1, 2, 2), (3, 4, 12)])
def test_multiply_numbers(a, b, expected_result):
    """
    Тест для проверки умножения двух чисел.
    """
    result = a * b
    assert result == expected_result


if __name__ == 'main':
    pytest.main(['--alluredir', 'reports'])
