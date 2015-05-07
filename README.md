bash instructions to start the service:

```
cd $(mktemp -d /tmp/tmp.XXXXXXXX);
git clone https://github.com/who/springfoxexample.git;
cd springfoxexample;
mvn clean install;
mvn exec:java;
```

After executing the above, in a new terminal window, `curl http://localhost:8081/springfoxexample/v2/api-docs`



