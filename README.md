Project name: AtsTest

github url: https://github.com/edoardo909/AtsTest

This project was built using the Eclipse IDE for Enterprise Java Developers Version: 2019-09 R (4.13.0) and runs on a vanilla instance of apache tomcat 7 (version apache-tomcat-7.0.47).
It's a simple spring web application with a login page and a main homepage with a search bar.
I used older versions of various dependancies as these were the last versions I have worked with.
The application simply reads the data from the url "https://www.dropbox.com/s/6fg0k2wxwrheyqk/ATMs?dl=1" and presents it in a list on the homepage.
On the top of the homepage there is a search bar which can be used to filter the results on any of the present fields.

The project is composed by the following main classes/interfaces:

AtmController.java - handles the request mappings
AtmService.java - handles the background operations such as data loading and parsing
IService.java - a simple example interface
ATM.java - bean used to handle the incoming data

I have also implemented a simple login/logout feature with the help of spring security:
all urls except for the root are intercepted and redirected to the login page, unless you have the proper credentials and/or open session.
To login you may use the following credentials: 

username: admin
password: password

