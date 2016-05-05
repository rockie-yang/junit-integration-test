# testng integration test example


testng can be used not only for unit test but also for integration test.

This is an example how to use testng as an integration test framework.

In this case, the project is a test project. All code are used for testing.
While we can split to two parts.

* integration test
* unit test the integration test

## unit test

All unit tests are located at directory src/test

run the following command to execute test

```bash
mvn test
```

the following two test cases are unit test

```java
class TestUnit1
class TestUnit2
```

## integration test

All integration test are located at directory src/main

run the following command to execute integration test

```bash
mvn verify
```

## add more integration test type

More integration test type can be added.

For example, smoke test, night test, weekend test

In order to add a integration test type

* Add testng configuration in src/java/resources
* Add a profile in pom.xml file. add suiteXmlFile inside the profile

after added run with following command

```bash
mvn verify -Dskip.surefire.tests
```



