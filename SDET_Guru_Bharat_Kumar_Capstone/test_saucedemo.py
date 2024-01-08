import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

@pytest.fixture
def driver():
    # Set up the Chrome WebDriver
    driver = webdriver.Chrome(executable_path="C://Users//BHARATMALEPATI//Desktop//SDET_Capstone//chromedriver-win64 (2)//chromedriver-win64//chromedriver.exe")
    driver.maximize_window()
    yield driver
    # Teardown - Quit the WebDriver after the test
    driver.quit()

def test_launch_url(driver):
    # Launch the URL
    driver.get("https://www.saucedemo.com/")
    assert "Swag Labs" in driver.title

def test_add_to_cart_and_logout(driver):
    # Login and Add item to cart
    login(driver)
    add_item_to_cart(driver)
    verify_item_added_to_cart(driver)
    logout(driver)

def login(driver):
    # Perform login
    username = "standard_user"
    password = "secret_sauce"
    driver.find_element(By.ID, "user-name").send_keys(username)
    driver.find_element(By.ID, "password").send_keys(password)
    driver.find_element(By.ID, "login-button").click()

def add_item_to_cart(driver):
    # Add item to cart
    add_to_cart_button = driver.find_element(By.XPATH, "//button[text()='ADD TO CART']")
    add_to_cart_button.click()
    # Move to the right corner of the button
    ActionChains(driver).move_to_element(add_to_cart_button).perform()

def verify_item_added_to_cart(driver):
    # Verify item is added to the cart
    cart_badge = WebDriverWait(driver, 10).until(EC.visibility_of_element_located((By.CLASS_NAME, "shopping_cart_badge")))
    assert cart_badge.is_displayed()

def logout(driver):
    # Logout
    menu_button = driver.find_element(By.CLASS_NAME, "bm-burger-button")
    menu_button.click()
    logout_button = driver.find_element(By.ID, "logout_sidebar_link")
    logout_button.click()
