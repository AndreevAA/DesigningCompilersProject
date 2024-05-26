#pip install pytest-html
#pip install html5lib
#pip install py
#pip install allure-pytest
#pytest --html=report.html tests/
#pip install allure-commandline
export PATH=$PATH:/allure-2.29.0/bin
pytest --alluredir=tests/allure-results
allure generate tests/allure-results --output tests/allure-report
allure serve tests/allure-results