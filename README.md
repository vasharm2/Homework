# Submissions
This is where you submit your code 

##How do I set up git and submit homework assignments?

Do you have git? If yes, skip 1.

1. For Windows : Download git bash - https://git-for-windows.github.io and install.
2. For Mac: open terminal and paste this command and hit enter:  ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)" && brew install git
3. For Linux: sudo apt-get install git (replace apt-get with your OS's package manager)
4. On https://github.com/CS196Illinois/Submissions, Fork the repository (top right corner) to your own Github ![alt tag](http://i.imgur.com/ZsWvoKw.png)
5. Run the following command in git bash (or terminal for Mac users): ```git clone https://github.com/[YOUR_GITHUB_USERNAME]/Submissions```. Replace [YOUR_GITHUB_USERNAME] with your username.
6. Make a new folder and name it your NETID
7. copy the files from this weeks PSet directory into the NETID folder
8. Solve the problems!!!
9. When you are ready to submit, type into console, (after making sure you are in the proper the directory) and only for the first time run: ```git remote add https://github.com/[YOUR_GITHUB_USERNAME]/submissions.git origin```
10. Following that (in the same directory), add your changes files to be staged for a commit, and commit your changes:
```git add [FILE]```
```git commit -m "PSET submission"```
11. then run ```git push origin master``` (you may need to ```git pull``` to catch up to master)
12. On github.com/[YOUR_USERNAME]/Submissions, click the button for a new pull request (on the right sidebar) 
13. To the complete the new pull request: set the base fork HEAD to cs196illinois:submissions and the head fork HEAD to [yourGithubID]:master
14. Once you are done with the pull request, PAT YOURSELF ON THE BACK!!!
15. wait for a response (either accepting or rejecting the merge). Poke your Course Assistant if it takes more than a few hours.

Repeat steps 10 through 15 for subsequent PSets!
SEE EXAMPLE ENTRY IN PS1 for SUBMISSION FORMAT!!!

#### I UNDERSTAND THAT GIT IS VERY DIFFICULT TO PICK UP INITIALLY. IF YOU HAVE ANY TROUBLE OR HAVE ANY QUESTIONS, PLEASE FEEL FREE TO REACH OUT TO ME (ARAVIND SUNDARESAN) PERSONALLY. YOU CAN REACH ME AT SUNDRSN2@ILLINOIS.EDU, OR ON FACEBOOK.
