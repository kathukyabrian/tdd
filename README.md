# Test Driven Development
- emphasizes writing automated tests before writing actual code
- also known as Test First Development
- process
    - write the tests
    - execute the tests
    - make changes to the code
    - execute the tests
- best practices
    - write small test cases which fail at the start
    - tests should be independent
    - execute tests regularly
    - test for positive and negative scenarios
    - give significance to testing

* Notes
    ```
    mvn archetype:generate -DgroupId=tech.kitucode.tdd -DartifactId=tdd -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
    ``` 