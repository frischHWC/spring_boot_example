# Contribution guidelines

To contribute to this project start with cloning the repository locally with : 

    git clone <repo_url>

Also, type those git config commands before going any further : 

    git config --global core.autocrlf false
     

## Feature branch

 Checkout your project form existing `develop` branch where developments are stable.

	git checkout develop
	git pull origin develop
    git checkout -b {BRANCH_NAME}
    
When develop is really stable and able to be released, its content is pushed to master.

In case of problem on a release on master, an 'hotfix' branch is made, a fix is made there and then its merged into master and also in develop.

To learn more on GIT process, please see [these explanations on GIT workflow](http://nvie.com/posts/a-successful-git-branching-model/)
	
                
### Branch name convention

So typically you should name your branch like :

> `{SCOPE}-{SHORT_DESCRIPTION}`

example : `Mail-add_different_mails` for the issue. 


## Committing work

We have very precise rules over how our git commit messages can be formatted. 
This leads to more **readable messages** that are easy to follow when looking through 
the **project history**. But also, we use the git commit messages to automatically generate the **project change log**.


Each commit message consists of a **header**, a **body** and a **footer**.

Only the header is mandatory and has a special format that includes a **type**, a **scope** and a **subject**:
    
    <type>(<scope>): <subject>
    
Examples:

    docs(changelog): update change log to beta.5
    fix(release): need to depend on slf4j
    build(docker): add dockerize script to run image on http-server

**Type** Must be one of the following:

- **build:** Changes that affect the build system or external dependencies 
- **conf:** Changes to our CI configuration files and scripts
- **doc:** Documentation only changes
- **log:** Changes in log messages or levels, or anything about logging 
- **feat:** A new feature
- **fix:** A bug fix
- **perf:** A code change that improves performance
- **refactor:** A code change that neither fixes a bug nor adds a feature
- **test:** Adding missing tests or correcting existing tests

**Scope** Could be the feature module name or the component name if it is a shared one

**Subject** should explain what your commit made on the project


## Adding and Pushing Files
	
For your first push to one of a remote branch, please use :

    git push -u origin <branchname>
    
In order to be consitent and not push wrong files to the repository, please always make sure with a `git status`
that you are not adding wrong files to the repository.  
Do not always make a `git add -A` or `git add .` without checking ! 

Before pushing anything after a commit, make sure you are up to date with the remote branch :
 
    git pull origin <BRANCH_NAME>
    git push origin <BRANCH_NAME>
    
For the purpose of using or not `origin <BRANCH_NAME>` please see this [link](https://stackoverflow.com/questions/19312622/git-push-vs-git-push-origin-branchname)    


## What is next ?

When you finish with the contribution, make a Pull Request if necessary and stay updated to its status (maybe it will need some extrawork before merging).

If you consider working on another feature,
Retrieve your feature branch from the develop branch again,
And start all over again, working with respecting the contribution guidelines :)


## More information

- [Git documentation](https://git-scm.com/documentation)

