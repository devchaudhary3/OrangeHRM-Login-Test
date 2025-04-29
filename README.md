# OrangeHRM-Login-Test
Logs in to a website and verifies dashboard .It Uses Selenium to interact with browser and HTML elements
# OrangeHRM Login Test Automation

This project is a simple **functional UI test** for the OrangeHRM demo website using **Selenium WebDriver with Java and Maven**.

----------------------------------------------------------------------------------------------------

Project Overview

This automation script performs the following actions:

- Launches Chrome browser  
- Opens OrangeHRM demo login page  
- Enters valid credentials  
- Clicks the login button  
- Verifies if the login was successful by checking for the presence of the "Dashboard" heading  

----------------------------------------------------------------------------------------------------

 Tools & Technologies Used

 Tool                                    Purpose                                             

 Java                             Programming language                                
 Selenium WebDriver               Web browser automation                             
 Maven                            Dependency management                               
 WebDriverManager                 Automatically manages compatible browser drivers 
 Eclipse IDE                      Writing and running the Java code                   |

----------------------------------------------------------------------------------------------------

 --Project Structure & Setup

 Maven `pom.xml` Dependencies

```xml
<dependencies>
    <!-- Selenium Core Library -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.6.0</version>
    </dependency>

    <!--  WebDriverManager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.3.2</version>
    </dependency>
</dependencies>

-----------------------------------------------------------------------------------------------------
How to Run the Test
Clone this repository or download the ZIP

Open the project in Eclipse or IntelliJ

Ensure ChromeDriver is set correctly or use WebDriverManager

Run LoginTest.java
------------------------------------------------------------------------------------------------------
  Test Case Breakdown

Step	Action
1)	Open OrangeHRM login page
2)	Enter username and password
3)	Click the login button
4)	Wait for the page to load
5)	Verify that the Dashboard heading is shown
-------------------------------------------------------------------------------------------------------
   What is Being Tested?
Functionality of the login page

Whether valid credentials allow access

If the user is taken to the Dashboard after login

