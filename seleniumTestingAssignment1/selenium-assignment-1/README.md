# Exercise: Opening Different Browsers Using WebDriver in Java

In this exercise, you will create a WebDriver script in Java to open different browsers and navigate to a sample web page.

## Application Information

We will be using a simple web page [Google](https://www.google.com) for this exercise.

## Tasks

1. Open the Selenium WebDriver documentation and download the WebDriver for your preferred browsers (e.g., Chrome, Firefox, Edge).
2. Extract the WebDriver executable for each browser and add it to your system PATH.
3. Create a new Java project in your Integrated Development Environment (IDE).
4. Add the Selenium WebDriver dependency to your project.
5. Create a new class called `BrowserTests`.
6. Create a new test method called `testOpenDifferentBrowsers` that does the following for each browser:
   - Creates a new instance of the WebDriver for the browser.
   - Navigates to the sample web page URL.
   - Extracts the greeting message from the page.
   - Verifies that the greeting message is correct.
   - Closes the WebDriver instance for the browser.

