# Overview
A simple Java multithreading program whereby two hacker threads attempt to "guess" the password to a vault while a police officer thread counts down from 10 to 0 before "catching" the hackers.

# Details
The classes used are explained below:
1. Vault - a class modelling a vault with a password that the hackers try to guess, and a function to check if a supplied password is correct or not.
2. HackerThread - an abstract class that inherits from the Thread class to model a generic hacker thread with all common functionalities.
3. AscendingThread - a class that inherits from HackerThread and tries to "guess" the vault's password by counting from 1 to the maximum possible password.
4. DescendingThread - a class that inherits from HackerThread and tries to "guess" the vault's password by counting from the maximum possible password to 1.
5. PoliceThread - a thread that counts in seconds from 10 to 1. Models a police officer chasing the hackers. If the hackers don't find the password in 10 seconds, the police officer "catches" them.
6. Main - the main thread that sets off the challenge by creating a vault with a random password and starting off the hackers and police threads.

Adapted from a tutorial by [Michael Pogrebinsky](https://www.udemy.com/course/java-multithreading-concurrency-performance-optimization/).