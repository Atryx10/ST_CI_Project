# ST_CI_Project
Report on CI enironment setup and integration test

This study describes the creation of Continuous Integration (CI), which runs unit and integration tests automatically utilizing six different kinds of tools or components. Accurate automated test execution is made possible by the CI environment, which leads to high quality assurance.

A software development technique called continuous integration entails automatically creating, testing, and deploying the application after continuously merging code changes into a single repository. By identifying problems early on in the development process, this method facilitates quicker feedback and quicker problem-solving.

Code Repository Link: https://github.com/Atryx10/ST_CI_Project


SUMMARY OF THE CONTINUOUS INTEGRATION ENVIRONMENT

Our project's CI environment consists of six distinct tools that are utilized and executed. 
These six tools are as follows: GITHUB, MAVEN,JENKINS,JUNIT,ECLIPSE/VISUAL STUDIO CODE, GITK

The six tools in our CI environment are designed to be user-friendly and easy to interpret. We have divided them into two categories: OFFLINE and ONLINE.

Eclipse, GitK, and JUnit fall under the OFFLINE user-controlled category, which means they can be operated locally without requiring an internet connection. On the other hand, Github is categorized under the ONLINE user-controlled category as it operates through the internet.

Jenkins is a versatile tool that can handle both OFFLINE and ONLINE categories as it manages the storage and execution parts of any project. Between Github and Maven, a server controller that makes it easier to load and run code, it serves as a bridge.

Our project can be created and carried out with the aid of these tools, and unit and integrated tests can also be run. Due to the constant updating and stability of our software, we are able to identify and address problems as soon as they arise.

##Working Methodology##

The first step is to set up a Github account so that we can save the project or repository file there and start the CI process for our project. By sharing and gaining access to resources via the Github platform, this enables us to work together with other engineers on team projects. We can import the necessary resources, like a calculator, to our application's online storage repository after creating the Github account.
As a result, the team can easily access and collaborate on all project resources because they are kept in a single, convenient area. It is crucial to verify that all resources are successfully stored in Github in order to guarantee that the code is interpreted correctly.
By doing so, it is possible to prevent any prospective problems.


Diagram

To evaluate the code, it needs to be cloned and imported from the Github account. We prefer to use GitK to extract the code. With GitK, the code can be read but cannot be edited or modified. The code is then imported to a specified destination folder.

It is then transferred from the destination folder to an Integrated Development Environment (IDE) tool like Eclipse. A graphical user interface (GUI) is offered by the IDE tool to make it simple for developers to browse and edit the code.

This phase is essential for making sure that all updates and modifications to the code are correctly monitored and recorded for future use. Overall, using GitK and Eclipse in combination is an essential part of our CI process for evaluating and modifying the code.

Architecture 







Code created in the Java programming language can be read and modified using the Eclipse Integrated Development Environment (IDE). The code can only be run, though, if it has access to the necessary libraries. One such package that is frequently utilized as a framework for unit testing Java applications is JUnit.

Instead of being removed from the code repository when changes are made to the code in Eclipse, the code is automatically saved in the GitKraken version control system. The "Commit" and "Push" commands can be used to push the code to Github after it has been improved. The customized code is safely kept and made available to other users thanks to this procedure.

The Jenkins server is used to test the code and obtain expected results. The server can only receive code changes through the Maven plugins, which are provided as part of the build process. Every time the code is modified in Eclipse using JUnit, GitKraken commits and pushes the changes to Github. Jenkins then uses the Maven plugins to process the code. Before being released, the code is carefully tested and verified thanks to this procedure.

This working procedure is illustrated through the development of a calculator application.


TECHNICAL TOOL SELECTION MOTIVATING FACTORS

The technical selection of tools was quite simple. These tools saw the most use for our project when compared to other tools. Here are a few of the characteristics that we were persuaded to use in order to inspire the instruments that were chosen.


GITHUB: Java-based web applications are quite simple to run on Github. Besides Bitbucket, all Java-based web applications can be used for free. Ø As the project is familiar with Github, extracting developed code and running it was simpler than anticipated. When we make modifications to our project, it is useful to keep track of the results and the individuals that contributed to the change.

Eclipse: We required a suitable environment in order to create and run our code. As a result, we decided to use Eclipse as our development platform for editing code. Eclipse was selected mainly because our project's developers are experienced with it. The development process has become more precise and effective as a result. We were able to streamline our code editing and increase the effectiveness of our development work by using Eclipse.

Jenkins: 
We made use of Jenkins server to create a continuous integration environment that links many technologies. We were able to swiftly detect and address problems because to the diagnostic output and error notifications we were able to get from Jenkins. This made it possible for us to build and alter our project more accurately and effectively, enabling us to provide excellent outcomes on schedule.

Maven: Maven is a well-known build automation tool mainly utilized for Java applications. For the creation and administration of Java-based projects from a single repository, it offers a complete framework. By establishing a project structure, controlling dependencies, and automating the build process, Maven streamlines the development process.

Using Maven has significant benefits, one of which is the ease with which it can be connected to other programs like GitHub and Jenkins thanks to the integration of numerous plugins. Continuous integration and deployment of Java applications are made possible via the Maven plugin for Jenkins. This enables programmers to speed up and improve the build, test, and deployment processes by automating them.

Internal Discussion in the team




