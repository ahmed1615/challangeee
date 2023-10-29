# Selenium-Java-testNG Framework

A Maven framework in which to build Selenium tests written in Java with Allure reports of test results.


### Run tests locally

write the name of TESTCASE into testNG.xml file into <class name="test.TESTCASE NAME"/> tag 

### Defining the browser

By default, the project will default to ChromeLocal (running a local Chrome instance) if no browser is specified.

to change the browser change the value of the browser name form <parameter name="browser" value="chrome"></parameter> into testNG.xl file 
but in this case just one browser is available "Chrome" with version 118.*

### available browser
chrome 

### only 1 scenario 
ScenarioTest.java 
### Notes
all the elements and methods are in one class "HomePage.java" and the scenarios are in one class "Scenariotest.java"
