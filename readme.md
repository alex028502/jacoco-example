trying to include test files in coverage report

I would like to get test coverage for both the main class and the test, but
jacoco by default only gives test covegage for `src/main` and not `src/test`.

Does anybody know how to change that? (so that it gives coverage for the test
classes as well)

To try it go like this

```
mvn install
google-chrome target/site/jacoco/index.html
```

you will see something like this

![](coverage.png?raw=true)

