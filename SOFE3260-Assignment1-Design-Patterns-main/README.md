# SOFE3260-Assignment1-Design-Patterns
Assignment 1 for System Design &amp; Architecture - SOFE3260 
This project implements a smart home system using design patterns like the abstract factory, factory method, template method and strategy. This github repository has all the source code inside the smarthome package organized into different parts. The abstractdevice abstractbulb and abstractlock classes gives shared functionality for the devices while bulbA bulbB lockA and lockB classes are representing devices from 2 different brands. The smartdevicefactory interface along with brandAfactory and brandBfactory allows the making of devices from specific brands. The usagereader interface and the fileusagereader implementation handle loading device usage values from external files. A data folder is included to store configuration text files, which define usage values for each device type. Together these components show the structure and define the smart home application

UML Diagram:
<img width="1151" height="814" alt="image" src="https://github.com/user-attachments/assets/929dd01d-6c13-4b72-a60a-16735978c323" />

Test Files: 
The project also includes`a test driver that demonstrates the design with two examples: turning on a Bulb from Brand A and locking a Lock from Brand B, with their usage values displayed from the configuration files.
