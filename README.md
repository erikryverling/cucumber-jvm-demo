Eriks guide to BDD and Cucumber
=================
This is a crash course to BDD and Cucumber based on my own experiences and opinions.


BDD
---
[_Behavior-driven development (BDD)_](http://en.wikipedia.org/wiki/Behavior-driven_development)  is a software development process based on TDD with influences from _Domain-driven design (DDD)_. BDD is used to provide a tool for collaboration between development and business teams.
BDD is also a way to combine unit and acceptance testing into one and also relates to the agile practice of writing _user stories_ by providing a way to define acceptance criteria.

Cucumber
---
[Cucumber](http://cukes.info/) is a software tool used to execute BDD specifications. To do this it uses [Gherkin](https://github.com/cucumber/cucumber/wiki/Gherkin) as formal description language. Gherkin defines a number of different artifacts. For instance:

* `Given`, `When`, `Then` keywords for specifying a prerequisite, an user action and an expected result
* `Scenario` A set of `Given`, `When`, `Then` that forms a user scenario
* `Examples` - A set of example values used in a `Scenario`
* `Feature` - A collection of `Scenario`:s related to a `Feature`

This is an example of a Gherkin feature file:

```
Feature: Elevator

  Scenario Outline: Calling the elevator when it's on the entrance floor
    Given The elevator is on the entrance floor
    When the elevator is called from the <call> floor
    Then the elevator is moved to the <destination> floor

  Examples: Floors
    | call | destination |
    | 1    | 1           |
    | 2    | 2           |
```

Getting started
---------------
* Install [Git](http://git-scm.com/), [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html), [Gradle](http://www.gradle.org/), clone the repo and then run `gradle test`
* Read more about [Cucumber JVM](https://github.com/cucumber/cucumber-jvm)
* You could also head to the [SoapUI repo](https://github.com/SmartBear/soapui/tree/next/soapui-system-test/src/test/java/com/smartbear/soapui/stepdefs) and have a look at how I implemented Cucumber JVM there.
* Have fun!

The good parts
--------------

* Great for collaboration between different rolls such as programmers, testers, designers and product owners / domain experts
* Provides a natural and collaborate way to write acceptance criteria up front
* Specifications == tests
* Like with TDD, it encourage testing upfront and could be a good way to involve testers early
* Non-programming roles can write tests
* Manual and automated tests follows the same structure (you select which scenarios to run automatically)
* Test results are very clear and understandable
* Works very well with integration and GUI tests
* Using StepDefs the speficications becomes reusable and modular

The not so good parts
---------------------
* Could be just a overhead to writing plain unit/integration tests
* A scenario always have certain degree of subjectivity and could lead to debates and misunderstandings
* Hard to know at which level the scenarios should be written
  - Too low level requires a lot of maintenance and lengthy descriptions
  - Too high level makes it hard to interpret the results
  - Often not suitible for pure integration tests
* Who's responsible to maintaining the features? Who have the time?
* Who's looking at the results?
