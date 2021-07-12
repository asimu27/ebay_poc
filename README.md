# ebay_poc
Test Suites for ebay

Tools Used: Java, Selenium, JUnit

Scope of Testing
Test Case 1: Verify item added to cart is displayed in the cart.
1.   Navigate to ebay.com.au
2.   Search for ‘bike’
3.   Click on the first bike item in the list
4.   Click on ‘Add to cart’
5.   Go to cart
6.   Verify that the item is displayed in the cart


Test Case 2: Verify error messages when logging in without username or password
1.   Navigate to ebay.com.au
2.   Click on ‘My Ebay’ located on the top right corner
3.   Leave the username or email blank
4.   Click ‘Continue’
5.   Verify the error message ‘Oops, that’s not a match’

