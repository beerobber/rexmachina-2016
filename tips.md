- git checkout -b drew # Creates and checks out a new branch named "drew"
- git push --set-upstream origin drew # Creates the branch in github
- # Make some changes, add, commit in local branch
- # Meanwhile, the master branch at github changed
- git pull origin master # Pull any changes to master, merge in your branch
- git push origin drew # Push branch changes to github
- git checkout master # Switch back to master branch
- git checkout drew # Switch to the "drew" branch
