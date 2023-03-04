# ST_CI_Project
Report on CI enironment setup and integration test

This report outlines the development of Continuous Integration (CI) using six different types of tools or components to automatically run unit and integration tests. The CI environment enables automated tests to be performed accurately, resulting in good quality assurance.

Continuous Integration is a software development practice that involves continuously merging code changes into a central repository, and then automatically building, testing, and deploying the application. This practice helps to identify issues early in the development process, which leads to faster feedback and faster resolution of issues.

Code repository link: https://github.com/Atryx10/ST_CI_Project


SUMMARY OF THE CONTINUOUS INTEGRATION ENVIRONMENT

Our project's CI environment consists of six distinct tools that are utilized and executed. 
These six tools are as follows: GITHUB, MAVEN,JENKINS,JUNIT,ECLIPSE/VISUAL STUDIO CODE, GITK

The six tools in our CI environment are designed to be user-friendly and easy to interpret. We have divided them into two categories: OFFLINE and ONLINE.

Eclipse, GitK, and JUnit fall under the OFFLINE user-controlled category, which means they can be operated locally without requiring an internet connection. On the other hand, Github is categorized under the ONLINE user-controlled category as it operates through the internet.

Jenkins is a versatile tool that can handle both OFFLINE and ONLINE categories as it manages the storage and execution parts of any project. It acts as a bridge between Github and Maven, which is a server controller that facilitates the loading and execution of code.

With the help of these tools, we can build and execute our project, as well as run unit and integrated tests. This ensures that our codebase is always up-to-date and stable, enabling us to catch and fix issues quickly.

Working Methodology

To initiate the CI process for our project, the first step is to create a Github account for storing the project or repository file. This allows us to collaborate with other developers on group projects by sharing and accessing resources through the Github platform. Once the Github account is created, we can import the required resources to the online storage repository of our application, such as a calculator. 
This ensures that all project resources are stored in a centralized location, making it easy for the team to access and work on them collaboratively. To ensure that the code is interpreted correctly, it is important to make sure that all resources are successfully stored in Github. 
This helps to avoid any potential issues that may arise due to code inconsistencies or conflicts between team members. Overall, using Github for project storage is a crucial part of our CI process that helps to ensure the success of our project.

To evaluate the code, it needs to be cloned and imported from the Github account. We prefer to use GitK to extract the code. With GitK, the code can be read but cannot be edited or modified. The code is then imported to a specified destination folder.

From the destination folder, it is then passed on to an Integrated Development Environment (IDE) tool such as Eclipse. The IDE tool provides a graphical user interface (GUI) to allow developers to easily navigate and modify the code.

This step is crucial for ensuring that all code changes and updates are properly tracked and documented for future reference. Overall, using GitK and Eclipse in combination is an essential part of our CI process for evaluating and modifying the code.


