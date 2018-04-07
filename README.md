# DRYing the Pipeline
Playground to play with Jenkins Pipeline's shared library examples.

Jenkins server is preloaded with examples of shared library pipeline examples and configurations:

- steps from groovy source code.
- user defined steps.
- global variables.
- [global shared library][global-lib] configuration.
- [folder level library][folder-level-lib] configuration.

## Setup
1. `docker pull wenn/dry-pipeline:2.0.1`
2. `docker run -d -p 8080:8080 -p 50000:50000 wenn/dry-pipeline:2.0.1`
3. Log in at `localost:8080` using **admin** with password as **password**

## In the Jenkins
- Configure [global shared library][global-lib]. _Manage Jenkins_ > _Configure System_ > _Global Pipeline Libraries_.
- Configure [folder level shared library][folder-level-lib] _folder-level-library_ > _example_ > _configure_ > _Pipeline Library_.
- Examples of using shared library.
- Examples of using post actions with both scripted and declarative pipelines.

## Project layout
Read more about Jenkins pipeline shared lib [directory structure][directory-structure].

| resource | |
|:---|:---|
| _pipe.groovy_ | the scripted pipeline with all examples, aka, the _Jenkinsfile_ |
| _vars_ | shared lib's global variables are defined here. |
| _src_ | shared lib's groovy source files are defined here. |

---

[folder-level-lib]: https://jenkins.io/doc/book/pipeline/shared-libraries/#folder-level-shared-libraries
[global-lib]: https://jenkins.io/doc/book/pipeline/shared-libraries/#folder-level-shared-libraries
[directory-structure]: https://jenkins.io/doc/book/pipeline/shared-libraries/#directory-structure
