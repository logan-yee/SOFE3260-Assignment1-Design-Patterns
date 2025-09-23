# SOFE3260-Assignment1-Design-Patterns
Assignment 1 for System Design &amp; Architecture - SOFE3260 
This project implements a smart home system using design patterns like the abstract factory, factory method, template method and strategy. This github repository has all the source code inside the smarthome package organized into different parts. The abstractdevice abstractbulb and abstractlock classes gives shared functionality for the devices while bulbA bulbB lockA and lockB classes are representing devices from 2 different brands. The smartdevicefactory interface along with brandAfactory and brandBfactory allows the making of devices from specific brands. The usagereader interface and the fileusagereader implementation handle loading device usage values from external files. A data folder is included to store configuration text files, which define usage values for each device type. Together these components show the structure and define the smart home application

UML Diagram:
<img width="1151" height="814" alt="image" src="https://github.com/user-attachments/assets/929dd01d-6c13-4b72-a60a-16735978c323" />

Test Files: 
A TestRunner class is included to demonstrate and validate the design: it creates a Bulb from Brand A and a Lock from Brand B, performs actions on them, and checks their usage values against the expected results, printing pass/fail messages and a summary of the tests.

How to work the test:

To compile and run the project, open a terminal in the root directory and execute the provided commands. First, compile all Java source files into the out directory using javac -d out $(Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName }). Then, run the test suite with java -cp out smarthome.TestRunner. This will execute the TestRunner class, which demonstrates the system using a Bulb from Brand A and a Lock from Brand B, and prints the results of the test cases along with a summary of passed and failed checks.

Sample Test:


<img width="762" height="184" alt="image" src="https://github.com/user-attachments/assets/c3de7ed7-4dd7-4f00-805b-8c6aee5a4c52" />


