# import pytest
# import allure
#
#
# @pytest.hookimpl(hookwrapper=True)
# def pytest_runtest_makereport(item, call):
#     outcome = yield
#     report = outcome.get_result()
#
#     if report.when == 'call':
#         # Получаем название теста
#         with allure.step('Test details'):
#             allure.attach(f'{report.nodeid}', 'Test Name', allure.attachment_type.TEXT)
#
#             # Получаем входные данные
#             input_data = getattr(item, 'callspec', None)
#             if input_data:
#                 allure.attach(str(input_data.params), 'Input Data', allure.attachment_type.TEXT)
#             else:
#                 allure.attach('No data', 'Input Data', allure.attachment_type.TEXT)
#
#             # Получаем выходные данные (если они есть)
#             output_data = getattr(report, 'result', 'No data')
#             allure.attach(str(output_data), 'Output Data', allure.attachment_type.TEXT)
#
#             # Добавляем документацию теста
#             allure.attach(item.function.__doc__, 'Description', allure.attachment_type.TEXT)
#
#
# def test_add_numbers(a, b):
#     """
#     Тест для проверки сложения двух чисел.
#     """
#     return a + b
#
#
# def test_multiply_numbers(a, b):
#     """
#     Тест для проверки умножения двух чисел.
#     """
#     return a * b
#
#
# if __name__ == '__main__':
#     pytest.main(['--alluredir', 'reports'])