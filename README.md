sbt-finagle.g8
==============

A sbt project using finagle made for bench.co. Separates the thrift interface and the thrift server into two subprojects for easy publishing and deployment. 

To use:
========

    $ brew update && brew install giter8
    $ g8 jeffling/sbt-finagle
  
What you can do:
==================

Publish the interface locally  

    sbt interface/publish-local
  
Publish the interface to a maven repository  

    sbt interface/publish
  
Run the server  

    sbt server/run
  
Run a specs2 test  

    sbt server/test

Special thanks to [@jedesah](https://github.com/jedesah). We miss you come back D:
