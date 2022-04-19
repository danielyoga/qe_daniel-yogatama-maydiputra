# Introduction CI / CD

## Continuous Integration
- Practice of integrating code into shared repository
- Building and testing each change automatically as soon as possible, several ties a day
- Best Practice : Integration with version control
- Pada setiap commit, dilakukan automated test and build untuk mengetahui hasil kode
- Apabila terdapat kesalahan, kode tersebut tidak dapat diteruskan ke production

## 3 Stages in CI Pipeline
> Build > Unit Tests > Integration Test

### Qualified Code that pass CI, will be continued to CD

## Continous Delivery / Deployment
- Software can be released to prduction at any time, often by automatically pushing changes to staging system
- Code will automatically released to production

## 3 Stages in CD Pipeline
> Review > Staging > Production

## Delivery vs Deployment

### Continous Delivery
- Automatically prepare and track release to a production
- Desired outcome : anyone with sufficient privileges to deploy a new release can do so at any time in one or a few clicks. Eliminationg all manual tasks, developers become more productive

### Continous Deployment
- Every change in the source code deployed to production automatically, without explicit approval from developer as long as it pass quality controls

Continous delivery manually deploy to production, continous development automatically deploy to production


## Good CI
1.  Decoupled Stages
    Each step in CI should do single focused task
2.  Repeatable
    Automated in a way that is consistently repeatable
    Tooling should work for local developers too
3.  Fail Fast
    Fail at the firs sign of trouble

## Good CD
1.  Design with system in mind
    Cover as many parts of a deployment as possible (Application, Infrastructure, Configuration, Data)
2.  Pipelines
    Continually increase confidence as you move towards production
3.  Globally Unique versions
    Know the state of the system at any time
    Be able to demonstrate dfference between urrent and future state


# CI / CD Process
1. Commit   - Developers write codes and commit, push to repository
2. Build    - New and old code compiled together
3. Test     - Testing the apps
4. Deploy   - Running software on test/staging server, run auto test, accept code to move to production

## Benefits of CI
- Detecting bug earlier and reduces bug count
- Development process more transparent, efficient

## Benefits of CD
- Reduce risk of bugs, costs
- Painless deployment
- Automated and transparent process
- Releases more frequently

## Costs of CI
- Write automation test
- Server/Environment for automated test
- Merge code as often as possible

## Costs of CD
- Strong foundations in CI
- Need highest quality of test
- Documentation needs to be updated frequently

## CI CD Tools
- Jenkins : open source automation tool, written in Java with plugins built for continous integration, easy to install, > 1000 plugins, built on java, free of cost, automatically monitor code quality with metrics
- Gitlab CI : manages the project and user interface, allows unit test on every commit and indicates with warning message when tere is an unsuccesful build. Integrated in gitlab interface, simple usage, integrate with other tools, executed on multiple platforms, open source
- Atlassian Bamboo : CI build server to perform automatic build, test, and releases in a single place, 100 remote build agents, parallel test, create image and save to registry, ensures easy and fast functionality
- Circle CI : flecible CI tool that runs in any environment (cross platform mobile app), Python API server, Docker cluster, reduces bugs and improves quality of the application, allows to select build env, support many languages, automatically cancel any queued, integrate with vcs tools, optimal caching and parallelism, split and balance tests
- AWS Codebuild : build and test code at a continous scale, extensible, secure, integrate and delivery with automation process
- Azure Devops : planning, testing, deploying by microsoft, free, full features, support .net, fast and easy process
- Travis CI : new approach to build code in the cloud, allow user to sign up, link their repository, build, as well as test their apps, easy deployment and configuration, integrate with another tools, parallel test, support multiple languages
- Github Actions : CI CD platform to automate build, test, and deployment pipeline, hosted VM with multiple OS, CI templates, simple container and os testing, free


## Workflows
- Configurable automated process, run one/more jobs
- Defined by a YAML file in repository
- Run automatically when triggered by an event in repository
- Run manually by manual trigger or defined schedule

## Events
- Specific activity in repository, that triggers a workflow run
- Example : when someone in repository creates pull request, opens an issue, push commit

## Runners
- Server that runs workflows when triggered
- Each runner can run a single job at a time
- Gihub provides ubuntu, windows, macOs runner to run workflows

## Job
- Set of steps in a workflow, executed on the same runner
- Shell script that will be executed, an action that will be run
- Steps executed in order and dependent on each other
- Data can be shared on the same runner, between Job

## Action
- Custom application for GitHub Actions
- Performs a complex but frequently repeated task
- Help reducing repetitive code that written in workflow files