

# PUBLIC INFO

All info here can be found on datastax.academy

### Create a simple java application from maven archetype


```bash
mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=my-new-project \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false
```

## Run

```bash
mvn clean install exec:java -Dexec.mainClass=com.example.App
```