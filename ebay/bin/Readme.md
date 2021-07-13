ebay_poc
Test Suites for ebay

Tools Used: Java, Selenium, JUnit

Scope of Testing Test Case 1: Verify item added to cart is displayed in the cart.

Navigate to ebay.com.au
Search for ‘bike’
Click on the first bike item in the list
Click on ‘Add to cart’
Go to cart
Verify that the item is displayed in the cart
Test Case 2: Verify error messages when logging in without username or password

Navigate to ebay.com.au
Click on ‘My Ebay’ located on the top right corner
Leave the username or email blank
Click ‘Continue’
Verify the error message ‘Oops, that’s not a match’
