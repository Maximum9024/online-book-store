# online-book-store
 Spring boot online book store application
 
 About the Project 
 online booking store allows users to register, view books and order books
 Java Version 11
 Spring Boot Version 2.6.7
 Maven Version 3.8.4
 Postgresql version 14.2
 Git Repo:
https://github.com/Maximum9024/online-book-store.git


AWS Credentials
IAM User
Account ID : 353775009712
Username : bookstoreUser15
Password  : p+U4gbpAa0WSEa%

Database Details
Engine        : Postgresql 14.2
Instance name :onlinebookstoredb-instance.corcrb5anrmy.us-east-1.rds.amazonaws.com
username      : bookstoreuser
password      : bookstoreuser1

EC2-instance details
Instance name : ec2-3-89-105-181.compute-1.amazonaws.com
username      : ec2-user


 How to run the online  book store application
 1. log in into AWS console using IAM User provided to start the following instances
 - RDS-Databases: onlinebookstoredb-instance
 - EC2-instances: onlinebookstore-ec2
 
 2. start the online book store spring boot application
 use PUTTY to start a session on ec2-3-89-105-181.compute-1.amazonaws.com innstance
 use onlinebookstoreKePair.ppk found inside the project for authentication
 username is ec2-user
 password is not required
 
 once logged into the instance 
 use the following command to check the onlinebookstore jar file:
 ls
 
 then run the onlinebookstore jar file using the command:
  java -jar online-book-store-0.0.1-SNAPSHOT.jar
  
   
  3. accessing the api
  once the spring boot project is running the api can be accessed via:
  http://ec2-3-89-105-181.compute-1.amazonaws.com:7000/api/swagger-ui/index.html
  
   stop the onlinebookstore jar using the command:
   pkill -f 'online-book-store-0.0.1-SNAPSHOT.jar'
   
   once done accessing the api
   all running instances can be stopped.
   
  THATS ALL!!! Thank You.


