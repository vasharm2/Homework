# Submissions
This is where you submit your code. We understand and accept the fact that you can see everyone else's submissions. We are not going to do anything to prevent you from cheating. Keep in mind that this is an Honors course, meant for enriching your knowledge. You gain absolutely nothing from cheating.

##How do I set up git and submit homework assignments?

Do you have git? If yes, skip to 2.

1. Get Git
    - For Windows : Download git bash - https://git-for-windows.github.io and install.
    - For Mac: open terminal and paste this command and hit enter: ```ruby -e "$(curl -fsSL         https://raw.githubusercontent.com/Homebrew/install/master/install)" && brew install git```
    - For Linux: ```sudo apt-get install git``` (replace apt-get with your OS's package manager)
2. On https://github.com/CS196Illinois/Submissions, Fork the repository (top right corner) to your own Github ![alt tag](http://i.imgur.com/ZsWvoKw.png)
3. Run the following command in git bash (or terminal for Mac and Linux users): ```git clone https://github.com/[YOUR_GITHUB_USERNAME]/Submissions```. Replace [YOUR_GITHUB_USERNAME] with your username.
4. Make a new folder and name it your NETID
5. copy the files from this weeks PSet directory into the NETID folder
    Example File structure <br />
Submissions<br />
├── PS1<br />
│   └── EXAMPLE_NETID<br />
│             ├── Anagram.java<br />
│             ├── Anagram.txt<br />
│             ├── Diagonal.java<br />
│             ├── Diagonal.txt<br />
│             ├── PS1.txt<br />
│             ├── Stairs.java<br />
│             └── Stairs.txt<br />
└── README.md<br />
    or, for example, if you were to do it in Python instead of Java: <br />
Submissions<br />
├── PS1<br />
│   └── EXAMPLE_NETID<br />
│             ├── Anagram.py<br />
│             ├── Anagram.txt<br />
│             ├── Diagonal.py<br />
│             ├── Diagonal.txt<br />
│             ├── PS1.txt<br />
│             ├── Stairs.py<br />
│             └── Stairs.txt<br />
└── README.md<br />
... etc
6. Solve the problems!!!
8. When you are ready to submit, type into console, (after making sure you are in the proper the directory) and only for the first time run: ```git remote add origin https://github.com/[YOUR_GITHUB_USERNAME]/submissions```
9. Following that (in the same directory), add your changes files to be staged for a commit, and commit your changes:
```git add [FILE]```
```git commit -m "PSET submission"```
10. then run ```git push origin master``` (you may need to ```git pull``` to catch up to master)
11. On github.com/[YOUR_USERNAME]/Submissions, click the button for a new pull request (on the right sidebar)
12. To the complete the new pull request: set the base fork HEAD to cs196illinois:submissions and the head fork HEAD to [yourGithubID]:master
13. Once you are done with the pull request, PAT YOURSELF ON THE BACK!!!
14. wait for a response (either accepting or rejecting the merge). Poke your Course Assistant if it takes more than a few hours.

Repeat steps 10 through 15 for subsequent PSets!
SEE EXAMPLE ENTRY IN PS1 for SUBMISSION FORMAT!!!

#### WE UNDERSTAND THAT GIT IS VERY DIFFICULT TO PICK UP INITIALLY. IF YOU HAVE ANY TROUBLE OR HAVE ANY QUESTIONS, PLEASE FEEL TO CONTACT YOUR CA, COME TO HACKERSPACE, OR SEND AN EMAIL TO cs196-instructors@illinois.edu, OR FIND Aravind Sundaresan (sundrsn2@illinois.edu) OR Naren Dasan (sivagna2@illinois.edu) THROUGH WHATEVER FORMAT IS MOST CONVENIENT
