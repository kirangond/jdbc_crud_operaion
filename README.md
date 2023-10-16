# jdbc_crud_operaion
This repo conists of jdbc CRUD operation code


=======Github Commands=====



Oct 15 

Kirangond05@gmail.com 
Kirangond@8123159012



 - Create a new public repository
   repo name: jdbc_crud_operaion
   
   By default: master
   
   github master repo link: https://github.com/kirangond/jdbc_crud_operaion.git
   
   create eclipse workspace in C:\jdbc_project
   
   import the project in eclipse 
   
   
   git status
   
   git push origin branch_name
   
   git pull origin branch_name
   
   git fetch origin branch_name
   
   git clone url
   
   git commit -m 'commit-message'
   
   git log
   
   git show commit_id
   
   git init
   
   
gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud
$ git init
Initialized empty Git repository in C:/jdbc_project/jdbc_crud/.git/

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$

Open Eclipse.
Right-click on your project in the Project Explorer.
Select "Team" and then "Share Project..."
Choose "Git" and click "Next."

now got in eclipse 
  jdbc_crud master 
  
gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .classpath
        .gitignore
        .project
        lib/
        src/

nothing added to commit but untracked files present (use "git add" to track)


gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git add .
warning: LF will be replaced by CRLF in .gitignore.
The file will have its original line endings in your working directory

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   .classpath
        new file:   .gitignore
        new file:   .project
        new file:   lib/mysql-connector-java-8.0.29.jar
        new file:   src/com/connection/ConnectionToDB.java
        new file:   src/com/delete/DeleteRecord.java
        new file:   src/com/delete/DynamicDelete.java
        new file:   src/com/insert/DynamicInserting.java
        new file:   src/com/insert/InsertIntoDB.java
        new file:   src/com/retrieve/RetrieveRecord.java
        new file:   src/com/update/UpdateRecord.java
        new file:   src/jdbc.txt


gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git commit -m 'first time pushing all code to git repo'
[master (root-commit) 0b34d6d] first time pushing all code to git repo
 12 files changed, 607 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .gitignore
 create mode 100644 .project
 create mode 100644 lib/mysql-connector-java-8.0.29.jar
 create mode 100644 src/com/connection/ConnectionToDB.java
 create mode 100644 src/com/delete/DeleteRecord.java
 create mode 100644 src/com/delete/DynamicDelete.java
 create mode 100644 src/com/insert/DynamicInserting.java
 create mode 100644 src/com/insert/InsertIntoDB.java
 create mode 100644 src/com/retrieve/RetrieveRecord.java
 create mode 100644 src/com/update/UpdateRecord.java
 create mode 100644 src/jdbc.txt


gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git config --global user.name "kirangond"

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git config --global user.email "kirangond05@gmail.com"

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git remote add origin https://github.com/kirangond/jdbc_crud_operaion.git


gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git push -u origin master
To https://github.com/kirangond/jdbc_crud_operaion.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/kirangond/jdbc_crud_operaion.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git pull origin master
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), 636 bytes | 0 bytes/s, done.
From https://github.com/kirangond/jdbc_crud_operaion
 * branch            master     -> FETCH_HEAD
 * [new branch]      master     -> origin/master
fatal: refusing to merge unrelated histories


gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git fetch origin master
From https://github.com/kirangond/jdbc_crud_operaion
 * branch            master     -> FETCH_HEAD


gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git pull origin master
From https://github.com/kirangond/jdbc_crud_operaion
 * branch            master     -> FETCH_HEAD
fatal: refusing to merge unrelated histories

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git pull origin master --allow-unrelated-histories
From https://github.com/kirangond/jdbc_crud_operaion
 * branch            master     -> FETCH_HEAD
Merge made by the 'ort' strategy.
 README.md | 2 ++
 1 file changed, 2 insertions(+)
 create mode 100644 README.md

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git push -u origin master
Enumerating objects: 25, done.
Counting objects: 100% (25/25), done.
Delta compression using up to 4 threads
Compressing objects: 100% (20/20), done.
Writing objects: 100% (24/24), 2.27 MiB | 3.02 MiB/s, done.
Total 24 (delta 8), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (8/8), done.
To https://github.com/kirangond/jdbc_crud_operaion.git
   bb536a2..5348789  master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

able to push code to github 

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean


gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git pull origin master
From https://github.com/kirangond/jdbc_crud_operaion
 * branch            master     -> FETCH_HEAD
Already up to date.

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git add README.md

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   README.md


gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git commit -m 'added git commands in read me file'
[master 097d523] added git commands in read me file
 1 file changed, 202 insertions(+)

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git push origin master
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 2.00 KiB | 2.00 MiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/kirangond/jdbc_crud_operaion.git
   5348789..097d523  master -> master
   
===oct 16===

creating new sub branch with master branch

 code_changes_october with github UI itself
   


gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git fetch origin code_changes_october
From https://github.com/kirangond/jdbc_crud_operaion
 * branch            code_changes_october -> FETCH_HEAD
 * [new branch]      code_changes_october -> origin/code_changes_october

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git branch
* master

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (master)
$ git checkout code_changes_october
Switched to a new branch 'code_changes_october'
Branch 'code_changes_october' set up to track remote branch 'code_changes_october' from 'origin'.

gonda@LAPTOP-4UU3SGMU MINGW64 /c/jdbc_project/jdbc_crud (code_changes_october)


