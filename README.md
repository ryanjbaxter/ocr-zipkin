# ocr-zipkin
[![CircleCI](https://circleci.com/gh/ryanjbaxter/ocr-zipkin.svg?style=svg)](https://circleci.com/gh/ryanjbaxter/ocr-zipkin)

Repo for OCR Zipkin service from my [blog](http://ryanjbaxter.com).

## Running

```
$ git clone https://github.com/ryanjbaxter/ocr-zipkin
$ cd ocrzipkin
$ ./mvnw spring-boot:run
```

Alternatively you can run this application using the [image](https://hub.docker.com/r/ryanjbaxter/ocr-zipkin/) from Docker Hub.

```
$ docker run -i -p 8282:8282 ryanjbaxter/ocr-zipkin
```

## Using
Once the application is running you can go to http://localhost:9411 to see the Zipkin UI.  Tracing from the other applications
in the demo will be aggregated to this server.  For example, if you have the [OCR Races]() application running and you hit
http://localhost:8383/participants this will generate log information that will be sent to Zipkin.  You can then use
the Zipkin UI to query the information.
