# Cucumber
1)
- TLD (Test Last Development)
- TDD (Test Driven Development)
- BDD (Behavior Driven Development)
    - Extends TDD
    - Test cases are described as behaviors of the system
    - Test case description language (Gherkin) helps other stakeholders to understand and contribute to testing
    - Increases readability
    - Increases understandability
    - Increases quality
    - Although it may increase  production cost, it decreases maintenance cost too much.
    - Fulfils the gap between non-tech abd tech people
    - Common template for test scenarios
    - Requirements coverage
### Example
Feature: Login <br>
User Story: User can log in to the system when she enters the valid credentials.

BDD Test Case In Gherkin Language: <br>
`Feature: Login`<br>
`Scenario: Login with valid credentials`<br>
`Given User is on login screen`<br>
`When User enters valid username`
`And valid password`<br>
`And Clicks on log in button`<br>
`Then She lands to dashboard page`<br>

<hr>
2) WBS (Work Breakdown Structure): In analysis phase:<br>
    - System is divided into subsystems.<br> 
    - Requirements are divided into smaller use cases.<br> 
BDD helps in three main ways:<br>
- Use cases -> Scenarios : Requirement coverage <br>
- Defining scenarios may help new use cases to emerge <br>
- Other project members to join test scenario definition phase
<hr>
3) Gherkin:<br>
Given: Precondition <br>
When: Action <br>
Then: Expected Result <br>

<strong>Download IDE plugin for Gherkin support (If there is no support)</strong>
<hr>
4) Maven dependencies for cucumber.
<hr>
5) 
<li>Cucumber Annotations
<li>Run cucumber test from IntelliJ
<hr>
6) Feature (Test Case)  <br>
      -> Scenario (Test Case Scenarios) <br> 
            -> Test Code (Step definitions) <br>  
                  -> Test Runner (specify feature files & codes)
<hr>
7) You can write step definitions using:
<li>Tidy Gherkin plugin: https://chrome.google.com/webstore/detail/tidy-gherkin/nobemmencanophcnicjhfhnjiimegjeo?hl=en-GB
<li>We can use Error output in IDE to create step definitions (It gives suggestions for step definitions)
<hr>
8) Test Runner



