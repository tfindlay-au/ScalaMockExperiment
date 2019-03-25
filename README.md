# ScalaMockExperiment

### Purpose
Test using mocks in unit tests to inject predefined behaviour into a class without actually invoking dependant code.

### Overview
In this simple example, `ScalaMockExperiment` contains a method `doSomething()`

The unit test `ScalaMockExperiment` attempts to test the logic in this method but without invoking the underlying `GetMessage()` in the trait.

Normal running executes the pattern:
ScalaMockExperiment.main() -> ScalaMockExperiment.doSomething() -> MyTrait.GetMessage()

### Running
```aidl
# sbt run
Hello World
```

```aidl
# sbt test
...
[info] ScalaMockExperiment.doSomething(true)
[info] - should return Foo Bar *** FAILED ***
[info]   "[Hello World]" was not equal to "[Foo Bar]" (ScalaMockExperimentTest.scala:17)
```

### Challenge
How can I test `doSomething()` without executing the code `MyTrait.GetMessage()` ?